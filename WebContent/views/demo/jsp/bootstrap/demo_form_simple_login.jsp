<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="UTF-8">
	<!-- Bootstrap不支持 IE古老的兼容模式。为了让 IE 浏览器运行在最新的渲染模式下，建议将此 <meta> 标签加入到你的页面中： -->
	<!-- 此 meta 标签被包含在了所有 Bootstrap 文档和实例页面中，为的就是在每个被支持的 IE 版本中拥有最好的绘制效果。 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- 国内浏览器厂商一般都支持兼容模式（即 IE 内核）和高速模式（即 webkit 内核）， -->
	<!-- 不幸的是，所有国产浏览器都是默认使用兼容模式，这就造成由于低版本 IE （IE8 及以下）内核让基于 Bootstrap 构建的网站展现效果很糟糕的情况。 -->
	<!-- 将下面的 <meta> 标签加入到页面中，可以让部分国产浏览器默认采用高速模式渲染页面 -->
	<meta name="renderer" content="webkit">
	<!-- 为了确保适当的绘制和触屏缩放，需要在 <head> 之中添加 viewport 元数据标签。-->
	<!-- 在移动设备浏览器上，通过为视口（viewport）设置 meta 属性为 user-scalable=no 可以禁用其缩放（zooming）功能。 -->
	<!-- 这样禁用缩放功能后，用户只能滚动屏幕，就能让你的网站看上去更像原生应用的感觉。注意，这种方式我们并不推荐所有网站使用，还是要看你自己的情况而定！  -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	
	<title>简单登录</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <!-- 以下Bootstrap功能引用 -->
    <script src="../../js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link href="../../js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- 以下私有功能引用 -->
	<script src="../../js/js_self/bootstrap/demo_form_simple_login.js" type="text/javascript" ></script>
	<link href="../../css/bootstrap/demo_form_simple_login.css" rel="stylesheet" type="text/css" >
</head>
<body>
    <h1>简单登录</h1>
    <div class="container">
      <form class="form-signin" role="form">
        <input type="email" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    </div>
</body>
</html>