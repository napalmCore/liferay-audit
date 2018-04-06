/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ca.milleniummicro.audit.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Audit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Audit
 * @generated
 */
@ProviderType
public class AuditWrapper implements Audit, ModelWrapper<Audit> {
	public AuditWrapper(Audit audit) {
		_audit = audit;
	}

	@Override
	public Class<?> getModelClass() {
		return Audit.class;
	}

	@Override
	public String getModelClassName() {
		return Audit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("auditId", getAuditId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("eventType", getEventType());
		attributes.put("className", getClassName());
		attributes.put("classPk", getClassPk());
		attributes.put("clientIp", getClientIp());
		attributes.put("clientHost", getClientHost());
		attributes.put("sessionId", getSessionId());
		attributes.put("serverName", getServerName());
		attributes.put("serverPort", getServerPort());
		attributes.put("field", getField());
		attributes.put("oldValue", getOldValue());
		attributes.put("newValue", getNewValue());
		attributes.put("message", getMessage());
		attributes.put("additionalInfo", getAdditionalInfo());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long auditId = (Long)attributes.get("auditId");

		if (auditId != null) {
			setAuditId(auditId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		Long classPk = (Long)attributes.get("classPk");

		if (classPk != null) {
			setClassPk(classPk);
		}

		String clientIp = (String)attributes.get("clientIp");

		if (clientIp != null) {
			setClientIp(clientIp);
		}

		String clientHost = (String)attributes.get("clientHost");

		if (clientHost != null) {
			setClientHost(clientHost);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String serverName = (String)attributes.get("serverName");

		if (serverName != null) {
			setServerName(serverName);
		}

		Integer serverPort = (Integer)attributes.get("serverPort");

		if (serverPort != null) {
			setServerPort(serverPort);
		}

		String field = (String)attributes.get("field");

		if (field != null) {
			setField(field);
		}

		String oldValue = (String)attributes.get("oldValue");

		if (oldValue != null) {
			setOldValue(oldValue);
		}

		String newValue = (String)attributes.get("newValue");

		if (newValue != null) {
			setNewValue(newValue);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		String additionalInfo = (String)attributes.get("additionalInfo");

		if (additionalInfo != null) {
			setAdditionalInfo(additionalInfo);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _audit.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _audit.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _audit.isNew();
	}

	@Override
	public ca.milleniummicro.audit.model.Audit toEscapedModel() {
		return new AuditWrapper(_audit.toEscapedModel());
	}

	@Override
	public ca.milleniummicro.audit.model.Audit toUnescapedModel() {
		return new AuditWrapper(_audit.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _audit.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ca.milleniummicro.audit.model.Audit> toCacheModel() {
		return _audit.toCacheModel();
	}

	@Override
	public int compareTo(ca.milleniummicro.audit.model.Audit audit) {
		return _audit.compareTo(audit);
	}

	/**
	* Returns the server port of this audit.
	*
	* @return the server port of this audit
	*/
	@Override
	public int getServerPort() {
		return _audit.getServerPort();
	}

	@Override
	public int hashCode() {
		return _audit.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _audit.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AuditWrapper((Audit)_audit.clone());
	}

	/**
	* Returns the additional info of this audit.
	*
	* @return the additional info of this audit
	*/
	@Override
	public java.lang.String getAdditionalInfo() {
		return _audit.getAdditionalInfo();
	}

	/**
	* Returns the class name of this audit.
	*
	* @return the class name of this audit
	*/
	@Override
	public java.lang.String getClassName() {
		return _audit.getClassName();
	}

	/**
	* Returns the client host of this audit.
	*
	* @return the client host of this audit
	*/
	@Override
	public java.lang.String getClientHost() {
		return _audit.getClientHost();
	}

	/**
	* Returns the client ip of this audit.
	*
	* @return the client ip of this audit
	*/
	@Override
	public java.lang.String getClientIp() {
		return _audit.getClientIp();
	}

	/**
	* Returns the event type of this audit.
	*
	* @return the event type of this audit
	*/
	@Override
	public java.lang.String getEventType() {
		return _audit.getEventType();
	}

	/**
	* Returns the field of this audit.
	*
	* @return the field of this audit
	*/
	@Override
	public java.lang.String getField() {
		return _audit.getField();
	}

	/**
	* Returns the message of this audit.
	*
	* @return the message of this audit
	*/
	@Override
	public java.lang.String getMessage() {
		return _audit.getMessage();
	}

	/**
	* Returns the new value of this audit.
	*
	* @return the new value of this audit
	*/
	@Override
	public java.lang.String getNewValue() {
		return _audit.getNewValue();
	}

	/**
	* Returns the old value of this audit.
	*
	* @return the old value of this audit
	*/
	@Override
	public java.lang.String getOldValue() {
		return _audit.getOldValue();
	}

	/**
	* Returns the server name of this audit.
	*
	* @return the server name of this audit
	*/
	@Override
	public java.lang.String getServerName() {
		return _audit.getServerName();
	}

	/**
	* Returns the session ID of this audit.
	*
	* @return the session ID of this audit
	*/
	@Override
	public java.lang.String getSessionId() {
		return _audit.getSessionId();
	}

	/**
	* Returns the user name of this audit.
	*
	* @return the user name of this audit
	*/
	@Override
	public java.lang.String getUserName() {
		return _audit.getUserName();
	}

	/**
	* Returns the user uuid of this audit.
	*
	* @return the user uuid of this audit
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _audit.getUserUuid();
	}

	/**
	* Returns the uuid of this audit.
	*
	* @return the uuid of this audit
	*/
	@Override
	public java.lang.String getUuid() {
		return _audit.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _audit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _audit.toXmlString();
	}

	/**
	* Returns the create date of this audit.
	*
	* @return the create date of this audit
	*/
	@Override
	public Date getCreateDate() {
		return _audit.getCreateDate();
	}

	/**
	* Returns the modified date of this audit.
	*
	* @return the modified date of this audit
	*/
	@Override
	public Date getModifiedDate() {
		return _audit.getModifiedDate();
	}

	/**
	* Returns the audit ID of this audit.
	*
	* @return the audit ID of this audit
	*/
	@Override
	public long getAuditId() {
		return _audit.getAuditId();
	}

	/**
	* Returns the class pk of this audit.
	*
	* @return the class pk of this audit
	*/
	@Override
	public long getClassPk() {
		return _audit.getClassPk();
	}

	/**
	* Returns the company ID of this audit.
	*
	* @return the company ID of this audit
	*/
	@Override
	public long getCompanyId() {
		return _audit.getCompanyId();
	}

	/**
	* Returns the group ID of this audit.
	*
	* @return the group ID of this audit
	*/
	@Override
	public long getGroupId() {
		return _audit.getGroupId();
	}

	/**
	* Returns the primary key of this audit.
	*
	* @return the primary key of this audit
	*/
	@Override
	public long getPrimaryKey() {
		return _audit.getPrimaryKey();
	}

	/**
	* Returns the user ID of this audit.
	*
	* @return the user ID of this audit
	*/
	@Override
	public long getUserId() {
		return _audit.getUserId();
	}

	@Override
	public void persist() {
		_audit.persist();
	}

	/**
	* Sets the additional info of this audit.
	*
	* @param additionalInfo the additional info of this audit
	*/
	@Override
	public void setAdditionalInfo(java.lang.String additionalInfo) {
		_audit.setAdditionalInfo(additionalInfo);
	}

	/**
	* Sets the audit ID of this audit.
	*
	* @param auditId the audit ID of this audit
	*/
	@Override
	public void setAuditId(long auditId) {
		_audit.setAuditId(auditId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_audit.setCachedModel(cachedModel);
	}

	/**
	* Sets the class name of this audit.
	*
	* @param className the class name of this audit
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_audit.setClassName(className);
	}

	/**
	* Sets the class pk of this audit.
	*
	* @param classPk the class pk of this audit
	*/
	@Override
	public void setClassPk(long classPk) {
		_audit.setClassPk(classPk);
	}

	/**
	* Sets the client host of this audit.
	*
	* @param clientHost the client host of this audit
	*/
	@Override
	public void setClientHost(java.lang.String clientHost) {
		_audit.setClientHost(clientHost);
	}

	/**
	* Sets the client ip of this audit.
	*
	* @param clientIp the client ip of this audit
	*/
	@Override
	public void setClientIp(java.lang.String clientIp) {
		_audit.setClientIp(clientIp);
	}

	/**
	* Sets the company ID of this audit.
	*
	* @param companyId the company ID of this audit
	*/
	@Override
	public void setCompanyId(long companyId) {
		_audit.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this audit.
	*
	* @param createDate the create date of this audit
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_audit.setCreateDate(createDate);
	}

	/**
	* Sets the event type of this audit.
	*
	* @param eventType the event type of this audit
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_audit.setEventType(eventType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_audit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_audit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_audit.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field of this audit.
	*
	* @param field the field of this audit
	*/
	@Override
	public void setField(java.lang.String field) {
		_audit.setField(field);
	}

	/**
	* Sets the group ID of this audit.
	*
	* @param groupId the group ID of this audit
	*/
	@Override
	public void setGroupId(long groupId) {
		_audit.setGroupId(groupId);
	}

	/**
	* Sets the message of this audit.
	*
	* @param message the message of this audit
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_audit.setMessage(message);
	}

	/**
	* Sets the modified date of this audit.
	*
	* @param modifiedDate the modified date of this audit
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_audit.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_audit.setNew(n);
	}

	/**
	* Sets the new value of this audit.
	*
	* @param newValue the new value of this audit
	*/
	@Override
	public void setNewValue(java.lang.String newValue) {
		_audit.setNewValue(newValue);
	}

	/**
	* Sets the old value of this audit.
	*
	* @param oldValue the old value of this audit
	*/
	@Override
	public void setOldValue(java.lang.String oldValue) {
		_audit.setOldValue(oldValue);
	}

	/**
	* Sets the primary key of this audit.
	*
	* @param primaryKey the primary key of this audit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_audit.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_audit.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the server name of this audit.
	*
	* @param serverName the server name of this audit
	*/
	@Override
	public void setServerName(java.lang.String serverName) {
		_audit.setServerName(serverName);
	}

	/**
	* Sets the server port of this audit.
	*
	* @param serverPort the server port of this audit
	*/
	@Override
	public void setServerPort(int serverPort) {
		_audit.setServerPort(serverPort);
	}

	/**
	* Sets the session ID of this audit.
	*
	* @param sessionId the session ID of this audit
	*/
	@Override
	public void setSessionId(java.lang.String sessionId) {
		_audit.setSessionId(sessionId);
	}

	/**
	* Sets the user ID of this audit.
	*
	* @param userId the user ID of this audit
	*/
	@Override
	public void setUserId(long userId) {
		_audit.setUserId(userId);
	}

	/**
	* Sets the user name of this audit.
	*
	* @param userName the user name of this audit
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_audit.setUserName(userName);
	}

	/**
	* Sets the user uuid of this audit.
	*
	* @param userUuid the user uuid of this audit
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_audit.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this audit.
	*
	* @param uuid the uuid of this audit
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_audit.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuditWrapper)) {
			return false;
		}

		AuditWrapper auditWrapper = (AuditWrapper)obj;

		if (Objects.equals(_audit, auditWrapper._audit)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _audit.getStagedModelType();
	}

	@Override
	public Audit getWrappedModel() {
		return _audit;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _audit.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _audit.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_audit.resetOriginalValues();
	}

	private final Audit _audit;
}