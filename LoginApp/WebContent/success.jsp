<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

<h3>Login Successful!</h3>

<%
User user = (User) session.getAttribute("user");

%>

Hello <%=user.getUserName() %>

</body>
</html>