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

package ca.milleniummicro.audit.model.impl;

import aQute.bnd.annotation.ProviderType;

import ca.milleniummicro.audit.model.Audit;
import ca.milleniummicro.audit.model.AuditModel;
import ca.milleniummicro.audit.model.AuditSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Audit service. Represents a row in the &quot;AUDIT_Audit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AuditModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuditImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuditImpl
 * @see Audit
 * @see AuditModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AuditModelImpl extends BaseModelImpl<Audit> implements AuditModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a audit model instance should use the {@link Audit} interface instead.
	 */
	public static final String TABLE_NAME = "AUDIT_Audit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "auditId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "eventType", Types.VARCHAR },
			{ "className", Types.VARCHAR },
			{ "classPk", Types.BIGINT },
			{ "clientIp", Types.VARCHAR },
			{ "clientHost", Types.VARCHAR },
			{ "sessionId", Types.VARCHAR },
			{ "serverName", Types.VARCHAR },
			{ "serverPort", Types.INTEGER },
			{ "field", Types.VARCHAR },
			{ "oldValue", Types.CLOB },
			{ "newValue", Types.CLOB },
			{ "message", Types.VARCHAR },
			{ "additionalInfo", Types.CLOB },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("auditId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("eventType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("className", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("classPk", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("clientIp", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("clientHost", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sessionId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serverName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serverPort", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("field", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("oldValue", Types.CLOB);
		TABLE_COLUMNS_MAP.put("newValue", Types.CLOB);
		TABLE_COLUMNS_MAP.put("message", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("additionalInfo", Types.CLOB);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table AUDIT_Audit (uuid_ VARCHAR(75) null,auditId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,eventType VARCHAR(75) null,className VARCHAR(75) null,classPk LONG,clientIp VARCHAR(75) null,clientHost VARCHAR(75) null,sessionId VARCHAR(75) null,serverName VARCHAR(75) null,serverPort INTEGER,field VARCHAR(75) null,oldValue TEXT null,newValue TEXT null,message VARCHAR(500) null,additionalInfo TEXT null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table AUDIT_Audit";
	public static final String ORDER_BY_JPQL = " ORDER BY audit.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY AUDIT_Audit.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ca.milleniummicro.audit.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ca.milleniummicro.audit.model.Audit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ca.milleniummicro.audit.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ca.milleniummicro.audit.model.Audit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ca.milleniummicro.audit.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.ca.milleniummicro.audit.model.Audit"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long CREATEDATE_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Audit toModel(AuditSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Audit model = new AuditImpl();

		model.setUuid(soapModel.getUuid());
		model.setAuditId(soapModel.getAuditId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setEventType(soapModel.getEventType());
		model.setClassName(soapModel.getClassName());
		model.setClassPk(soapModel.getClassPk());
		model.setClientIp(soapModel.getClientIp());
		model.setClientHost(soapModel.getClientHost());
		model.setSessionId(soapModel.getSessionId());
		model.setServerName(soapModel.getServerName());
		model.setServerPort(soapModel.getServerPort());
		model.setField(soapModel.getField());
		model.setOldValue(soapModel.getOldValue());
		model.setNewValue(soapModel.getNewValue());
		model.setMessage(soapModel.getMessage());
		model.setAdditionalInfo(soapModel.getAdditionalInfo());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Audit> toModels(AuditSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Audit> models = new ArrayList<Audit>(soapModels.length);

		for (AuditSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ca.milleniummicro.audit.service.util.ServiceProps.get(
				"lock.expiration.time.ca.milleniummicro.audit.model.Audit"));

	public AuditModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _auditId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAuditId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _auditId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getAuditId() {
		return _auditId;
	}

	@Override
	public void setAuditId(long auditId) {
		_auditId = auditId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public String getEventType() {
		if (_eventType == null) {
			return StringPool.BLANK;
		}
		else {
			return _eventType;
		}
	}

	@Override
	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	@JSON
	@Override
	public String getClassName() {
		if (_className == null) {
			return StringPool.BLANK;
		}
		else {
			return _className;
		}
	}

	@Override
	public void setClassName(String className) {
		_className = className;
	}

	@JSON
	@Override
	public long getClassPk() {
		return _classPk;
	}

	@Override
	public void setClassPk(long classPk) {
		_classPk = classPk;
	}

	@JSON
	@Override
	public String getClientIp() {
		if (_clientIp == null) {
			return StringPool.BLANK;
		}
		else {
			return _clientIp;
		}
	}

	@Override
	public void setClientIp(String clientIp) {
		_clientIp = clientIp;
	}

	@JSON
	@Override
	public String getClientHost() {
		if (_clientHost == null) {
			return StringPool.BLANK;
		}
		else {
			return _clientHost;
		}
	}

	@Override
	public void setClientHost(String clientHost) {
		_clientHost = clientHost;
	}

	@JSON
	@Override
	public String getSessionId() {
		if (_sessionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _sessionId;
		}
	}

	@Override
	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	@JSON
	@Override
	public String getServerName() {
		if (_serverName == null) {
			return StringPool.BLANK;
		}
		else {
			return _serverName;
		}
	}

	@Override
	public void setServerName(String serverName) {
		_serverName = serverName;
	}

	@JSON
	@Override
	public int getServerPort() {
		return _serverPort;
	}

	@Override
	public void setServerPort(int serverPort) {
		_serverPort = serverPort;
	}

	@JSON
	@Override
	public String getField() {
		if (_field == null) {
			return StringPool.BLANK;
		}
		else {
			return _field;
		}
	}

	@Override
	public void setField(String field) {
		_field = field;
	}

	@JSON
	@Override
	public String getOldValue() {
		if (_oldValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _oldValue;
		}
	}

	@Override
	public void setOldValue(String oldValue) {
		_oldValue = oldValue;
	}

	@JSON
	@Override
	public String getNewValue() {
		if (_newValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _newValue;
		}
	}

	@Override
	public void setNewValue(String newValue) {
		_newValue = newValue;
	}

	@JSON
	@Override
	public String getMessage() {
		if (_message == null) {
			return StringPool.BLANK;
		}
		else {
			return _message;
		}
	}

	@Override
	public void setMessage(String message) {
		_message = message;
	}

	@JSON
	@Override
	public String getAdditionalInfo() {
		if (_additionalInfo == null) {
			return StringPool.BLANK;
		}
		else {
			return _additionalInfo;
		}
	}

	@Override
	public void setAdditionalInfo(String additionalInfo) {
		_additionalInfo = additionalInfo;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Audit.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Audit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Audit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Audit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AuditImpl auditImpl = new AuditImpl();

		auditImpl.setUuid(getUuid());
		auditImpl.setAuditId(getAuditId());
		auditImpl.setGroupId(getGroupId());
		auditImpl.setCompanyId(getCompanyId());
		auditImpl.setUserId(getUserId());
		auditImpl.setUserName(getUserName());
		auditImpl.setEventType(getEventType());
		auditImpl.setClassName(getClassName());
		auditImpl.setClassPk(getClassPk());
		auditImpl.setClientIp(getClientIp());
		auditImpl.setClientHost(getClientHost());
		auditImpl.setSessionId(getSessionId());
		auditImpl.setServerName(getServerName());
		auditImpl.setServerPort(getServerPort());
		auditImpl.setField(getField());
		auditImpl.setOldValue(getOldValue());
		auditImpl.setNewValue(getNewValue());
		auditImpl.setMessage(getMessage());
		auditImpl.setAdditionalInfo(getAdditionalInfo());
		auditImpl.setCreateDate(getCreateDate());
		auditImpl.setModifiedDate(getModifiedDate());

		auditImpl.resetOriginalValues();

		return auditImpl;
	}

	@Override
	public int compareTo(Audit audit) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), audit.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Audit)) {
			return false;
		}

		Audit audit = (Audit)obj;

		long primaryKey = audit.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AuditModelImpl auditModelImpl = this;

		auditModelImpl._originalUuid = auditModelImpl._uuid;

		auditModelImpl._originalGroupId = auditModelImpl._groupId;

		auditModelImpl._setOriginalGroupId = false;

		auditModelImpl._originalCompanyId = auditModelImpl._companyId;

		auditModelImpl._setOriginalCompanyId = false;

		auditModelImpl._setModifiedDate = false;

		auditModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Audit> toCacheModel() {
		AuditCacheModel auditCacheModel = new AuditCacheModel();

		auditCacheModel.uuid = getUuid();

		String uuid = auditCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			auditCacheModel.uuid = null;
		}

		auditCacheModel.auditId = getAuditId();

		auditCacheModel.groupId = getGroupId();

		auditCacheModel.companyId = getCompanyId();

		auditCacheModel.userId = getUserId();

		auditCacheModel.userName = getUserName();

		String userName = auditCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			auditCacheModel.userName = null;
		}

		auditCacheModel.eventType = getEventType();

		String eventType = auditCacheModel.eventType;

		if ((eventType != null) && (eventType.length() == 0)) {
			auditCacheModel.eventType = null;
		}

		auditCacheModel.className = getClassName();

		String className = auditCacheModel.className;

		if ((className != null) && (className.length() == 0)) {
			auditCacheModel.className = null;
		}

		auditCacheModel.classPk = getClassPk();

		auditCacheModel.clientIp = getClientIp();

		String clientIp = auditCacheModel.clientIp;

		if ((clientIp != null) && (clientIp.length() == 0)) {
			auditCacheModel.clientIp = null;
		}

		auditCacheModel.clientHost = getClientHost();

		String clientHost = auditCacheModel.clientHost;

		if ((clientHost != null) && (clientHost.length() == 0)) {
			auditCacheModel.clientHost = null;
		}

		auditCacheModel.sessionId = getSessionId();

		String sessionId = auditCacheModel.sessionId;

		if ((sessionId != null) && (sessionId.length() == 0)) {
			auditCacheModel.sessionId = null;
		}

		auditCacheModel.serverName = getServerName();

		String serverName = auditCacheModel.serverName;

		if ((serverName != null) && (serverName.length() == 0)) {
			auditCacheModel.serverName = null;
		}

		auditCacheModel.serverPort = getServerPort();

		auditCacheModel.field = getField();

		String field = auditCacheModel.field;

		if ((field != null) && (field.length() == 0)) {
			auditCacheModel.field = null;
		}

		auditCacheModel.oldValue = getOldValue();

		String oldValue = auditCacheModel.oldValue;

		if ((oldValue != null) && (oldValue.length() == 0)) {
			auditCacheModel.oldValue = null;
		}

		auditCacheModel.newValue = getNewValue();

		String newValue = auditCacheModel.newValue;

		if ((newValue != null) && (newValue.length() == 0)) {
			auditCacheModel.newValue = null;
		}

		auditCacheModel.message = getMessage();

		String message = auditCacheModel.message;

		if ((message != null) && (message.length() == 0)) {
			auditCacheModel.message = null;
		}

		auditCacheModel.additionalInfo = getAdditionalInfo();

		String additionalInfo = auditCacheModel.additionalInfo;

		if ((additionalInfo != null) && (additionalInfo.length() == 0)) {
			auditCacheModel.additionalInfo = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			auditCacheModel.createDate = createDate.getTime();
		}
		else {
			auditCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			auditCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			auditCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return auditCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", auditId=");
		sb.append(getAuditId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", eventType=");
		sb.append(getEventType());
		sb.append(", className=");
		sb.append(getClassName());
		sb.append(", classPk=");
		sb.append(getClassPk());
		sb.append(", clientIp=");
		sb.append(getClientIp());
		sb.append(", clientHost=");
		sb.append(getClientHost());
		sb.append(", sessionId=");
		sb.append(getSessionId());
		sb.append(", serverName=");
		sb.append(getServerName());
		sb.append(", serverPort=");
		sb.append(getServerPort());
		sb.append(", field=");
		sb.append(getField());
		sb.append(", oldValue=");
		sb.append(getOldValue());
		sb.append(", newValue=");
		sb.append(getNewValue());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", additionalInfo=");
		sb.append(getAdditionalInfo());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("ca.milleniummicro.audit.model.Audit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>auditId</column-name><column-value><![CDATA[");
		sb.append(getAuditId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventType</column-name><column-value><![CDATA[");
		sb.append(getEventType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>className</column-name><column-value><![CDATA[");
		sb.append(getClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPk</column-name><column-value><![CDATA[");
		sb.append(getClassPk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clientIp</column-name><column-value><![CDATA[");
		sb.append(getClientIp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clientHost</column-name><column-value><![CDATA[");
		sb.append(getClientHost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sessionId</column-name><column-value><![CDATA[");
		sb.append(getSessionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serverName</column-name><column-value><![CDATA[");
		sb.append(getServerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serverPort</column-name><column-value><![CDATA[");
		sb.append(getServerPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field</column-name><column-value><![CDATA[");
		sb.append(getField());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldValue</column-name><column-value><![CDATA[");
		sb.append(getOldValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newValue</column-name><column-value><![CDATA[");
		sb.append(getNewValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalInfo</column-name><column-value><![CDATA[");
		sb.append(getAdditionalInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Audit.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Audit.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _auditId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
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
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Audit _escapedModel;
}