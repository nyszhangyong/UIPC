$(function(){
   var location = (window.location+'').split('/'); 
   var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
   $("#userInfoButton").on('click',function(){
	   var opt={
                type:"POST",
				url: basePath+"/server/controller/demo_form_multipartFormDataController/receiveUserInfo", 
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