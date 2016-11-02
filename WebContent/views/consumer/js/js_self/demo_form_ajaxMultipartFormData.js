$(function(){
   $("#userInfoButton").on('click',function(){
		$.ajax({ 
			type: "POST", 
			url: "/UIPC/server/controller/demo_form_multipartFormDataController/receiveUserInfo", 
			data: $("#userInfoForm").serialize(),//serialize方式，表单中的DOM元素的属性必须要有name属性，仅有ID不行
			contentType:"multipart/form-data; boundary=--------",
            dataType: "string",
			success: function(returnMessage) {
				alert("成功！");
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
				alert("失败！");
			}
		}); 
   });
});