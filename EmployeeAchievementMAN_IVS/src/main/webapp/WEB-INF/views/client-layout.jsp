<%@ page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Layout</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.4.1/dist/jquery.min.js"></script>
  <script src="${pageContext.servletContext.contextPath}/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("a[data-lang]").click(function()
  				{
		  			var lang=$(this).attr("data-lang");
		  			var pagecontextPath ="${pageContext.request.contextPath}";
		  			$.get(pagecontextPath+"/index.html?language="+lang,function()
		  					{
		  					location.reload();
		  				  })
		  			//alert("Hố hố");
  					return false;
  				});
  	});
  </script>
</head>
<body>
	<div class="containner">
		 Language :
			  <a href="#" data-lang="en">English</a>|
			  <a href="#" data-lang="vi">Viet Nam</a>|
	</div>
	 
	<%@ include file="modules/clientmenu.jsp" %>
	<div class="container">
		<jsp:include page="${param.view}"/>
	</div>
    
</body>
</html>