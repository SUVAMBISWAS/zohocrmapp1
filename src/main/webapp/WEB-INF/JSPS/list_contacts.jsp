<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>
<h2>all leads</h2>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Billing</th>

</tr>

<c:forEach var="contacts" items ="${contacts}"> 
	<tr>
	<td><a href="contacts?id=${contacts.id}">${contacts.firstName}</a></td>
	
	<td>${contacts.lastName}</td>
	<td>${contacts.email}</td>
	<td>${contacts.mobile}</td>
	<td><a href="billingInfo?contactsid=${contacts.id}">Billing</a></td>
	
	
	</tr>
</c:forEach>  

</table>
</body>
</html>
