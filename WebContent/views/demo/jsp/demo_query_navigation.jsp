<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>商品导航目录</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
  	<!-- 以下私有功能引用 --> 
	<script src="../js/js_self/demo_query_navigation.js" type="text/javascript"></script>
    <link   href="../css/demo_query_navigation.css" type="text/css" rel="stylesheet" media="screen">
</head>
<body>
	<div class="header-wrap">
		 <div class="navwrap">
			  <div id="nav">
					   <div class="navbar clearfix">
						     <a class="current" href="#">首页</a>
						     <a class="" href="#">餐饮美食</a>
						     <a class="" href="#">休闲娱乐</a>
						     <a class="" href="#">健身锻炼</a>
						     <a class="" href="#">美妆丽人</a>						     
					   </div>
					   <div class="pros subpage">
						    <h2>全部团购分类</h2>
						    <ul class="prosul clearfix" id="proinfo">
							     <li class="food" mon="type=subnav&action=click"><i>&gt;</i>
								     <a class="ti" href="#" title="美食">美食</a>
								     <a class="hot" href="#" title="地方菜">地方菜</a>
								     <a href="#" title="火锅">火锅</a>
								     <div class="prosmore hide">
									       <span><em ><a href="#" title="全部">全部(117)</a></em></span>
									       <span><em class="morehot"> <a class="morehot" href="#" title="火锅">火锅(17)</a></em></span>
									       <span><em class="morehot"> <a class="morehot" href="#" title="烧烤">烧烤(16)</a> </em></span>
									       <span><em > <a href="#" title="西餐">西餐(9)</a></em></span>
								     </div>
							     </li>
							     
							     <li class="enjoy" mon="type=subnav&action=click"><i>&gt;</i>
								     <a class="ti" href="#" title="休闲">休闲</a>
								     <a class="hot" href="#" title="电影">电影</a>
								     <a href="#" title="KTV">KTV</a>
								     <div class="prosmore hide">
									       <span><em > <a href="#" title="全部">全部(663)</a> </em></span>
									       <span><em class="morehot"> <a class="morehot" href="#" title="电影">电影(18)</a> </em></span>
									       <span><em class="morehot"> <a class="morehot" href="#" title="KTV">KTV(8)</a> </em></span>
									       <span><em > <a href="#" title="运动健身">运动健身(95)</a> </em></span>
								     </div>
							     </li>
						    </ul>
					   </div>
			  </div>
		 </div>
	</div>
</body>
</html>
