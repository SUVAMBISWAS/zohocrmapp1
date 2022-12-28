<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
<div>
${msg} 
</div>
<h2>email sending</h2>
<form action="sendEmail" method="post">
<pre>
To<input type="text" name="to" value="${email}"/>
Subject<input type="text" name="subject"/>
<textarea name="message" rows="4" cols="50"></textarea>

</pre>
<input type="submit" value="send"/>
</form>
</body>
</html>