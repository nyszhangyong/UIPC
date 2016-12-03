﻿<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>商品导航目录（版本B）</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">

    <link rel="stylesheet" type="text/css" href="../css/demo_query_navigation_b_main.css">
</head>
<body>
<div class="header-wrap">
 <div class="navwrap">
  <div id="nav">
   <div class="navbar clearfix">
     <a class="navbt" href="#" target="_blank" title="团购地图"><span>团购地图</span></a>
     <a class="current" href="#">首页</a>
     <a class="" href="#">餐饮美食</a>
     <a class="" href="#">休闲娱乐</a>
     <a class="" href="#">旅游住宿</a>
     <a class="" href="#">生活服务</a>
     <a class="" href="#">丽人</a>
     <a class="" href="#">商品</a>
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
       <span><em > <a href="#" title="海鲜">海鲜(37)</a> </em></span>
       <span><em > <a href="#" title="地方菜">地方菜(5)</a> </em></span>
       <span><em > <a href="#" title="日韩料理">日韩料理(2)</a> </em></span>
       <span><em > <a href="#" title="快餐">快餐(2)</a> </em></span>
       <span><em class="morehot"> <a class="morehot" href="#" title="蛋糕">蛋糕(9)</a> </em></span>
       <span><em > <a href="#" title="其他">其他(7)</a> </em></span>
       <span><em > <a href="#" title="下午茶">下午茶(5)</a> </em></span>
       <span><em > <a href="#" title="咖啡">咖啡(8)</a> </em></span>
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
       <span><em > <a href="#" title="游乐电玩">游乐电玩(48)</a> </em></span>
       <span><em > <a href="#" title="展览演出">展览演出(13)</a> </em></span>
       <span><em class="morehot"> <a class="morehot" href="#" title="足疗按摩">足疗按摩(8)</a> </em></span>
       <span><em > <a href="#" title="洗浴">洗浴(11)</a> </em></span>
       <span><em > <a href="#" title="其他">其他(29)</a> </em></span>
       <span><em > <a href="#" title="采摘">采摘(2)</a> </em></span
       ><span><em > <a href="#" title="滑雪">滑雪(4)</a> </em></span>
       <span><em > <a href="#" title="温泉">温泉(427)</a> </em></span>
     </div>
     </li>
     
     <li class="travel" mon="type=subnav&action=click"><i>&gt;</i>
     <a class="ti" href="#" title="旅游">旅游</a>
     <a class="hot" href="#" title="酒店">酒店</a>
     <a href="#" title="旅游">旅游</a>
     <div class="prosmore hide">
      <span><em > <a href="#" title="全部">全部(13602)</a> </em></span>
      <span><em class="morehot"> <a class="morehot" href="#" title="酒店">酒店(9044)</a> </em></span>
      <span><em > <a href="#" title="旅游">旅游(1775)</a> </em></span>
      <span><em > <a href="#" title="景点公园">景点公园(935)</a> </em></span>
      <span><em > <a href="#" title="其他">其他(1848)</a> </em></span>
     </div>
     </li>
     
     <li class="life" mon="type=subnav&action=click"><i>&gt;</i>
     <a class="ti" href="#" title="生活">生活</a>
     <a href="#" title="婚纱摄影">婚纱摄影</a>
     <a href="#" title="写真">写真</a>
      <div class="prosmore hide">
      <span><em > <a href="#" title="全部">全部(333)</a> </em></span>
      <span><em > <a href="#" title="写真">写真(9)</a> </em></span>
      <span><em class="morehot"> <a class="morehot" href="#" title="婚纱摄影">婚纱摄影(212)</a> </em></span>
      <span><em > <a href="#" title="儿童摄影">儿童摄影(1)</a> </em></span>
      <span><em > <a href="#" title="汽车养护">汽车养护(3)</a> </em></span>
      <span><em > <a href="#" title="教育培训">教育培训(91)</a> </em></span>
      <span><em > <a href="#" title="体检">体检(8)</a> </em></span>
      <span><em > <a href="#" title="口腔">口腔(1)</a> </em></span>
      <span><em > <a href="#" title="其他">其他(8)</a> </em></span>
      </div>
     </li>
     
     <li class="women" mon="type=subnav&action=click"><i>&gt;</i>
     <a class="ti" href="#" title="丽人">丽人</a>
     <a href="#" title="美发">美发</a>
     <a href="#" title="美容美体">美容美体</a>
     <div class="prosmore hide">
     <span><em ><a href="#" title="全部">全部(14)</a> </em></span>
     <span><em class="morehot"> <a class="morehot" href="#" title="美发">美发(7)</a> </em></span>
     <span><em ><a href="#" title="美甲">美甲(3)</a> </em></span>
     <span><em ><a href="#" title="美容美体">美容美体(4)</a> </em></span> </div>
     </li>
     
     <li class="goods bd-solid" mon="type=subnav&action=click"><i>&gt;</i>
     <a class="ti" href="#" title="商品">商品</a>
     <a href="#" title="服装">服装</a>
     <a href="#" title="鞋靴">鞋靴</a>
     <div class="prosmore hide">
     <span><em > <a href="#" title="全部">全部(112343)</a></em></span>
     <span><em class="morehot"> <a class="morehot" href="#" title="服装">服装(32747)</a> </em></span>
     <span><em > <a href="#" title="生活家居">生活家居(14441)</a> </em></span>
     <span><em > <a href="#" title="食品饮料">食品饮料(10116)</a> </em></span>
     <span><em > <a href="#" title="化妆品">化妆品(12707)</a> </em></span>
     <span><em > <a href="#" title="箱包">箱包(7621)</a> </em></span>
     <span><em > <a href="#" title="家用电器">家用电器(3775)</a> </em></span>
     <span><em > <a href="#" title="手机数码">手机数码(3639)</a> </em></span>
     <span><em > <a href="#" title="鞋靴">鞋靴(11686)</a> </em></span>
     <span><em > <a href="#" title="饰品">饰品(4558)</a> </em></span>
     <span><em > <a href="#" title="手表">手表(1482)</a> </em></span>
     <span><em > <a href="#" title="母婴用品">母婴用品(3659)</a> </em></span>
     <span><em > <a href="#" title="玩具">玩具(777)</a> </em></span>
     <span><em > <a href="#" title="抽奖">抽奖(7)</a> </em></span>
     <span><em > <a href="#" title="礼品">礼品(197)</a> </em></span>
     <span><em > <a href="#" title="其他">其他(4931)</a> </em></span></div>
     </li>
     
     <li class="hotareas nochild last" mon="type=hotword&action=click">
      <h2>热门搜索</h2>
      <br />
      <a class="mhs" target="_blank" href="#">美食</a>
      <a class="mhs" target="_blank" href="#">游泳</a>
      <a class="mhs" target="_blank" href="#">蛋糕</a>
      <a class="mhs" target="_blank" href="#">电影</a>
      <a class="mhs" target="_blank" href="#">眼镜</a>
      <a class="mhs" target="_blank" href="#">自助餐</a>
      <a class="mhs" target="_blank" href="#">酒吧</a>
      <a class="mhs" target="_blank" href="#">美甲</a>
      </li>
    </ul>
   </div>
  </div>
 </div>
</div>
<script type="text/javascript">
(function() {
    var $subblock = $(".subpage"),
    $head = $subblock.find('h2'),
    $ul = $("#proinfo"),
    $lis = $ul.find("li"),
    inter = false;
    $head.click(function(e) {
        e.stopPropagation();
        if (!inter) {
            $ul.show();
        } else {
            $ul.hide();
        }
        inter = !inter;
    });
    $ul.click(function(event) {
        event.stopPropagation();
    });
    $('body').click(function() {
        $ul.hide();
        inter = !inter;
    });
    $lis.hover(function() {
        if (!$(this).hasClass('nochild')) {
            $(this).addClass("prosahover");
            $(this).find(".prosmore").removeClass('hide');
        }
    },
    function() {
        if (!$(this).hasClass('nochild')) {
            if ($(this).hasClass("prosahover")) {
                $(this).removeClass("prosahover");
            }
            $(this).find(".prosmore").addClass('hide');
        }
    });
})();
</script>
<div style="text-align:center;">
<p>来源：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>
</html>
