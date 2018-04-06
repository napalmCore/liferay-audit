package ca.milleniummicro.audit.actions;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ContactLocalServiceUtil;

@Component(
    immediate = true,
    service = ModelListener.class
)
public class ContactModelListner extends BaseModelListener<Contact> {
	@Override
	public void onAfterCreate(Contact contact) {
		try {
			ModelAuditBehavior.auditOnCreate(contact);
		} catch (PortalException e) {
			_log.fatal(e);
		}
	}

	@Override
	public void onAfterRemove(Contact contact) {
		try {
			ModelAuditBehavior.auditOnRemove(contact);
		} catch (PortalException e) {
			_log.fatal(e);
		}
	}

	@Override
	public void onBeforeUpdate(Contact contact) {
		Contact oldContact = null;
		try {
			oldContact = ContactLocalServiceUtil.getContact(contact.getContactId());
			ModelAuditBehavior.auditOnBeforeUpdate(contact, oldContact);
		}
		catch (PortalException e) {
			_log.fatal(e);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(ContactModelListner.class);
}
