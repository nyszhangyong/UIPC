$(function(){
   var location = (window.location+'').split('/'); 
   var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
   $("#loginbtn").on('click',function(){
		$.ajax({ 
			type: "post", 
			url: basePath+"/server/controller/demo_form_loginController/loginConfirmation", 
			data: $("#loginForm").serialize(),//serialize方式，表单中的DOM元素的属性必须要有name属性，仅有ID不行
			success: function(returnMessage) {
				//alert(returnMessage);
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