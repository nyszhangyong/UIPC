$(function(){
   var location = (window.location+'').split('/'); 
   var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
   $("#loginbtn").on('click',function(){
		$.ajax({ 
			type: "post", 
			url: basePath+"/server/controller/demo_query_loginController/loginConfirmation", 
			data: "userName="+$("#userName").val(),
			success: function(returnMessage) {
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