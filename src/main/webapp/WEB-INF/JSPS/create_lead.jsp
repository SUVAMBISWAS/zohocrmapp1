<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LEADS</title>
</head>
<body>
<h2>lead|info</h2>
<hr>
<form action="save" method="post">
<pre>
FirstName:<input type="text" name="firstName"/>
LastName:<input type="text" name="lastName"/>
Mobile:<input type="text" name="mobile"/>
Email:<input type="text" name="email"/>

Source:
<select name="source">
<option value="radio">radio</option>
<option value="newspaper">newspaper</option>
<option value="website">website</option>

</select>
<input type="submit" value="save"/>



</pre>

</form>
</body>
</html>