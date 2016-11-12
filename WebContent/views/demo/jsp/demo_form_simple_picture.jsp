<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>简单图片上传（预览）</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <!-- 以下私有功能引用 -->
	<script src="../js/js_self/demo_form_simple_picture.js" type="text/javascript" ></script>
	<link href="../css/demo_form_simple_picture.css" rel="stylesheet" type="text/css" >
</head>
<body>
<img id="pic" src=""/>
<input id="upload" name="file" accept="image/*" type="file" style="display: none"/>   
</body>
</html>