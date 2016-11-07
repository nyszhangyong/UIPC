$(function(){
   $("#userInfoButton").on('click',function(){
	   var opt={
                type:"POST",
				url: "/UIPC/server/controller/demo_form_multipartFormDataController/receiveUserInfo", 
				contentType:"multipart/form-data",
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