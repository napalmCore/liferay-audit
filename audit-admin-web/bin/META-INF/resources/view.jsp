<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.search.Sort"%>
<%@page import="ca.milleniummicro.audit.constants.EventTypes"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="ca.milleniummicro.audit.model.Audit"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="ca.milleniummicro.audit.service.AuditLocalServiceUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/init.jsp" %>
<%
String backURL = GetterUtil.getString(request.getAttribute("view.jsp-backURL"));
String orderByCol = ParamUtil.getString(request, "orderByCol"); 
String orderByType = ParamUtil.getString(request, "orderByType");
String keywords = ParamUtil.getString(request, "keywords");
String searchRequest = ParamUtil.getString(request, "searchRequest");
PortletURL portletURL = renderResponse.createRenderURL();

String startDate = ParamUtil.getString(request, "startDate");
String endDate = ParamUtil.getString(request, "endDate");
String navigation = ParamUtil.getString(request, "navigation", "all");

Date starDateFormat = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1970");
Date endDateFormat = new Date();
if (startDate != null && !startDate.isEmpty()) {
	starDateFormat = new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
}
if (endDate != null && !endDate.isEmpty()) {
	endDateFormat = new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
}

if (Validator.isNull(orderByType)) {
    orderByType = "desc";
}
if (Validator.isNull(orderByCol)) {
    orderByCol = "auditId";
}
portletURL.setParameter("orderByCol", orderByCol);
portletURL.setParameter("orderByType", orderByType);
portletURL.setParameter("keywords", keywords);
portletURL.setParameter("startDate", startDate);
portletURL.setParameter("endDate", endDate);
portletURL.setParameter("navigation", navigation);
%>
<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">

	<aui:form action="<%=portletURL.toString()%>" name="searchFm">
		<table>
			<tr>
				<td>
				<label class="control-label" for="<portlet:namespace />startDate">
					Created between
				</label>
				<liferay-ui:input-date name="startDate" dayValue="<%= starDateFormat.getDate() %>"
					monthValue="<%=starDateFormat.getMonth()%>" yearValue="<%=starDateFormat.getYear()+1900%>"/>
				</td>
				<td>
				<label class="control-label" for="<portlet:namespace />endDate">
					And
				</label>
				 <liferay-ui:input-date name="endDate" firstEnabledDate="<%=endDateFormat%>" dayValue="<%= endDateFormat.getDate() %>"
					monthValue="<%=endDateFormat.getMonth()%>" yearValue="<%=endDateFormat.getYear()+1900%>" />
				</td>
				<td><liferay-ui:input-search markupView="lexicon" placeholder='<%=LanguageUtil.get(request, "search")%>' /></td>
			</tr>
		</table>
	</aui:form>
</aui:nav-bar>
        <liferay-frontend:management-bar
            searchContainerId="audit"
        >
            <liferay-frontend:management-bar-filters>
                <liferay-frontend:management-bar-navigation
                    navigationKeys='<%= new String[] {
                    	"all", EventTypes.ADD,
                        EventTypes.UPDATE, EventTypes.DELETE,
                        EventTypes.LOGIN, EventTypes.LOGOUT,
                        EventTypes.LOGIN_FAILURE} %>'
                    portletURL="<%= PortletURLUtil.clone(portletURL, renderResponse) %>"
                />

                <liferay-frontend:management-bar-sort
                    orderByCol='<%= orderByCol %>'
                    orderByType="<%= orderByType %>"
                    orderColumns='<%= new String[] {
                    	"className", "eventType",
                        "field", "oldValue", "newValue", "createDate"} %>'
                    portletURL="<%= PortletURLUtil.clone(portletURL, renderResponse) %>"
                />

            </liferay-frontend:management-bar-filters>
        </liferay-frontend:management-bar>

<div id="content" class="container-fluid-1280">

<portlet:renderURL var="currentURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>"></portlet:renderURL>

    <aui:container cssClass="container-fluid-1280 card-horizontal main-content-card">
<%
Sort[] sorts = {new Sort(orderByCol, orderByType.equals("desc"))};
%>
        <liferay-ui:search-container
            orderByCol="<%=orderByCol %>"
            orderByType="<%=orderByType %>"
            iteratorURL="<%= portletURL %>"
            id="audit"
            delta="20"
            total="<%=AuditLocalServiceUtil.searchAuditsCounts(keywords, sorts, new String[] {navigation}, starDateFormat, endDateFormat)%>"
        >

            <liferay-ui:search-container-results >
            <%
				List<Audit> list = AuditLocalServiceUtil.searchAuditsPaginate(
                	searchContainer.getStart(),
                    searchContainer.getEnd(),
                    keywords, sorts, new String[] {navigation}, starDateFormat, endDateFormat);
                pageContext.setAttribute("results", list);
                pageContext.setAttribute("total", AuditLocalServiceUtil.searchAuditsCounts(keywords, sorts, new String[] {navigation}, starDateFormat, endDateFormat));
            %>

            </liferay-ui:search-container-results>
                <liferay-ui:search-container-row
                    className="ca.milleniummicro.audit.model.Audit"
                    keyProperty="auditId" modelVar="Audit">


                    <liferay-ui:search-container-column-text name="userName"
                        property="userName" />

                    <liferay-ui:search-container-column-text name="eventType"
                        property="eventType"
                        orderable="<%= true %>"
                        orderableProperty="eventType" />

                    <liferay-ui:search-container-column-text orderable="true"
                        orderableProperty="className"
                        name="className"
                        property="className" />
                        
                    <liferay-ui:search-container-column-text orderable="true"
                        orderableProperty="classPk" 
                        name="classPk"
                        property="classPk" />

                     <liferay-ui:search-container-column-text orderable="true"
                        orderableProperty="field" 
                        name="field"
                        property="field" />
                    
                    <liferay-ui:search-container-column-text orderable="true"
                        orderableProperty="oldValue" 
                        name="oldValue"
                        property="oldValue" />
                    
                    <liferay-ui:search-container-column-text orderable="true"
                        orderableProperty="newValue" 
                        name="newValue"
                        property="newValue" />

					<liferay-ui:search-container-column-text orderable="true"
						orderableProperty="createDate" name="createDate"
						property="createDate" />

					<liferay-ui:search-container-column-jsp name="Action"  align="center" path="/actions.jsp" />

			</liferay-ui:search-container-row>
            <liferay-ui:search-iterator  markupView="lexicon" searchContainer="<%= searchContainer %>"/>
        </liferay-ui:search-container>
    </aui:container>
</div>