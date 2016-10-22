<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录表单(001)</title>
<link rel="stylesheet" type="text/css" href="../css/login_001.css">
<script type="text/javascript" src="../js_jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" >
$(function(){
   $("#loginbtn").on('click',function(){
		$.ajax({ 
			type: "post", 
			url: "/UIPC/server/controller/authenticationController/loginConfirmation", 
			data: $("#loginForm").serialize(),//serialize方式，表单中的DOM元素的属性必须要有name属性，仅有ID不行
			success: function(returnMessage) {
				alert(returnMessage);
				var obj = jQuery.parseJSON(returnMessage)
				$("#userName").val(obj.userName);
				$("#password").val(obj.password);
				$("#login_result").text("登录成功！");
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
				$("#login_result").text("登录失败！");
			}
		}); 
   });
});
</script>
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