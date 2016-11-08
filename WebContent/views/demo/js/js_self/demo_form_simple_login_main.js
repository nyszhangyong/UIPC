$(function(){
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
    $("#tabs").tabs();
    $("#jsppage").load(basePath+"/views/demo/jsp/demo_form_login.jsp");
    
    var te = document.getElementById("code_javascript");
    te.value ="66666666666";
    window.editor = CodeMirror.fromTextArea(te, {
      mode: "javascript",
      lineNumbers: true,
      lineWrapping: true,
      extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
      foldGutter: true,
      gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });

    var te_html = document.getElementById("code-html");
    te_html.value = document.documentElement.innerHTML;
    window.editor_html = CodeMirror.fromTextArea(te_html, {
      mode: "text/html",
      lineNumbers: true,
      lineWrapping: true,
      extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
      foldGutter: true,
      gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });


    var te_markdown = document.getElementById("code-markdown");
    te_markdown.value = "# Foo\n## Bar\n\nblah blah\n\n## Baz\n\nblah blah\n\n# Quux\n\nblah blah\n"
    window.editor_markdown = CodeMirror.fromTextArea(te_markdown, {
      mode: "markdown",
      lineNumbers: true,
      lineWrapping: true,
      extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
      foldGutter: true,
      gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });	  
});