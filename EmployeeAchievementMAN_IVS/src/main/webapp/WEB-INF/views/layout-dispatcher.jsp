<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Layout Dispatcher</title>
</head>
<body>
	<%
		String view = request.getParameter("view");
	
	    if (view.startsWith("admin/"))
		 	pageContext.forward("admin-layout.jsp");
		else if (view.startsWith("client/"))
			pageContext.forward("client-layout.jsp");
		else if (view.startsWith("employee/")) 
			pageContext.forward("user-layout.jsp");
		else pageContext.forward("login-layout.jsp");
	%>
</body>
</html>