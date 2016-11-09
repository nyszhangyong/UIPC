$(function(){
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
    $("#tabs").tabs();
    $("#jsppage").load(basePath+"/views/demo/jsp/demo_form_simple_login.jsp");
    $.ajax({
        url: basePath+"/views/demo/jsp/demo_form_simple_login.jsp",
        type: "GET",
        success: function(data){
            $("#code_html").val(data);
            var code_html = document.getElementById("code_html");
            code_html.value = $("#code_html").val();
            window.editor_html = CodeMirror.fromTextArea(code_html, {
              mode: "text/html",
              lineNumbers: true,
              lineWrapping: true,
              extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
              foldGutter: true,
              gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
            });
        }
    });
    $.ajax({
        url: basePath+"/views/demo/css/demo_form_simple_login.css",
        type: "GET",
        success: function(data){
            $("#code_css").val(data);
            var code_css = document.getElementById("code_css");
            code_css.value = $("#code_css").val();
            window.editor_markdown = CodeMirror.fromTextArea(code_css, {
              mode: "markdown",
              lineNumbers: true,
              lineWrapping: true,
              extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
              foldGutter: true,
              gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
            });	  
        }
    });
    $.ajax({
        url: basePath+"/views/demo/js/js_self/demo_form_simple_login.js",
        type: "GET",
        success: function(data){
            $("#code_javascript").val(data);
            var code_javascript = document.getElementById("code_javascript");
            code_javascript.value =$("#code_javascript").val();
            window.editor = CodeMirror.fromTextArea(code_javascript, {
              mode: "javascript",
              lineNumbers: true,
              lineWrapping: true,
              extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
              foldGutter: true,
              gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
            });
        }
    });
});