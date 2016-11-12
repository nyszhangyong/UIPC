<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>简单文件上传</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <!-- 以下jQuery File Upload功能引用 -->
	<script src="../js/jQuery-File-Upload-9.12.2/js/vendor/jquery.ui.widget.js"></script>
	<script src="../js/jQuery-File-Upload-9.12.2/js/jquery.iframe-transport.js"></script>
	<script src="../js/jQuery-File-Upload-9.12.2/js/jquery.fileupload.js"></script>
    <!-- 以下私有功能引用 -->
	<script src="../js/js_self/demo_form_simple_fileUpload.js" type="text/javascript" ></script>
	<link href="../css/demo_form_simple_fileUpload.css" rel="stylesheet" type="text/css" >
</head>
<body>
<input id="fileupload" type="file" name="fileupload" data-url="/UIPC/server/controller/demo_form_simple_fileUploadController/upload" multiple>   
</body>
</html>