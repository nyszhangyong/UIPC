
$(function(){
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
    $("#tabs").tabs();
    $("#jsppage").load(basePath+"/views/demo/jsp/demo_form_noAjaxMultipartFormData.jsp");
    $.ajax({
        url: basePath+"/views/demo/jsp/demo_form_noAjaxMultipartFormData.jsp",
        type: "GET",
        success: function(data){
            $("#tabsHTML").val(data);
            editor = CodeMirror(document.getElementById("tabsHTML"), {
                mode: "text/html",
                extraKeys: {"Ctrl-Space": "autocomplete"},
                value: document.documentElement.innerHTML
              });
        }
    });
});