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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ca.milleniummicro.audit.service.http.AuditServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ca.milleniummicro.audit.service.http.AuditServiceSoap
 * @generated
 */
@ProviderType
public class AuditSoap implements Serializable {
	public static AuditSoap toSoapModel(Audit model) {
		AuditSoap soapModel = new AuditSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAuditId(model.getAuditId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setEventType(model.getEventType());
		soapModel.setClassName(model.getClassName());
		soapModel.setClassPk(model.getClassPk());
		soapModel.setClientIp(model.getClientIp());
		soapModel.setClientHost(model.getClientHost());
		soapModel.setSessionId(model.getSessionId());
		soapModel.setServerName(model.getServerName());
		soapModel.setServerPort(model.getServerPort());
		soapModel.setField(model.getField());
		soapModel.setOldValue(model.getOldValue());
		soapModel.setNewValue(model.getNewValue());
		soapModel.setMessage(model.getMessage());
		soapModel.setAdditionalInfo(model.getAdditionalInfo());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static AuditSoap[] toSoapModels(Audit[] models) {
		AuditSoap[] soapModels = new AuditSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AuditSoap[][] toSoapModels(Audit[][] models) {
		AuditSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AuditSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AuditSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AuditSoap[] toSoapModels(List<Audit> models) {
		List<AuditSoap> soapModels = new ArrayList<AuditSoap>(models.size());

		for (Audit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AuditSoap[soapModels.size()]);
	}

	public AuditSoap() {
	}

	public long getPrimaryKey() {
		return _auditId;
	}

	public void setPrimaryKey(long pk) {
		setAuditId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAuditId() {
		return _auditId;
	}

	public void setAuditId(long auditId) {
		_auditId = auditId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getEventType() {
		return _eventType;
	}

	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	public String getClassName() {
		return _className;
	}

	public void setClassName(String className) {
		_className = className;
	}

	public long getClassPk() {
		return _classPk;
	}

	public void setClassPk(long classPk) {
		_classPk = classPk;
	}

	public String getClientIp() {
		return _clientIp;
	}

	public void setClientIp(String clientIp) {
		_clientIp = clientIp;
	}

	public String getClientHost() {
		return _clientHost;
	}

	public void setClientHost(String clientHost) {
		_clientHost = clientHost;
	}

	public String getSessionId() {
		return _sessionId;
	}

	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	public String getServerName() {
		return _serverName;
	}

	public void setServerName(String serverName) {
		_serverName = serverName;
	}

	public int getServerPort() {
		return _serverPort;
	}

	public void setServerPort(int serverPort) {
		_serverPort = serverPort;
	}

	public String getField() {
		return _field;
	}

	public void setField(String field) {
		_field = field;
	}

	public String getOldValue() {
		return _oldValue;
	}

	public void setOldValue(String oldValue) {
		_oldValue = oldValue;
	}

	public String getNewValue() {
		return _newValue;
	}

	public void setNewValue(String newValue) {
		_newValue = newValue;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public String getAdditionalInfo() {
		return _additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		_additionalInfo = additionalInfo;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _auditId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private String _eventType;
	private String _className;
	private long _classPk;
	private String _clientIp;
	private String _clientHost;
	private String _sessionId;
	private String _serverName;
	private int _serverPort;
	private String _field;
	private String _oldValue;
	private String _newValue;
	private String _message;
	private String _additionalInfo;
	private Date _createDate;
	private Date _modifiedDate;
}