<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL</title>
</head>
<body>
<h2>Bill|info</h2>
<hr>
<form action="generateBill" method="post">
<pre>
FirstName:<input type="text" name="firstName" value="${contacts.firstName} "/>
LastName:<input type="text" name="lastName" value="${contacts.lastName}"/>
Mobile:<input type="text" name="mobile" value="${contacts.mobile}"/>
Email:<input type="text" name="email" value="${contacts.email}"/>
Product:<input type="text" name="product"/>
Amount:<input type="text" name="amount"/>



<input type="submit" value="generatebill"/>



</pre>

</form>
</body>
</html>