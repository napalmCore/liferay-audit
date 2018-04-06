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

package ca.milleniummicro.audit.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.search.Sort;

import aQute.bnd.annotation.ProviderType;
import ca.milleniummicro.audit.model.Audit;
import ca.milleniummicro.audit.service.AuditLocalServiceUtil;
import ca.milleniummicro.audit.service.base.AuditLocalServiceBaseImpl;

/**
 * The implementation of the audit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ca.milleniummicro.audit.service.AuditLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuditLocalServiceBaseImpl
 * @see ca.milleniummicro.audit.service.AuditLocalServiceUtil
 */
@ProviderType
public class AuditLocalServiceImpl extends AuditLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link ca.milleniummicro.audit.service.AuditLocalServiceUtil} to access the audit local service.
	 */

	@Override
	public List<Audit> searchAuditsPaginate(
		int start,
		int end,
		String keywords,
		Sort[] sort,
		String[] eventTypes,
		Date startDate,
		Date endDate
	) {

		return searchAudits(start, end, keywords, sort, eventTypes, startDate, endDate);
	}

	@Override
	public int searchAuditsCounts(
		String keywords,
		Sort[] sort,
		String[] eventTypes,
		Date startDate,
		Date endDate
	) {
		List<Audit> audits  = searchAudits(-1, -1, keywords, sort, eventTypes, startDate, endDate);
		return audits.size();

	}

	private List<Audit> searchAudits(
		int start,
		int end,
		String keywords,
		Sort[] sort,
		String[] eventTypes,
		Date startDate,
		Date endDate
	) {
		Class<?> clazz = getClass();
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Audit.class,
			clazz.getClassLoader());
		boolean getAll = false;
		if (eventTypes != null) {
			for (String eventType :eventTypes) {
				if (eventType.equalsIgnoreCase("all")) {
					getAll = true;
				}
			}
			if (!getAll) {
				dynamicQuery.add(PropertyFactoryUtil.forName("eventType").in(eventTypes));
			}
		}

		if (startDate != null && endDate != null) {
			dynamicQuery.add(PropertyFactoryUtil.forName("createDate").between(startDate, endDate));
		}

		if(keywords != null && !keywords.isEmpty()) {
			Disjunction disjunctionQuery = RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(PropertyFactoryUtil.forName("userName").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("eventType").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("className").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("clientHost").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("sessionId").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("serverName").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("field").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("oldValue").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("newValue").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("message").like("%" + keywords + "%"));
			disjunctionQuery.add(PropertyFactoryUtil.forName("additionalInfo").like("%" + keywords + "%"));
			dynamicQuery.add(disjunctionQuery);
		}

		if (sort != null) {
			for (Sort sortElement : sort) {
				Order order;
				if (sortElement.isReverse()) {
					order = OrderFactoryUtil.desc(sortElement.getFieldName());
				} else {
					order = OrderFactoryUtil.asc(sortElement.getFieldName());
				}
				dynamicQuery.addOrder(order);
			}
		}
		if (start != -1 && end != -1) {
			dynamicQuery.setLimit(start, end);
		}
		List<Audit> auditList = AuditLocalServiceUtil.dynamicQuery(dynamicQuery);

		return auditList;
	}

}