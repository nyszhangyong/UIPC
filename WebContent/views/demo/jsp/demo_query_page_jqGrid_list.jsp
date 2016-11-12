<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>查询分页列表(jqGrid)</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
	<script type="text/javascript" src="../js/js_jquery/jquery-1.11.3.min.js"></script>
	<!-- 以下guriddo_jqGrid功能引用 -->
	<script type="text/ecmascript" src="../js/js_guriddo_jqGrid_JS_5.1.1/js/i18n/grid.locale-en.js"></script>
	<script type="text/ecmascript" src="../js/js_guriddo_jqGrid_JS_5.1.1/src/jquery.jqGrid.js"></script>
	<link rel="stylesheet" type="text/css" media="screen" href="../js/js_guriddo_jqGrid_JS_5.1.1/src/css/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" />
	<!-- 以下私有功能引用 -->	
	<script type="text/javascript" src="../js/js_self/demo_query_page_jqGrid_list.js"></script>
    <link href="../css/demo_query_page_jqGrid_list.css" rel="stylesheet" type="text/css" >
</head>
<body>
    <h1>查询分页列表(jqGrid)</h1>
    <table id="jqGrid"></table>
    <div id="jqGridPager"></div>
</body>
</html>