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

package ca.milleniummicro.audit.service.persistence;

import aQute.bnd.annotation.ProviderType;

import ca.milleniummicro.audit.exception.NoSuchAuditException;
import ca.milleniummicro.audit.model.Audit;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ca.milleniummicro.audit.service.persistence.impl.AuditPersistenceImpl
 * @see AuditUtil
 * @generated
 */
@ProviderType
public interface AuditPersistence extends BasePersistence<Audit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuditUtil} to access the audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the audits where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching audits
	*/
	public java.util.List<Audit> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the audits where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @return the range of matching audits
	*/
	public java.util.List<Audit> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the audits where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching audits
	*/
	public java.util.List<Audit> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns an ordered range of all the audits where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching audits
	*/
	public java.util.List<Audit> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public Audit findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator)
		throws NoSuchAuditException;

	/**
	* Returns the first audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public Audit fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns the last audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public Audit findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator)
		throws NoSuchAuditException;

	/**
	* Returns the last audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public Audit fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns the audits before and after the current audit in the ordered set where uuid = &#63;.
	*
	* @param auditId the primary key of the current audit
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next audit
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public Audit[] findByUuid_PrevAndNext(long auditId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator)
		throws NoSuchAuditException;

	/**
	* Removes all the audits where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of audits where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching audits
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the audit where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAuditException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public Audit findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAuditException;

	/**
	* Returns the audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public Audit fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public Audit fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the audit where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the audit that was removed
	*/
	public Audit removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAuditException;

	/**
	* Returns the number of audits where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching audits
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the audits where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching audits
	*/
	public java.util.List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the audits where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @return the range of matching audits
	*/
	public java.util.List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the audits where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching audits
	*/
	public java.util.List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns an ordered range of all the audits where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching audits
	*/
	public java.util.List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public Audit findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator)
		throws NoSuchAuditException;

	/**
	* Returns the first audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public Audit fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns the last audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public Audit findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator)
		throws NoSuchAuditException;

	/**
	* Returns the last audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public Audit fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns the audits before and after the current audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param auditId the primary key of the current audit
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next audit
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public Audit[] findByUuid_C_PrevAndNext(long auditId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator)
		throws NoSuchAuditException;

	/**
	* Removes all the audits where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of audits where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching audits
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the audit in the entity cache if it is enabled.
	*
	* @param audit the audit
	*/
	public void cacheResult(Audit audit);

	/**
	* Caches the audits in the entity cache if it is enabled.
	*
	* @param audits the audits
	*/
	public void cacheResult(java.util.List<Audit> audits);

	/**
	* Creates a new audit with the primary key. Does not add the audit to the database.
	*
	* @param auditId the primary key for the new audit
	* @return the new audit
	*/
	public Audit create(long auditId);

	/**
	* Removes the audit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param auditId the primary key of the audit
	* @return the audit that was removed
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public Audit remove(long auditId) throws NoSuchAuditException;

	public Audit updateImpl(Audit audit);

	/**
	* Returns the audit with the primary key or throws a {@link NoSuchAuditException} if it could not be found.
	*
	* @param auditId the primary key of the audit
	* @return the audit
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public Audit findByPrimaryKey(long auditId) throws NoSuchAuditException;

	/**
	* Returns the audit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param auditId the primary key of the audit
	* @return the audit, or <code>null</code> if a audit with the primary key could not be found
	*/
	public Audit fetchByPrimaryKey(long auditId);

	@Override
	public java.util.Map<java.io.Serializable, Audit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the audits.
	*
	* @return the audits
	*/
	public java.util.List<Audit> findAll();

	/**
	* Returns a range of all the audits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @return the range of audits
	*/
	public java.util.List<Audit> findAll(int start, int end);

	/**
	* Returns an ordered range of all the audits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of audits
	*/
	public java.util.List<Audit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator);

	/**
	* Returns an ordered range of all the audits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of audits
	*/
	public java.util.List<Audit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Audit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the audits from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of audits.
	*
	* @return the number of audits
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}