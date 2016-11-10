<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>简单文件上传</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <!-- 以下私有功能引用 -->
	<script src="../js/js_self/demo_form_simple_fileUpload.js" type="text/javascript" ></script>
	<link href="../css/demo_form_simple_fileUpload.css" rel="stylesheet" type="text/css" >
</head>
<body>
    <h1>简单文件上传</h1>
	<div id="MostOutsideDiv">
		<form id="loginForm" method="post">
				<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="userName" id="userName"></td>
				</tr>
				<tr>
					<td>密 码：</td>
					<td><input type="password" name="password" id="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="button" id="loginbtn" value="登录"></td>
				</tr>
				<tr>
					<td id="login_result" colspan="2" ></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>