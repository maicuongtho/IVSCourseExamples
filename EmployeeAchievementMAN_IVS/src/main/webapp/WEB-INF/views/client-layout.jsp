<%@ page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Trang chủ</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
	<h2>Client Layout</h2>
	<div class="container">
		<jsp:include page="${param.view}"/>
	</div>
   
</body>
</html>