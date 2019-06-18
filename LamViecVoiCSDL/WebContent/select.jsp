<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IVS Database JSP</title>
</head>
<body>
 
 <sql:setDataSource var="ivsDB" 
 	 driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/ivsTest"
     user="thomc"
     password="12345678"/>
 
<sql:query dataSource="${ivsDB}" var="result">
	SELECT * from appuser;
</sql:query>
 
<table>
<tr>
   <th>IVS ID</th>
   <th>Name</th>
 
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.id}"/></td>
   <td><c:out value="${row.name}"/></td>
 
</tr>
</c:forEach>
</table>
 
</body>
</html>