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

package ca.milleniummicro.audit.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Audit. This utility wraps
 * {@link ca.milleniummicro.audit.service.impl.AuditLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AuditLocalService
 * @see ca.milleniummicro.audit.service.base.AuditLocalServiceBaseImpl
 * @see ca.milleniummicro.audit.service.impl.AuditLocalServiceImpl
 * @generated
 */
@ProviderType
public class AuditLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ca.milleniummicro.audit.service.impl.AuditLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the audit to the database. Also notifies the appropriate model listeners.
	*
	* @param audit the audit
	* @return the audit that was added
	*/
	public static ca.milleniummicro.audit.model.Audit addAudit(
		ca.milleniummicro.audit.model.Audit audit) {
		return getService().addAudit(audit);
	}

	/**
	* Creates a new audit with the primary key. Does not add the audit to the database.
	*
	* @param auditId the primary key for the new audit
	* @return the new audit
	*/
	public static ca.milleniummicro.audit.model.Audit createAudit(long auditId) {
		return getService().createAudit(auditId);
	}

	/**
	* Deletes the audit from the database. Also notifies the appropriate model listeners.
	*
	* @param audit the audit
	* @return the audit that was removed
	*/
	public static ca.milleniummicro.audit.model.Audit deleteAudit(
		ca.milleniummicro.audit.model.Audit audit) {
		return getService().deleteAudit(audit);
	}

	/**
	* Deletes the audit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param auditId the primary key of the audit
	* @return the audit that was removed
	* @throws PortalException if a audit with the primary key could not be found
	*/
	public static ca.milleniummicro.audit.model.Audit deleteAudit(long auditId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAudit(auditId);
	}

	public static ca.milleniummicro.audit.model.Audit fetchAudit(long auditId) {
		return getService().fetchAudit(auditId);
	}

	/**
	* Returns the audit matching the UUID and group.
	*
	* @param uuid the audit's UUID
	* @param groupId the primary key of the group
	* @return the matching audit, or <code>null</code> if a matching audit could not be found
	*/
	public static ca.milleniummicro.audit.model.Audit fetchAuditByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchAuditByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the audit with the primary key.
	*
	* @param auditId the primary key of the audit
	* @return the audit
	* @throws PortalException if a audit with the primary key could not be found
	*/
	public static ca.milleniummicro.audit.model.Audit getAudit(long auditId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAudit(auditId);
	}

	/**
	* Returns the audit matching the UUID and group.
	*
	* @param uuid the audit's UUID
	* @param groupId the primary key of the group
	* @return the matching audit
	* @throws PortalException if a matching audit could not be found
	*/
	public static ca.milleniummicro.audit.model.Audit getAuditByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAuditByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the audit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param audit the audit
	* @return the audit that was updated
	*/
	public static ca.milleniummicro.audit.model.Audit updateAudit(
		ca.milleniummicro.audit.model.Audit audit) {
		return getService().updateAudit(audit);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of audits.
	*
	* @return the number of audits
	*/
	public static int getAuditsCount() {
		return getService().getAuditsCount();
	}

	public static int searchAuditsCounts(java.lang.String keywords,
		com.liferay.portal.kernel.search.Sort[] sort,
		java.lang.String[] eventTypes, java.util.Date startDate,
		java.util.Date endDate) {
		return getService()
				   .searchAuditsCounts(keywords, sort, eventTypes, startDate,
			endDate);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ca.milleniummicro.audit.model.impl.AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ca.milleniummicro.audit.model.impl.AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the audits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ca.milleniummicro.audit.model.impl.AuditModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @return the range of audits
	*/
	public static java.util.List<ca.milleniummicro.audit.model.Audit> getAudits(
		int start, int end) {
		return getService().getAudits(start, end);
	}

	/**
	* Returns all the audits matching the UUID and company.
	*
	* @param uuid the UUID of the audits
	* @param companyId the primary key of the company
	* @return the matching audits, or an empty list if no matches were found
	*/
	public static java.util.List<ca.milleniummicro.audit.model.Audit> getAuditsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getAuditsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of audits matching the UUID and company.
	*
	* @param uuid the UUID of the audits
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of audits
	* @param end the upper bound of the range of audits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching audits, or an empty list if no matches were found
	*/
	public static java.util.List<ca.milleniummicro.audit.model.Audit> getAuditsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ca.milleniummicro.audit.model.Audit> orderByComparator) {
		return getService()
				   .getAuditsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	public static java.util.List<ca.milleniummicro.audit.model.Audit> searchAuditsPaginate(
		int start, int end, java.lang.String keywords,
		com.liferay.portal.kernel.search.Sort[] sort,
		java.lang.String[] eventTypes, java.util.Date startDate,
		java.util.Date endDate) {
		return getService()
				   .searchAuditsPaginate(start, end, keywords, sort,
			eventTypes, startDate, endDate);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AuditLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AuditLocalService, AuditLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AuditLocalService.class);
}