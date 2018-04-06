package ca.milleniummicro.audit.admin.web.application.list;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;

import ca.milleniummicro.audit.admin.web.constants.AuditAdminWebPortletKeys;

/**
 * @author aymen.mejri
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL_CONFIGURATION
	},
	service = PanelApp.class
)
public class AuditAdminWebPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return AuditAdminWebPortletKeys.AuditAdminWeb;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + AuditAdminWebPortletKeys.AuditAdminWeb + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}