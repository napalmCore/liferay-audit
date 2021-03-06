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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Audit service. Represents a row in the &quot;AUDIT_Audit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ca.milleniummicro.audit.model.impl.AuditModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ca.milleniummicro.audit.model.impl.AuditImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Audit
 * @see ca.milleniummicro.audit.model.impl.AuditImpl
 * @see ca.milleniummicro.audit.model.impl.AuditModelImpl
 * @generated
 */
@ProviderType
public interface AuditModel extends BaseModel<Audit>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a audit model instance should use the {@link Audit} interface instead.
	 */

	/**
	 * Returns the primary key of this audit.
	 *
	 * @return the primary key of this audit
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this audit.
	 *
	 * @param primaryKey the primary key of this audit
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this audit.
	 *
	 * @return the uuid of this audit
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this audit.
	 *
	 * @param uuid the uuid of this audit
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the audit ID of this audit.
	 *
	 * @return the audit ID of this audit
	 */
	public long getAuditId();

	/**
	 * Sets the audit ID of this audit.
	 *
	 * @param auditId the audit ID of this audit
	 */
	public void setAuditId(long auditId);

	/**
	 * Returns the group ID of this audit.
	 *
	 * @return the group ID of this audit
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this audit.
	 *
	 * @param groupId the group ID of this audit
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this audit.
	 *
	 * @return the company ID of this audit
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this audit.
	 *
	 * @param companyId the company ID of this audit
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this audit.
	 *
	 * @return the user ID of this audit
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this audit.
	 *
	 * @param userId the user ID of this audit
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this audit.
	 *
	 * @return the user uuid of this audit
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this audit.
	 *
	 * @param userUuid the user uuid of this audit
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this audit.
	 *
	 * @return the user name of this audit
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this audit.
	 *
	 * @param userName the user name of this audit
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the event type of this audit.
	 *
	 * @return the event type of this audit
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this audit.
	 *
	 * @param eventType the event type of this audit
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the class name of this audit.
	 *
	 * @return the class name of this audit
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this audit.
	 *
	 * @param className the class name of this audit
	 */
	public void setClassName(String className);

	/**
	 * Returns the class pk of this audit.
	 *
	 * @return the class pk of this audit
	 */
	public long getClassPk();

	/**
	 * Sets the class pk of this audit.
	 *
	 * @param classPk the class pk of this audit
	 */
	public void setClassPk(long classPk);

	/**
	 * Returns the client ip of this audit.
	 *
	 * @return the client ip of this audit
	 */
	@AutoEscape
	public String getClientIp();

	/**
	 * Sets the client ip of this audit.
	 *
	 * @param clientIp the client ip of this audit
	 */
	public void setClientIp(String clientIp);

	/**
	 * Returns the client host of this audit.
	 *
	 * @return the client host of this audit
	 */
	@AutoEscape
	public String getClientHost();

	/**
	 * Sets the client host of this audit.
	 *
	 * @param clientHost the client host of this audit
	 */
	public void setClientHost(String clientHost);

	/**
	 * Returns the session ID of this audit.
	 *
	 * @return the session ID of this audit
	 */
	@AutoEscape
	public String getSessionId();

	/**
	 * Sets the session ID of this audit.
	 *
	 * @param sessionId the session ID of this audit
	 */
	public void setSessionId(String sessionId);

	/**
	 * Returns the server name of this audit.
	 *
	 * @return the server name of this audit
	 */
	@AutoEscape
	public String getServerName();

	/**
	 * Sets the server name of this audit.
	 *
	 * @param serverName the server name of this audit
	 */
	public void setServerName(String serverName);

	/**
	 * Returns the server port of this audit.
	 *
	 * @return the server port of this audit
	 */
	public int getServerPort();

	/**
	 * Sets the server port of this audit.
	 *
	 * @param serverPort the server port of this audit
	 */
	public void setServerPort(int serverPort);

	/**
	 * Returns the field of this audit.
	 *
	 * @return the field of this audit
	 */
	@AutoEscape
	public String getField();

	/**
	 * Sets the field of this audit.
	 *
	 * @param field the field of this audit
	 */
	public void setField(String field);

	/**
	 * Returns the old value of this audit.
	 *
	 * @return the old value of this audit
	 */
	@AutoEscape
	public String getOldValue();

	/**
	 * Sets the old value of this audit.
	 *
	 * @param oldValue the old value of this audit
	 */
	public void setOldValue(String oldValue);

	/**
	 * Returns the new value of this audit.
	 *
	 * @return the new value of this audit
	 */
	@AutoEscape
	public String getNewValue();

	/**
	 * Sets the new value of this audit.
	 *
	 * @param newValue the new value of this audit
	 */
	public void setNewValue(String newValue);

	/**
	 * Returns the message of this audit.
	 *
	 * @return the message of this audit
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this audit.
	 *
	 * @param message the message of this audit
	 */
	public void setMessage(String message);

	/**
	 * Returns the additional info of this audit.
	 *
	 * @return the additional info of this audit
	 */
	@AutoEscape
	public String getAdditionalInfo();

	/**
	 * Sets the additional info of this audit.
	 *
	 * @param additionalInfo the additional info of this audit
	 */
	public void setAdditionalInfo(String additionalInfo);

	/**
	 * Returns the create date of this audit.
	 *
	 * @return the create date of this audit
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this audit.
	 *
	 * @param createDate the create date of this audit
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this audit.
	 *
	 * @return the modified date of this audit
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this audit.
	 *
	 * @param modifiedDate the modified date of this audit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ca.milleniummicro.audit.model.Audit audit);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ca.milleniummicro.audit.model.Audit> toCacheModel();

	@Override
	public ca.milleniummicro.audit.model.Audit toEscapedModel();

	@Override
	public ca.milleniummicro.audit.model.Audit toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}