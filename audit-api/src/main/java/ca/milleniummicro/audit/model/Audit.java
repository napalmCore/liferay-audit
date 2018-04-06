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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Audit service. Represents a row in the &quot;AUDIT_Audit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AuditModel
 * @see ca.milleniummicro.audit.model.impl.AuditImpl
 * @see ca.milleniummicro.audit.model.impl.AuditModelImpl
 * @generated
 */
@ImplementationClassName("ca.milleniummicro.audit.model.impl.AuditImpl")
@ProviderType
public interface Audit extends AuditModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ca.milleniummicro.audit.model.impl.AuditImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Audit, Long> AUDIT_ID_ACCESSOR = new Accessor<Audit, Long>() {
			@Override
			public Long get(Audit audit) {
				return audit.getAuditId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Audit> getTypeClass() {
				return Audit.class;
			}
		};
}