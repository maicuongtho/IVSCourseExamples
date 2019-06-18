<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IVS Database JSP - Insert Demo</title>
</head>
<body>
 
 <sql:setDataSource var="ivsDB" 
     driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/ivsTest"
     user="thomc"
     password="12345678"/>
     
 <sql:update dataSource="${ivsDB}" var="soDong">
		INSERT INTO appuser VALUES (4, 'emp emp4');
</sql:update>


<c:out value="Thành công"></c:out> 
</body>
</html>