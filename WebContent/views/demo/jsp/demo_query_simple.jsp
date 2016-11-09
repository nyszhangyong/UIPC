<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>简单查询</title>
	<!-- 作者：张勇(Mark Smith) -->
	<link rel="stylesheet" type="text/css" href="../css/demo_query_simple.css">
	<script type="text/javascript" src="../js/js_jquery/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="../js/js_self/demo_query_simple.js"></script>
</head>
<body>
    <br/><br/><br/>
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