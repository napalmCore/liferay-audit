package ca.milleniummicro.audit.actions;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

@Component(
    immediate = true,
    service = ModelListener.class
)
public class UserModelListner extends BaseModelListener<User> {
	@Override
	public void onAfterCreate(User user) {
		try {
			ModelAuditBehavior.auditOnCreate(user);
		} catch (PortalException e) {
			_log.fatal(e);
		}
	}

	@Override
	public void onAfterRemove(User user) {
		try {
			ModelAuditBehavior.auditOnRemove(user);
		} catch (PortalException e) {
			_log.fatal(e);
		}
	}

	@Override
	public void onBeforeUpdate(User user) {
		User oldUser = null;
		try {
			oldUser = UserLocalServiceUtil.getUser(user.getUserId());
			ModelAuditBehavior.auditOnBeforeUpdate(user, oldUser);
		}
		catch (PortalException e) {
			_log.fatal(e);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(UserModelListner.class);
}
