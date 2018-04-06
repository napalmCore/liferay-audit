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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Audit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Audit
 * @generated
 */
@ProviderType
public class AuditCacheModel implements CacheModel<Audit>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuditCacheModel)) {
			return false;
		}

		AuditCacheModel auditCacheModel = (AuditCacheModel)obj;

		if (auditId == auditCacheModel.auditId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auditId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", auditId=");
		sb.append(auditId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append(", className=");
		sb.append(className);
		sb.append(", classPk=");
		sb.append(classPk);
		sb.append(", clientIp=");
		sb.append(clientIp);
		sb.append(", clientHost=");
		sb.append(clientHost);
		sb.append(", sessionId=");
		sb.append(sessionId);
		sb.append(", serverName=");
		sb.append(serverName);
		sb.append(", serverPort=");
		sb.append(serverPort);
		sb.append(", field=");
		sb.append(field);
		sb.append(", oldValue=");
		sb.append(oldValue);
		sb.append(", newValue=");
		sb.append(newValue);
		sb.append(", message=");
		sb.append(message);
		sb.append(", additionalInfo=");
		sb.append(additionalInfo);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Audit toEntityModel() {
		AuditImpl auditImpl = new AuditImpl();

		if (uuid == null) {
			auditImpl.setUuid(StringPool.BLANK);
		}
		else {
			auditImpl.setUuid(uuid);
		}

		auditImpl.setAuditId(auditId);
		auditImpl.setGroupId(groupId);
		auditImpl.setCompanyId(companyId);
		auditImpl.setUserId(userId);

		if (userName == null) {
			auditImpl.setUserName(StringPool.BLANK);
		}
		else {
			auditImpl.setUserName(userName);
		}

		if (eventType == null) {
			auditImpl.setEventType(StringPool.BLANK);
		}
		else {
			auditImpl.setEventType(eventType);
		}

		if (className == null) {
			auditImpl.setClassName(StringPool.BLANK);
		}
		else {
			auditImpl.setClassName(className);
		}

		auditImpl.setClassPk(classPk);

		if (clientIp == null) {
			auditImpl.setClientIp(StringPool.BLANK);
		}
		else {
			auditImpl.setClientIp(clientIp);
		}

		if (clientHost == null) {
			auditImpl.setClientHost(StringPool.BLANK);
		}
		else {
			auditImpl.setClientHost(clientHost);
		}

		if (sessionId == null) {
			auditImpl.setSessionId(StringPool.BLANK);
		}
		else {
			auditImpl.setSessionId(sessionId);
		}

		if (serverName == null) {
			auditImpl.setServerName(StringPool.BLANK);
		}
		else {
			auditImpl.setServerName(serverName);
		}

		auditImpl.setServerPort(serverPort);

		if (field == null) {
			auditImpl.setField(StringPool.BLANK);
		}
		else {
			auditImpl.setField(field);
		}

		if (oldValue == null) {
			auditImpl.setOldValue(StringPool.BLANK);
		}
		else {
			auditImpl.setOldValue(oldValue);
		}

		if (newValue == null) {
			auditImpl.setNewValue(StringPool.BLANK);
		}
		else {
			auditImpl.setNewValue(newValue);
		}

		if (message == null) {
			auditImpl.setMessage(StringPool.BLANK);
		}
		else {
			auditImpl.setMessage(message);
		}

		if (additionalInfo == null) {
			auditImpl.setAdditionalInfo(StringPool.BLANK);
		}
		else {
			auditImpl.setAdditionalInfo(additionalInfo);
		}

		if (createDate == Long.MIN_VALUE) {
			auditImpl.setCreateDate(null);
		}
		else {
			auditImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			auditImpl.setModifiedDate(null);
		}
		else {
			auditImpl.setModifiedDate(new Date(modifiedDate));
		}

		auditImpl.resetOriginalValues();

		return auditImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		auditId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		eventType = objectInput.readUTF();
		className = objectInput.readUTF();

		classPk = objectInput.readLong();
		clientIp = objectInput.readUTF();
		clientHost = objectInput.readUTF();
		sessionId = objectInput.readUTF();
		serverName = objectInput.readUTF();

		serverPort = objectInput.readInt();
		field = objectInput.readUTF();
		oldValue = objectInput.readUTF();
		newValue = objectInput.readUTF();
		message = objectInput.readUTF();
		additionalInfo = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(auditId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (eventType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventType);
		}

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}

		objectOutput.writeLong(classPk);

		if (clientIp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientIp);
		}

		if (clientHost == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientHost);
		}

		if (sessionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sessionId);
		}

		if (serverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serverName);
		}

		objectOutput.writeInt(serverPort);

		if (field == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(field);
		}

		if (oldValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oldValue);
		}

		if (newValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newValue);
		}

		if (message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(message);
		}

		if (additionalInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(additionalInfo);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long auditId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String eventType;
	public String className;
	public long classPk;
	public String clientIp;
	public String clientHost;
	public String sessionId;
	public String serverName;
	public int serverPort;
	public String field;
	public String oldValue;
	public String newValue;
	public String message;
	public String additionalInfo;
	public long createDate;
	public long modifiedDate;
}