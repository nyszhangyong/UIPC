$(function(){
   $("#loginbtn").on('click',function(){
		$.ajax({ 
			type: "post", 
			url: "/UIPC/server/controller/demo_query_loginController/loginConfirmation", 
			data: "userName="+$("#userName").val(),
			success: function(returnMessage) {
				//alert(returnMessage);
				var obj = jQuery.parseJSON(returnMessage)
				$("#userName").val(obj.userName);
				$("#password").val(obj.password);
				$("#login_result").text("获得密码成功！");
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
				$("#login_result").text("获得密码失败！");
			}
		}); 
   });
});