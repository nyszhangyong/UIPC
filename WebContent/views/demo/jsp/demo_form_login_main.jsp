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
	
	<link rel=stylesheet href="../js/codeFomat/codemirror-5.20.2/doc/docs.css">
	<link rel="stylesheet" href="../js/codeFomat/codemirror-5.20.2/lib/codemirror.css">
	<link rel="stylesheet" href="../js/codeFomat/codemirror-5.20.2/addon/hint/show-hint.css">
	<script src="../js/codeFomat/codemirror-5.20.2/lib/codemirror.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/hint/show-hint.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/hint/xml-hint.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/hint/html-hint.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/xml/xml.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/javascript/javascript.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/css/css.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/htmlmixed/htmlmixed.js"></script>
	<style type="text/css">
	    .CodeMirror {border-top: 1px solid #888; border-bottom: 1px solid #888;}
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
	            var editor = CodeMirror(document.getElementById("codeHTML"), {
	                mode: "text/html",
	                extraKeys: {"Ctrl-Space": "autocomplete"},
	                value: document.documentElement.innerHTML
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
		    <li><a href="#codeHTML">HTML</a></li>
		    <li><a href="#tabs-2">CSS</a></li>
		    <li><a href="#tabs-3">JAVASCRIPT</a></li>
		    <li><a href="#tabs-4">JAVA</a></li>
		  </ul>
		  <div id="codeHTML"></div>
		  <div id="tabs-2">
		  </div>
		  <div id="tabs-3">
		  </div>
		  <div id="tabs-4">
		  </div>		  
	</div> 
</body>
</html>