<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>提交多文件和数组数据(非AJAX)</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
	<script type="text/javascript" src="../js/js_jquery/jquery-1.11.3.min.js"></script>
	<!-- 以下私有功能引用 -->
	<script type="text/javascript" src="../js/js_self/demo_form_noAjaxMultipartFormData.js"></script>
	<link rel="stylesheet" type="text/css" href="../css/demo_form_noAjaxMultipartFormData.css">

</head>
<body>
    <h1>提交多文件和数组数据(非AJAX)</h1>
	<div id="MostOutsideDiv">
		<form id="userInfoForm"  method="post" enctype="multipart/form-data" action="/UIPC/server/controller/demo_form_multipartFormDataController/receiveUserInfo">
			<table>
				<tr>
					<td>头像：</td>
					<td><input type="file" name="userList[0].headPhotoFile" id="userList[0].headPhotoFile"/></td>
					<td>用户名：</td>
					<td><input type="text" name="userList[0].userName" id="userList[0].userName" value="zhangsan"></td>
					<td>密 码：</td>
					<td><input type="text" name="userList[0].password" id="userList[0].password" value="123"></td>
				</tr>
				<tr>
					<td>头像：</td>
					<td><input type="file" name="userList[1].headPhotoFile" id="userList[1].headPhotoFile"/></td>
					<td>用户名：</td>
					<td><input type="text" name="userList[1].userName" id="userList[1].userName" value="lisi"></td>
					<td>密 码：</td>
					<td><input type="text" name="userList[1].password" id="userList[1].password" value="456"></td>
				</tr>
				<tr>
					<td colspan="6"><input type="submit" id="userInfoButton" value="提交"></td>
				</tr>
				<tr>
					<td colspan="6" id="return_result"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>