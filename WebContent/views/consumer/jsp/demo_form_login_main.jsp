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
	
	<link rel="stylesheet" href="../js/codeFomat/codemirror-5.20.2/lib/codemirror.css">
	<script src="../js/codeFomat/codemirror-5.20.2/lib/codemirror.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/selection/active-line.js"></script>
    <style type="text/css">
      .CodeMirror {border-top: 1px solid black; border-bottom: 1px solid black;}
    </style>
	<script>
	  $(function(){
	    $( "#tabs" ).tabs();
	    $("#jsppage").load("/UIPC/views/consumer/jsp/demo_form_login.jsp");
	    $.ajax({
	        url: "/UIPC/views/consumer/jsp/demo_form_login.jsp",
	        type: "GET",
	        success: function(data){
	            $("#codeHTML").val(data);
	    		var editor = CodeMirror.fromTextArea(document.getElementById("codeHTML"), {
	  			  mode: "application/xml",
	  			  styleActiveLine: true,
	  			  lineNumbers: true,
	  			  lineWrapping: true
	  			});
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
		  <div id="tabs-1"><form><textarea id="codeHTML" name="codeHTML"></textarea></form></div>
		  <div id="tabs-2">
		  </div>
		  <div id="tabs-3">
		  </div>
		  <div id="tabs-4">
		  </div>		  
	</div> 
</body>
</html>