<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>轮播图</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <!-- 以下私有功能引用 -->
	<script src="../js/js_self/demo_query_carousel.js" type="text/javascript" ></script>
	<link href="../css/demo_query_carousel.css" rel="stylesheet" type="text/css" >
    
</head>
<body>
	<div class="slider">
		<ul class="slider-main">
			<li class="slider-panel">
			   <a href="#" target="_blank">
			        <img src="../images/demo_query_carousel/image1.jpg">
			   </a>
			</li>
			<li class="slider-panel">
			   <a href="#" target="_blank">
			        <img src="../images/demo_query_carousel/image2.jpg">
			   </a>
			</li>
			<li class="slider-panel">
			   <a href="#" target="_blank">
			        <img src="../images/demo_query_carousel/image3.jpg">
			   </a>
			</li>
			<li class="slider-panel">
			   <a href="#" target="_blank">
			        <img src="../images/demo_query_carousel/image4.jpg">
			   </a>
			</li>
		</ul>
		<div class="slider-extra">
			<ul class="slider-nav">
				<li class="slider-item">1</li>
				<li class="slider-item">2</li>
				<li class="slider-item">3</li>
				<li class="slider-item">4</li>
			</ul>
			<div class="slider-page">
				<a class="slider-pre"  href="javascript:;;">&lt;</a> 
				<a class="slider-next" href="javascript:;;">&gt;</a>
			</div>
		</div>
	</div>
</body>
</html>