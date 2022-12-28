<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>check the records</title>
</head>
<body>
<h2>lead information</h2>
FirstName:${lead.firstName}<br/>
LastName:${lead.lastName}<br/>
Mobile:${lead.mobile}<br/>
Email:${lead.email}<br/>
Source:${lead.source}<br/>

<form action="compose" method="post">
<input type="hidden" name="email" value="${lead.email}"/>
<input type="submit" value="sendemail"/>
</form>
<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>