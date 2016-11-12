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
	<script>
		$(function () {
		    $("#up").uploadPreview({ Img: "ImgPr", Width: 120, Height: 120 });
		});
    </script>
</head>
<body>
<div style="width:500px;margin:0px auto;"><h2>图片上传预览演示</h2>
<div><img id="ImgPr" width="120" height="120" /></div>
<input type="file" id="up" name="up" />
</div>
</body>
</html>