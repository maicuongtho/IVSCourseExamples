<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Trang chủ</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="module/menu.jsp"></jsp:include>
	<jsp:include page="module/carousel.jsp"></jsp:include>
	<div class="container">
		<jsp:include page="${param.view}"/>
	</div>
    <jsp:include page="module/footer.jsp"></jsp:include>
</body>
</html>