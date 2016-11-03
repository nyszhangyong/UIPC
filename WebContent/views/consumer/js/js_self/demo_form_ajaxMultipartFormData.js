$(function(){
   $("#userInfoButton").on('click',function(){
	   var opt={
				url: "/UIPC/server/controller/demo_form_multipartFormDataController/receiveUserInfo", 
				success: function(returnMessage) {
					alert("成功！");
				},
				error: function(XMLHttpRequest, textStatus, errorThrown) {
					alert("失败！");
				}
	   };
	   $("#userInfoForm").ajaxSubmit(opt);
   });
});