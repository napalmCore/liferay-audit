package ca.milleniummicro.audit.admin.web.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import ca.milleniummicro.audit.admin.web.constants.AuditAdminWebPortletKeys;

/**
 * @author aymen.mejri
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.layout-cacheable=true",
		"com.liferay.portlet.private-request-attributes=false",
		"com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50",
		"com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=audit-admin-web Portlet",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.display-name=" + AuditAdminWebPortletKeys.name,
		"javax.portlet.info.title=" + AuditAdminWebPortletKeys.name,
		"javax.portlet.name=" + AuditAdminWebPortletKeys.AuditAdminWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class AuditAdminWebPortlet extends MVCPortlet {
	@Override
	public void doView(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		super.processAction(actionRequest, actionResponse);
	}
}