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

import ca.milleniummicro.audit.model.Audit;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the audit service. This utility wraps {@link ca.milleniummicro.audit.service.persistence.impl.AuditPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuditPersistence
 * @see ca.milleniummicro.audit.service.persistence.impl.AuditPersistenceImpl
 * @generated
 */
@ProviderType
public class AuditUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Audit audit) {
		getPersistence().clearCache(audit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Audit> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Audit> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Audit> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Audit> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Audit update(Audit audit) {
		return getPersistence().update(audit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Audit update(Audit audit, ServiceContext serviceContext) {
		return getPersistence().update(audit, serviceContext);
	}

	/**
	* Returns all the audits where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching audits
	*/
	public static List<Audit> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Audit> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Audit> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Audit> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Audit> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Audit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public static Audit findByUuid_First(java.lang.String uuid,
		OrderByComparator<Audit> orderByComparator)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static Audit fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Audit> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public static Audit findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Audit> orderByComparator)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last audit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static Audit fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Audit> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the audits before and after the current audit in the ordered set where uuid = &#63;.
	*
	* @param auditId the primary key of the current audit
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next audit
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public static Audit[] findByUuid_PrevAndNext(long auditId,
		java.lang.String uuid, OrderByComparator<Audit> orderByComparator)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence()
				   .findByUuid_PrevAndNext(auditId, uuid, orderByComparator);
	}

	/**
	* Removes all the audits where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of audits where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching audits
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the audit where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAuditException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public static Audit findByUUID_G(java.lang.String uuid, long groupId)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static Audit fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static Audit fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the audit where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the audit that was removed
	*/
	public static Audit removeByUUID_G(java.lang.String uuid, long groupId)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of audits where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching audits
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the audits where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching audits
	*/
	public static List<Audit> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Audit> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Audit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Audit> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public static Audit findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Audit> orderByComparator)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static Audit fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Audit> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit
	* @throws NoSuchAuditException if a matching audit could not be found
	*/
	public static Audit findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Audit> orderByComparator)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last audit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static Audit fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Audit> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Audit[] findByUuid_C_PrevAndNext(long auditId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Audit> orderByComparator)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(auditId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the audits where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of audits where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching audits
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the audit in the entity cache if it is enabled.
	*
	* @param audit the audit
	*/
	public static void cacheResult(Audit audit) {
		getPersistence().cacheResult(audit);
	}

	/**
	* Caches the audits in the entity cache if it is enabled.
	*
	* @param audits the audits
	*/
	public static void cacheResult(List<Audit> audits) {
		getPersistence().cacheResult(audits);
	}

	/**
	* Creates a new audit with the primary key. Does not add the audit to the database.
	*
	* @param auditId the primary key for the new audit
	* @return the new audit
	*/
	public static Audit create(long auditId) {
		return getPersistence().create(auditId);
	}

	/**
	* Removes the audit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param auditId the primary key of the audit
	* @return the audit that was removed
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public static Audit remove(long auditId)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence().remove(auditId);
	}

	public static Audit updateImpl(Audit audit) {
		return getPersistence().updateImpl(audit);
	}

	/**
	* Returns the audit with the primary key or throws a {@link NoSuchAuditException} if it could not be found.
	*
	* @param auditId the primary key of the audit
	* @return the audit
	* @throws NoSuchAuditException if a audit with the primary key could not be found
	*/
	public static Audit findByPrimaryKey(long auditId)
		throws ca.milleniummicro.audit.exception.NoSuchAuditException {
		return getPersistence().findByPrimaryKey(auditId);
	}

	/**
	* Returns the audit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param auditId the primary key of the audit
	* @return the audit, or <code>null</code> if a audit with the primary key could not be found
	*/
	public static Audit fetchByPrimaryKey(long auditId) {
		return getPersistence().fetchByPrimaryKey(auditId);
	}

	public static java.util.Map<java.io.Serializable, Audit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the audits.
	*
	* @return the audits
	*/
	public static List<Audit> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Audit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Audit> findAll(int start, int end,
		OrderByComparator<Audit> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Audit> findAll(int start, int end,
		OrderByComparator<Audit> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the audits from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of audits.
	*
	* @return the number of audits
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AuditPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AuditPersistence, AuditPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AuditPersistence.class);
}