<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>简单查询</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
	<script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
	<!-- 以下私有功能引用 -->	
	<script src="../js/js_self/demo_query_simple.js" type="text/javascript"></script>
	<link href="../css/demo_query_simple.css" type="text/css" rel="stylesheet">
</head>
<body>
    <h1>简单查询</h1>
	<div id="MostOutsideDiv">
		<form id="loginForm" method="post">
				<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="userName" id="userName"></td>
				</tr>
				<tr>
					<td>密 码：</td>
					<td><input type="text" name="password" id="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="button" id="loginbtn" value="查询密码"></td>
				</tr>
				<tr>
					<td id="login_result" colspan="2" ></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>