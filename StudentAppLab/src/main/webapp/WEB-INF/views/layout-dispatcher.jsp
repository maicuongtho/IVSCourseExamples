<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		String view = request.getParameter("view");
		if (view.startsWith("admin/"))
		{
			pageContext.forward("admin-layout.jsp");
		}
		else
		{
			pageContext.forward("user-layout.jsp");
		}
	%>
</body>
</html>