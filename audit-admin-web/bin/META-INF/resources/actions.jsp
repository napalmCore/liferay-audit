<%@ include file="init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="ca.milleniummicro.audit.model.Audit"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
%>
<portlet:renderURL var="viewItemActionURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>">
	<portlet:param name="mvcPath" value="/view_item.jsp"/>
	<portlet:param name="auditId" value="<%=row.getPrimaryKey() %>"/>
</portlet:renderURL>

<liferay-ui:icon-menu>
    <liferay-ui:icon iconCssClass="icon-edit" message="View" url="<%=viewItemActionURL%>" />
</liferay-ui:icon-menu>