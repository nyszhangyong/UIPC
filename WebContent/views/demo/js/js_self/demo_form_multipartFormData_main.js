
$(function(){
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
    $("#tabs").tabs({
        //配置当前打开的选项卡的索引，active属性的值可以使用bool值，也可以使用int值，默认为1  
        //bool值仅当collapsible属性为true时可以使用，表示默认选项卡为折叠状态  
        //如果是int值，表示当前打开的选项卡的索引，如果是负数将从最后的选项卡开始索引  
        active : 0,
        //配置选项卡是否可以折叠，默认是false
        collapsible : false,
        //禁用选项卡，可以使用bool值或者int数组，但是用了感觉没效果啊，因为是disabled，不是disable，fuck  
        disabled : false,
        //激活选项卡的方式，默认为click  
        //"mouseover"表示鼠标移动到标题上即激活选项卡  
        //"click"表示鼠标点击激活选项卡  
        event : "click",  
        //设置选项卡高度，可以配置为"auto","fill","content"，默认为"content"  
        //"auto"表示选项卡高度将被设置成最高的那个选项卡的高度  
        //"fill"表示扩展到基于选项卡的父容器的可用高度  
        //"content"表示每个选项卡将以自身内容为高度  
        heightStyle : "content",  
        //设置选项卡隐藏的方式,可以设置bool值，number值，String值或者Object，默认值为null  
        //bool值表示是否有隐藏特效，如果为true，将以默认的时间和动画淡出选项卡  
        //number值表示选项卡将以指定的时间（单位毫秒）和默认动画淡出。  
        //String值表示选项卡将以指定的动画效果隐藏，动画时间为默认值  
        //Object值表示可以配置动画的类型和动画时间以及动画的延迟时间,effect,delay,duration,easing  
        hide : "slideUp",  
        //设置选项卡显示的方式，参数和hide相同  
        show : "blind",  
        //设置选项卡激活之后的回调方法，即点击另外一个选项卡在show动画完成之后执行的方法  
        //传入的ui对象有四个属性，他们都是Jquery对象  
        //一个是newTab，代表新的选项卡，  
        //一个是newPanel，代表新的选项卡的面板  
        //一个是oldTab，代表旧的选项卡  
        //一个是oldPanel，代表旧的选项卡的面板  
        //也可以使用绑定的方式将该事件绑定到选项卡上:$("#tabs").on("tabsactivate",function(event,ui){});  
        activate : function(event, ui) {  
        	if(ui.newPanel.attr("id")=="tabsHTML") {
        		//alert("tabsHTML选项卡已激活");  
            }else if(ui.newPanel.attr("id")=="tabsCSS") {
        		//alert("tabsCSS选项卡已激活");  
            }else if(ui.newPanel.attr("id")=="tabsJAVASCRIPT") {
        		//alert("tabsJAVASCRIPT选项卡已激活"); 
            }
            
        },  
        //设置选项卡即将激活的回调方法，可以阻止选项卡激活，传入的参数和activate事件相同，也可以使用绑定的方式将该事件绑定到选项卡上  
        beforeActivate : function(event, ui) {  
            //alert("选项卡即将激活");  
        },  
        //设置选项卡内容加载之前的回调方法，只有使用ajax加载内容的选项卡即将激活之后才会触发该事件  
        //传入的ui对象中有四个属性  
        //一个是tab，即将被加载的选项卡  
        //一个是panel，即将被加载的选项卡面板  
        //一个是jqXHR，发送请求的jquery封装的XMLHttpRequest对象  
        //一个是ajaxSettings，ajax请求的配置属性  
        beforeLoad : function(event, ui) {  
            //alert("选项卡内容即将加载");  
        } 
    });
    $("#jsppage").load(basePath+"/views/demo/jsp/demo_form_multipartFormData.jsp");
    $.ajax({
        url: basePath+"/views/demo/jsp/demo_form_multipartFormData.jsp",
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
        url: basePath+"/views/demo/css/demo_form_multipartFormData.css",
        type: "GET",
        success: function(data){
            $("#code_css").val(data);
            var code_css = document.getElementById("code_css");
            code_css.value = $("#code_css").val();
            window.editor_css = CodeMirror.fromTextArea(code_css, {
              mode: "markdown",
              lineNumbers: true,
              lineWrapping: true,
              extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
              foldGutter: true,
              gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
            });	  
            $("#tabsCSS").show();
            setTimeout(function(){
            	editor_css.refresh();
            },200);
        }
    });
    $.ajax({
        url: basePath+"/views/demo/js/js_self/demo_form_multipartFormData.js",
        type: "GET",
        success: function(data){
            $("#code_javascript").val(data);
            var code_javascript = document.getElementById("code_javascript");
            code_javascript.value =$("#code_javascript").val();
            window.editor_javascript = CodeMirror.fromTextArea(code_javascript, {
              mode: "javascript",
              lineNumbers: true,
              lineWrapping: true,
              extraKeys: {"Ctrl-Q": function(cm){ cm.foldCode(cm.getCursor()); }},
              foldGutter: true,
              gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
            });
            $("#tabsJAVASCRIPT").show();
            setTimeout(function(){
            	editor_javascript.refresh();
            },200);
        }
    });
});