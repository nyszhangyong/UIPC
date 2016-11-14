<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>提交多文件和数组数据</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">
	<!-- 以下CODEMIRROR功能引用 -->
    <link   href="../js/codeFomat/codemirror-5.20.2/doc/docs.css" rel="stylesheet"/>
    <link   href="../js/codeFomat/codemirror-5.20.2/lib/codemirror.css" rel="stylesheet"/>
    <link   href="../js/codeFomat/codemirror-5.20.2/addon/fold/foldgutter.css" rel="stylesheet"/>
    <script src="../js/codeFomat/codemirror-5.20.2/lib/codemirror.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/addon/fold/foldcode.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/addon/fold/foldgutter.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/addon/fold/brace-fold.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/addon/fold/xml-fold.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/addon/fold/markdown-fold.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/addon/fold/comment-fold.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/mode/javascript/javascript.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/mode/xml/xml.js"></script>
    <script src="../js/codeFomat/codemirror-5.20.2/mode/markdown/markdown.js"></script>   
	<!-- 以下私有功能引用 --> 
	<script src="../js/js_self/demo_form_multipartFormData_main.js" type="text/javascript"></script>
    <link   href="../css/demo_form_multipartFormData_main.css" type="text/css" rel="stylesheet" media="screen">   
</head>

<body>
	<div id="jsppage"></div>
	<div id="tabs">
		  <ul>
		    <li><a href="#tabsHTML">HTML</a></li>
		    <li><a href="#tabsCSS">CSS</a></li>
		    <li><a href="#tabsJAVASCRIPT">JAVASCRIPT</a></li>
		  </ul>
		  <div id="tabsHTML"  style="max-width: 50em; margin-bottom: 1em">
		       <br>HTML<textarea id="code_html" name="code_html"></textarea>
		  </div>
		  <div id="tabsCSS" style="max-width: 50em; margin-bottom: 1em">
		       <br>CSS<textarea id="code_css" name="code_css"></textarea>
		  </div>
		  <div id="tabsJAVASCRIPT" style="max-width: 50em">
		       <br>JAVASCRIPT<textarea id="code_javascript" name="code_javascript"></textarea>
		  </div>
	</div>		  
</body>
</html>