
<%@ page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.4.1/dist/jquery.min.js"></script>
  <script src="${pageContext.servletContext.contextPath}/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
</head>
<body>
	<h2>Bạn đang ở Login Layout</h2>
	<div class="container">
		<jsp:include page="${param.view}"/>
	</div>
</body>
	<script type="text/javascript">
		  $(document).ready(function(){
		      if (jQuery) {  
		        
		        alert("Ji cu hoạt động, đã được nạp!");
		      } else {
		        alert("Ji cu ờ ri không được nạp vào đúng cách");
		      }
		   });
	  </script> 

</html>