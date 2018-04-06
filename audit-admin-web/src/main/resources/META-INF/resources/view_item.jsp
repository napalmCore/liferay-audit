<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="ca.milleniummicro.audit.model.Audit"%>
<%@page import="ca.milleniummicro.audit.service.AuditLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<portlet:renderURL var="portletUrl" windowState="<%=LiferayWindowState.NORMAL.toString()%>">
</portlet:renderURL>
<%
String backURL = GetterUtil.getString(request.getAttribute("view.jsp-backURL"));
portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(Validator.isNotNull(backURL) ? backURL : portletUrl.toString());

	long auditId = Long.valueOf(request.getParameter("auditId"));
	Audit audit = AuditLocalServiceUtil.getAudit(auditId);
%>
<div id="content" class="container-fluid-1280">
	<div class="card-horizontal main-content-card">
		<table class="table">
			<thead>
				<tr>
					<th><b>Field</b></th>
					<th><b>Value</b></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Id</td>
					<td><%=audit.getAuditId() %></td>
				</tr>
				<tr >
					<td>UserId</td>
					<td><%=audit.getUserId() %></td>
				</tr>
				<tr >
					<td>UserName</td>
					<td><%=audit.getUserName() %></td>
				</tr>
				<tr >
					<td>EventType</td>
					<td><%=audit.getEventType() %></td>
				</tr>
				<tr >
					<td>ClassName</td>
					<td><%=audit.getClassName() %></td>
				</tr>
				<tr >
					<td>ClassPk</td>
					<td><%=audit.getClassPk() %></td>
				</tr>
				<tr >
					<td>ClientIp</td>
					<td><%=audit.getClientIp() %></td>
				</tr>
				<tr >
					<td>ClientHost</td>
					<td><%=audit.getClientHost() %></td>
				</tr>
				<tr >
					<td>SessionId</td>
					<td><%=audit.getSessionId() %></td>
				</tr>
				<tr >
					<td>ServerName</td>
					<td><%=audit.getServerName() %></td>
				</tr>
				<tr >
					<td>ServerPort</td>
					<td><%=audit.getServerPort() %></td>
				</tr>
				<tr >
					<td>Field</td>
					<td><%=audit.getField() %></td>
				</tr>
				<tr >
					<td>OldValue</td>
					<td><%=audit.getOldValue() %></td>
				</tr>
				<tr >
					<td>NewValue</td>
					<td><%=audit.getOldValue() %></td>
				</tr>
				<tr >
					<td>Message</td>
					<td><%=audit.getMessage() %></td>
				</tr>
				<tr >
					<td>AdditionalInfo</td>
					<td><%=audit.getAdditionalInfo() %></td>
				</tr>
				<tr >
					<td>CreateDate</td>
					<td><%=audit.getCreateDate() %></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>