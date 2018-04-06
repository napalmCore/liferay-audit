package ca.milleniummicro.audit.actions;

import java.util.Map;
import java.util.Set;

import com.liferay.portal.kernel.audit.AuditRouterUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import ca.milleniummicro.audit.constants.EventTypes;
import ca.milleniummicro.audit.router.ModelAuditMessage;

public class ModelAuditBehavior {

	public static void auditOnCreate(BaseModel<?> model) throws PortalException {
		audit(EventTypes.ADD, model, null, null, null);
	}

	public static void auditOnRemove(BaseModel<?> model) throws PortalException {
		audit(EventTypes.DELETE, model, null, null, null);
	}

	private static void audit(
		String event,
		BaseModel<?> model,
		String field,
		Object oldValue,
		Object newValue
	) throws PortalException {
		long currentUserId = ServiceContextThreadLocal.getServiceContext().getUserId();
		User currentUser = UserLocalServiceUtil.getUser(currentUserId);
		ModelAuditMessage auditMessage = new ModelAuditMessage(
			event,
			currentUser.getCompanyId(),
			currentUser.getUserId(),
			currentUser.getFullName(),
			model.getModelClassName(),
			String.valueOf(model.getPrimaryKeyObj()),
			field,
			oldValue,
			newValue
		);

		AuditRouterUtil.route(auditMessage);
	}

	public static void auditOnBeforeUpdate(BaseModel<?> newModel, BaseModel<?> oldModel) throws PortalException {

		Map<String, Object> newModelProperties = newModel.getModelAttributes();
		Map<String, Object> oldModelProperties = oldModel.getModelAttributes();
		Set<String> keys = newModelProperties.keySet();
		for (String key : keys) {
			Object oldValue = oldModelProperties.get(key);
			Object newValue = newModelProperties.get(key);
			if (newValue != null) {
				if (!newValue.equals(oldValue)) {
					audit(EventTypes.UPDATE, newModel, key, oldValue, newValue);
				}
			} else {
				if (newValue != oldValue) {
					audit(EventTypes.UPDATE, newModel, key, oldValue, newValue);
				}
			}
		}

	}

	private static final Log _log = LogFactoryUtil.getLog(ModelAuditBehavior.class);
}
