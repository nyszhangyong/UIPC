<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>查询分页列表(datatables)</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">
	<!-- 以下CODEMIRROR功能引用 -->
	<link href="../js/codeFomat/codemirror-5.20.2/doc/docs.css" rel=stylesheet>
	<link href="../js/codeFomat/codemirror-5.20.2/lib/codemirror.css" rel=stylesheet>
	<link href="../js/codeFomat/codemirror-5.20.2/addon/hint/show-hint.css" rel=stylesheet>
	<script src="../js/codeFomat/codemirror-5.20.2/lib/codemirror.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/hint/show-hint.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/hint/xml-hint.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/addon/hint/html-hint.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/xml/xml.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/javascript/javascript.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/css/css.js"></script>
	<script src="../js/codeFomat/codemirror-5.20.2/mode/htmlmixed/htmlmixed.js"></script>
	<!-- 以下私有功能引用 -->
	<script src="../js/js_self/demo_query_page_datatables_list_main.js" type="text/javascript"></script>
    <link   href="../css/demo_query_page_datatables_list_main.css" type="text/css" rel="stylesheet" media="screen">
</head>
<body>
    <div id="jsppage"></div>
	<div id="tabs">
		  <ul>
		    <li><a href="#tabsHTML">HTML</a></li>
		    <li><a href="#tabsCSS">CSS</a></li>
		    <li><a href="#tabsJAVASCRIPT">JAVASCRIPT</a></li>
		    <li><a href="#tabsJSON">JSON</a></li>
		    <li><a href="#tabsJAVA">JAVA</a></li>
		  </ul>
		  <div id="tabsHTML"></div>
		  <div id="tabsCSS"></div>
		  <div id="tabsJAVASCRIPT"></div>
		  <div id="tabsJSON"></div>		
		  <div id="tabsJAVA"></div>		  
	</div> 
</body>
</html>