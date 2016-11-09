$(function(){
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
    $("#tabs").tabs();
    $("#jsppage").load(basePath+"/views/demo/jsp/demo_form_login.jsp");
    
    var code_javascript = document.getElementById("code_javascript");
    code_javascript.value ="66666666666";
    window.editor = CodeMirror.fromTextArea(code_javascript, {
      mode: "javascript",
      lineNumbers: true,
      lineWrapping: true,
      extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
      foldGutter: true,
      gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });

    var code_html = document.getElementById("code_html");
    code_html.value = document.documentElement.innerHTML;
    window.editor_html = CodeMirror.fromTextArea(code_html, {
      mode: "text/html",
      lineNumbers: true,
      lineWrapping: true,
      extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
      foldGutter: true,
      gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });


    var code_css = document.getElementById("code_css");
    code_css.value = "# Foo\n## Bar\n\nblah blah\n\n## Baz\n\nblah blah\n\n# Quux\n\nblah blah\n"
    window.editor_markdown = CodeMirror.fromTextArea(code_css, {
      mode: "markdown",
      lineNumbers: true,
      lineWrapping: true,
      extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
      foldGutter: true,
      gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });	  
});