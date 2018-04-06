package ca.milleniummicro.audit.router;

import com.liferay.portal.kernel.audit.AuditMessage;
import com.liferay.portal.kernel.json.JSONException;

public class ModelAuditMessage extends AuditMessage{

	String field;
	Object oldValue;
	Object newValue;

	public ModelAuditMessage(String message) throws JSONException {

		super(message);
	}
	public ModelAuditMessage(
		String eventType, long companyId, long userId, String userName,
		String className, String classPK, String field,
		Object oldValue, Object newValue) throws JSONException {


		super(
			eventType, companyId, userId, userName, className, classPK, null,
			null, null);
		this.setField(field);
		this.setOldValue(oldValue);
		this.setNewValue(newValue);
	}

	public String getField() {

		return field;
	}

	public void setField(String field) {

		this.field = field;
	}

	public Object getOldValue() {

		return oldValue;
	}

	public void setOldValue(Object oldValue) {

		this.oldValue = oldValue;
	}

	public Object getNewValue() {

		return newValue;
	}

	public void setNewValue(Object newValue) {

		this.newValue = newValue;
	}


}
