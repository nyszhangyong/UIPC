
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
            var code_html = document.getElementById("code-html");
            code_html.value = document.documentElement.innerHTML;
            window.editor_code_html = CodeMirror.fromTextArea(code_html, {
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
        url: basePath+"/views/demo/css/demo_form_login_main.css",
        type: "GET",
        success: function(data){
            $("#code-css").val(data);
            var code_css = document.getElementById("code-css");
            code_css.value = code_css.val();
            window.editor_code_css = CodeMirror.fromTextArea(code_css, {
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
        url: basePath+"/views/demo/js/js_self/demo_form_login_main.js",
        type: "GET",
        success: function(data){
            $("#code-javascript").val(data);
            var code_javascript = document.getElementById("code-javascript");
            code_javascript.value = code_javascript.val();
            window.editor_code_javascript = CodeMirror.fromTextArea(code_javascript, {
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