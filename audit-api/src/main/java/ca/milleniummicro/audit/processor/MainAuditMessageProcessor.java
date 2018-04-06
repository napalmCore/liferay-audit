package ca.milleniummicro.audit.processor;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.audit.AuditMessage;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.security.audit.AuditMessageProcessor;

import ca.milleniummicro.audit.constants.EventTypes;
import ca.milleniummicro.audit.model.Audit;
import ca.milleniummicro.audit.router.ModelAuditMessage;
import ca.milleniummicro.audit.service.AuditLocalServiceUtil;

@Component(
	immediate = true,
	property = "eventTypes=" + EventTypes.LOGIN + "," +
			EventTypes.LOGIN_FAILURE + "," +
			EventTypes.LOGOUT + "," + EventTypes.ADD + "," +
			EventTypes.UPDATE + "," + EventTypes.DELETE,
	service = AuditMessageProcessor.class
)
public class MainAuditMessageProcessor implements AuditMessageProcessor {

	@Override
	public void process(AuditMessage auditMessage) {
		try {
			doProcess(auditMessage);
		}
		catch (Exception e) {
			_log.fatal("Unable to process audit message " + auditMessage, e);
		}
	}

	protected void doProcess(AuditMessage auditMessage) throws Exception {
		if (_log.isInfoEnabled()) {
			_log.info(
				"Audit Message MainProcessor " + auditMessage.getEventType() + " => " +
				auditMessage.toJSONObject());
		}
		long auditId = CounterLocalServiceUtil.increment(Audit.class.getName());
		Audit audit = AuditLocalServiceUtil.createAudit(auditId);
		audit.setClientIp(auditMessage.getClientIP());
		audit.setClientHost(auditMessage.getClientIP());
		audit.setCompanyId(auditMessage.getCompanyId());
		audit.setUserId(auditMessage.getUserId());
		audit.setUserName(auditMessage.getUserName());
		audit.setEventType(auditMessage.getEventType());
		audit.setClassName(auditMessage.getClassName());
		audit.setClassPk(Long.valueOf(auditMessage.getClassPK()));
		audit.setSessionId(auditMessage.getSessionID());
		audit.setServerName(auditMessage.getServerName());
		audit.setServerPort(auditMessage.getServerPort());
		audit.setMessage(auditMessage.getMessage());
		if (auditMessage.getAdditionalInfo() != null) {
			audit.setAdditionalInfo(auditMessage.getAdditionalInfo().toJSONString());
		}
		if (auditMessage instanceof ModelAuditMessage) {
			ModelAuditMessage ModelauditMessage = (ModelAuditMessage) auditMessage;
			audit.setField(ModelauditMessage.getField());
			Object oldValue = ModelauditMessage.getOldValue();
			if (oldValue != null) {
				audit.setOldValue(oldValue.toString());
			}
			Object newValue = ModelauditMessage.getNewValue();
			if (newValue != null) {
				audit.setNewValue(newValue.toString());
			}
		}
		AuditLocalServiceUtil.addAudit(audit);
	}

	private static final Log _log = LogFactoryUtil.getLog(MainAuditMessageProcessor.class);
}