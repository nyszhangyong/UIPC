<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>简单登录</title>
	<!-- 作者：张勇(Mark Smith) -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">
	<script>
	  $(function() {
	    $( "#tabs" ).tabs();
	    $("#jsppage").load("/UIPC/views/consumer/jsp/demo_form_login.jsp");
	    $.ajax({
	        url: "/UIPC/views/consumer/jsp/demo_form_login.jsp", //这里是静态页的地址
	        type: "GET", //静态页用get方法，否则服务器会抛出405错误
	        success: function(data){
	            $("#tabs-1").text(data);
	        }
	    });
	  });
	</script>
</head>
<body>
    <div id="jsppage"></div>
	<div id="tabs">
		  <ul>
		    <li><a href="#tabs-1">HTML</a></li>
		    <li><a href="#tabs-2">CSS</a></li>
		    <li><a href="#tabs-3">JAVASCRIPT</a></li>
		    <li><a href="#tabs-4">JAVA</a></li>
		  </ul>
		  <div id="tabs-1">
		  </div>
		  <div id="tabs-2">
		  </div>
		  <div id="tabs-3">
		  </div>
		  <div id="tabs-4">
		  </div>		  
	</div> 
</body>
</html>