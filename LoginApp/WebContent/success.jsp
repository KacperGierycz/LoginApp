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

<%-- 
<%
// User user = (User) session.getAttribute("user");
User user = (User) request.getAttribute("user");

%>
 --%>
 
<jsp:useBean id="user" class="dto.User" scope="request">
	<jsp:setProperty property="userName" name="user" value="NewUser"/>
</jsp:useBean>

<%-- 
Hello <%=user.getUserName() %>
 --%>

<jsp:getProperty property="userName" name="user"/>

</body>
</html>