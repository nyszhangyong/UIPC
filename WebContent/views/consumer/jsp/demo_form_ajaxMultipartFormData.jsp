<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>提交多文件和数组数据(AJAX)</title>
	<!-- 作者：张勇(Mark Smith) -->
	<link rel="stylesheet" type="text/css" href="../css/demo_form_ajaxMultipartFormData.css">
	<script type="text/javascript" src="../js/js_jquery/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="../js/js_self/demo_form_ajaxMultipartFormData.js"></script>
</head>
<body>
    <br/><br/><br/>
	<div id="MostOutsideDiv">
		<form id="userInfoForm"  method="post" enctype="multipart/form-data">
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
					<td colspan="6"><input type="button" id="userInfoButton" value="提交"></td>
				</tr>
				<tr>
					<td colspan="6" id="return_result"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>