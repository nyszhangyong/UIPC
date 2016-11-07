
$(function(){
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
    $("#tabs").tabs();
    $("#jsppage").load(basePath+"/views/demo/jsp/demo_form_login.jsp");
    $.ajax({
        url: basePath+"/views/demo/jsp/demo_form_login.jsp",
        type: "GET",
        success: function(data){
            $("#code-html").val(data);
        }
    });
    $.ajax({
        url: basePath+"/views/demo/css/demo_form_login_main.css",
        type: "GET",
        success: function(data){
            $("#code-css").val(data);
        }
    });   
    $.ajax({
        url: basePath+"/views/demo/js/js_self/demo_form_login_main.js",
        type: "GET",
        success: function(data){
            $("#code-javascript").val(data);
        }
    });        
});