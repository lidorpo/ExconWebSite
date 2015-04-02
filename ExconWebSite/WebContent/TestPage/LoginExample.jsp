<%@ page import="loginExmaple.LoginExample"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">
<title>Login Answer</title>
</head>
<body>
	<%
		String userName = (String) request.getParameter("userName");
		String password = (String) request.getParameter("password");
		LoginExample login = new LoginExample(userName, password);
	%>

	<h1>Login Result</h1>
	<p><%=login.TryLogin()%></p>
</body>
</html>