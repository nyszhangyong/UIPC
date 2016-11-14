<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="jsp/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>WEB前端开发-代码样例集合</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">
    <!-- 以下私有功能引用 -->
    <script src="js/js_self/demoCatalog.js" type="text/javascript"></script>
    <link   href="css/demoCatalog.css" type="text/css" rel="stylesheet" media="screen">
</head>
<body>
	<div id="MostOutsideDiv">
	    <br/>
     	<h3 style="text-align: center;">WEB前端开发-代码样例集合</h3>
	    <form id="Form1">
	        <div id="wrap">
	            <table cellspacing="10" cellpadding="10">
	                <tbody><tr>
	                    <td width="250px" style="vertical-align: top">
	                        <div id="accordion" class="ui-accordion ui-widget ui-helper-reset" role="tablist">
	                            <h3 class="ui-accordion-header ui-helper-reset ui-state-default ui-accordion-header-active ui-state-active ui-corner-top ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-0" aria-controls="ui-accordion-accordion-panel-0" aria-selected="true" aria-expanded="true" tabindex="0"><span class="ui-accordion-header-icon ui-icon ui-icon-triangle-1-s"></span><a href="#">表单类例子</a></h3>
	                            <div class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active" id="ui-accordion-accordion-panel-0" aria-labelledby="ui-accordion-accordion-header-0" role="tabpanel" aria-hidden="false" style="display: block; height: 309px;">
	                                <ul class="examples">
	                                    <li><a href="jsp/demo_form_simple_login_main.jsp" target="demoFrame">简单登录</a></li>
	                                    <li><a href="jsp/demo_form_simple_picture_preview_main.jsp" target="demoFrame">简单图片预览</a></li>
	                                    <li><a href="jsp/demo_form_simple_fileUpload_main.jsp" target="demoFrame">简单文件上传</a></li>
	                                    <li><a href="jsp/demo_form_noAjaxMultipartFormData_main.jsp" target="demoFrame">提交多文件和数组数据(非AJAX)</a></li>
	                                    <li><a href="jsp/demo_form_ajaxMultipartFormData_main.jsp" target="demoFrame">提交多文件和数组数据(AJAX)</a></li>                                  
	                                </ul>
	                            </div>
	                            <h3 class="ui-accordion-header ui-helper-reset ui-state-default ui-corner-all ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-5" aria-controls="ui-accordion-accordion-panel-5" aria-selected="false" aria-expanded="false" tabindex="-1"><span class="ui-accordion-header-icon ui-icon ui-icon-triangle-1-e"></span><a href="#">查询类例子</a></h3>
	                            <div class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom" id="ui-accordion-accordion-panel-5" aria-labelledby="ui-accordion-accordion-header-5" role="tabpanel" aria-hidden="true" style="display: none; height: 309px;">
	                                <ul class="examples">
	                                    <li><a href="jsp/demo_query_simple_main.jsp" target="demoFrame">简单查询</a></li>
	                                    <li><a href="jsp/demo_query_page_custom_list_main.jsp" target="demoFrame">查询分页列表(custom)</a></li>
	                                    <li><a href="jsp/demo_query_page_jqGrid_list_main.jsp" target="demoFrame">查询分页列表(jqGrid)</a></li>                                   
	                                </ul>
	                            </div>
	                        </div>
	                    </td>
	                    <td width="800px" valign="top">
	                        <iframe id="demoFrame" name="demoFrame"  scrolling="no" onload="changeFrameHeight()" frameborder="0"></iframe>
	                    </td>
	                </tr>
	            </tbody></table>
	        </div>
	    </form>
	</div>
</body>
</html>