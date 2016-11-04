<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>演示目录</title>
	<!-- 作者：张勇(Mark Smith) -->
    <script src="js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">
    <style type="text/css">
	    .examples {padding-left: 10px;}
    </style>
    <script type="text/javascript">
        jQuery(document).ready(function () {
            $("#accordion").accordion();
            $("#demoFrame").attr("src", "./test_files/index.html");
        });
    </script>
</head>
<body style="margin-top: 0px;">
	<h3 style="text-align: center;">HTML5+CSS3+JQUERY+JAVA 演示例子 一览表</h3>
    <form id="Form1">
        <div id="wrap">
            <table cellspacing="10" cellpadding="10">
                <tbody><tr>
                    <td width="250px" style="vertical-align: top">
                        <div id="accordion" style="font-size: 75%; height: 600px; width: 240px;" class="ui-accordion ui-widget ui-helper-reset" role="tablist">
                            <h3 class="ui-accordion-header ui-helper-reset ui-state-default ui-accordion-header-active ui-state-active ui-corner-top ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-0" aria-controls="ui-accordion-accordion-panel-0" aria-selected="true" aria-expanded="true" tabindex="0"><span class="ui-accordion-header-icon ui-icon ui-icon-triangle-1-s"></span><a href="#">表单类例子</a></h3>
                            <div class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active" id="ui-accordion-accordion-panel-0" aria-labelledby="ui-accordion-accordion-header-0" role="tabpanel" aria-hidden="false" style="display: block; height: 309px;">
                                <ul class="examples">
                                    <li>
                                    <a href="jsp/demo_form_login.jsp" target="demoFrame">简单登录</a>                                        
                                    </li>
                                </ul>
                            </div>
                            <h3 class="ui-accordion-header ui-helper-reset ui-state-default ui-corner-all ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-5" aria-controls="ui-accordion-accordion-panel-5" aria-selected="false" aria-expanded="false" tabindex="-1"><span class="ui-accordion-header-icon ui-icon ui-icon-triangle-1-e"></span><a href="#">查询类例子</a></h3>
                            <div class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom" id="ui-accordion-accordion-panel-5" aria-labelledby="ui-accordion-accordion-header-5" role="tabpanel" aria-hidden="true" style="display: none; height: 309px;">
                                <ul class="examples">
                                    <li>
                                       <a href="./test_files/index.html" target="demoFrame">Paging on the server</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </td>
                    <td width="800px" valign="top">
                        <iframe id="demoFrame" name="demoFrame" style="width: 800px; height: 1000px; border-width: 0;" src="./test_files/index.html"></iframe>
                    </td>
                </tr>
            </tbody></table>
        </div>
    </form>
</body></html>