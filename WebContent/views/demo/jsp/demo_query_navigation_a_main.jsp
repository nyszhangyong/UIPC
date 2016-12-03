<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>商品导航目录（版本A）</title>
	<!-- 作者：张勇(Mark Smith) -->
	<!-- 以下JQUERY功能引用 -->
    <script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.min.js" type="text/javascript"></script>
    <link   href="../js/js_jquery/jquery-ui-1.11.3/jquery-ui.css" type="text/css" rel="stylesheet" media="screen">
	<!-- 以下私有功能引用 --> 
	<script src="../js/SuperSlide2/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
	<script src="../js/js_self/demo_query_navigation_a_main.js" type="text/javascript"></script>
    <link   href="../css/demo_query_navigation_a_main.css" type="text/css" rel="stylesheet" media="screen">
</head>
<body>
<!-- 代码 开始 -->
<div class="warpper">
	<div class="menu">
    	<ul>
            <li><a href="#">家电城</a><span class="hot"></span></li>
            <li><a href="#">天黑黑</a></li>
            <li><a href="#">团购</a></li>
            <li><a href="#">发现</a></li>
            <li><a href="#">二手特卖</a></li>
            <li><a href="#">源码之家</a><span class="hot"></span></li>
        </ul>
    </div>
    <div id="nav">
    	<div class="mod_cate_hd">全部商品分类</div>
    	<ul class="tit">
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">手机</a><a href="#">数码</a><a class="hot_sub" href="#">合约机</a></h2>
                <p class="mod_cate_r"><a href="#">三星</a><a href="#">联想</a><a href="#">数码相机</a><a href="#">智能设备</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>手机通讯</dt>
                            <dd>
                            	<a href="#">全部手机</a><a href="#">对讲机</a>
                                <i class="mod_subcate_line"></i>
                                <a href="#">三星</a><a href="#">苹果</a><a href="#">华为</a><a href="#">小米</a><a href="#">诺基亚</a><a href="#">联想</a><a href="#">HTC</a><a href="#">索尼</a><a href="#">中兴</a><a href="#">酷派</a><a href="#">海尔</a><a href="#">中国移动</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>运营商</dt>
                            <dd>
                            	<a href="#">购机送费</a><a href="#" class="org">0元购机</a><a href="#">3G上网卡</a><a href="#">选号入网</a><a href="#">充值</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>手机配件</dt>
                            <dd>
                            	<a href="#" class="org">移动电源</a><a href="#" class="org">蓝牙耳机</a><a href="#">手机套/外壳</a><a href="#">贴膜</a><a href="#">电池</a><a href="#">充电器</a><a href="#">数据线</a><a href="#">手机耳机/耳麦</a><a href="#">车载</a><a href="#">创意配件</a><a href="#">其他配件</a><a href="#">iPhone配件</a><a href="#">TF卡</a><a href="#">蓝牙音响</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>数码摄像</dt>
                            <dd>
                            	<a href="#">数码相机</a><a href="#" class="org">微电/微单相机</a><a href="#">摄像机</a><a href="#">拍立得</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>单反/镜头</dt>
                            <dd>
                            	<a href="#">全部</a><a href="#">佳能</a><a href="#">尼康</a><a href="#">宾得</a><a href="#">更多></a>
                                <i class="mod_subcate_line"></i>
                                <a href="#">单反镜头</a><a href="#">微单镜头</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>数码摄像</dt>
                            <dd>
                            	<a href="#">数码相机</a><a href="#" class="org">微电/微单相机</a><a href="#">摄像机</a><a href="#">拍立得</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>数码配件</dt>
                            <dd>
                            	<a href="#" class="org">存储卡</a><a href="#" class="org">U盘</a><a href="#">相机包</a><a href="#">相机电池</a><a href="#">贴膜</a><a href="#">滤镜</a><a href="#">三脚架</a><a href="#">闪光灯</a><a href="#">遮光罩</a><a href="#">专业配件</a><a href="#">清洁用品</a><a href="#">望远镜</a><a href="#">移动硬盘</a><a href="#" class="org">移动电源</a><a href="#">读卡器</a><a href="#">干电池</a><a href="#">充电电池</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>苹果专区</dt>
                            <dd>
                            	<a href="#">iphone</a><a href="#">ipad</a><a href="#">Mac</a><a href="#">ipod</a><a href="#">iphone配件</a><a href="#">ipad配件</a><a href="#">功能类配件</a><a href="#">苹果电脑配件</a><a href="#">ipod配件</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>娱乐影音</dt>
                            <dd>
                            	<a href="#" class="org">智能穿戴</a><a href="#">MP3和MP4</a><a href="#">插卡音箱</a><a href="#">潮流电玩</a><a href="#">数码相框</a><a href="#">收音/收录机</a><a href="#">高清播放器</a><a href="#">耳机</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>电子教育</dt>
                            <dd>
                            	<a href="#">电纸书</a><a href="#">录音笔</a><a href="#">电子词典</a><a href="#">智能学习/点读</a><a href="#">幼儿教育</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>手机/配件频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="#"><b>相机、数码、苹果频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">华为3X独家首发</a></li>
                            <li><a href="#">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">电脑</a><a href="#">硬件外设</a><a class="hot_sub" href="#">装机宝</a></h2>
                <p class="mod_cate_r"><a href="#">鼠标</a><a href="#">移动硬盘</a><a href="#">键盘</a><a href="#">平板</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>热门推荐</dt>
                            <dd>
                            	<a href="#">ipad air</a><a href="#">mini</a><a href="#">Surface</a><a href="3">移动硬盘1TB</a><a href="#">无线键盘</a><a href="#">游戏鼠标</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>电脑整机频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="#"><b>硬件/外设频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="#"><b>电脑附件频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="#"><b>音频馆</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="#"><b>腾讯周边</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/9.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/10.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/11.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/12.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/13.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/14.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/15.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/16.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/17.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/18.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/19.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">神舟新春最惠 全场最高直降500！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/00.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">大家电</a></h2>
                <p class="mod_cate_r"><a href="#">电视</a><a href="#">空调</a><a href="#">冰箱</a><a href="#">洗衣机</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>电视</dt>
                            <dd>
                            	<a href="#">全部</a><a href="#">创维</a><a class="org" href="#">海信</a><a href="3">TCL</a><a href="#">康佳</a><a href="#">长虹</a><a class="org" href="#">夏普</a><a href="#">三星</a><a class="org" href="#">索尼</a><a href="#">乐华</a><a href="#">LG</a><a href="#">联想</a><a href="#">熊猫</a><a href="#">三洋</a><a href="#">东芝</a><a class="org" href="#">乐视</a><a href="#">更多></a>
                                <i class="mod_subcate_line"></i>
                                <a href="#">32英寸</a><a href="#">39-40英寸</a><a href="#">42-43英寸</a><a class="org" href="#">46-48英寸</a><a href="#">50-55英寸</a><a href="#">60英寸以上</a><a href="#">32英寸以下</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>彩电影音/空调冰洗频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/20.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/21.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/22.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/23.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/24.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/25.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">【源码之家】TCL春节提前抢</a></li>
                            <li><a href="#">海信彩电跨年聚惠</a></li>
                            <li><a href="#">联想智能电视机马年钜惠</a></li>
                            <li><a href="#">三星喜迎新春马上有礼</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/000.jpg" /></a> 
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">厨卫电器</a><a href="#">生活电器</a></h2>
                <p class="mod_cate_r"><a href="#">剃须刀</a><a href="#">微波炉</a><a href="#">取暖设备</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>生活小电</dt>
                            <dd>
                            	<a class="org" href="#">空气净化器</a><a class="org" href="#">取暖设备</a><a class="org" href="#">电热油汀</a><a href="#">快热炉</a><a href="#">暖风机</a><a href="#">小太阳</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>厨卫电器频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="#"><b>生活电器频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">华为3X独家首发</a></li>
                            <li><a href="#">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">食品/饮料/生鲜</a><a class="hot_sub" href="#">粮油</a></h2>
                <p class="mod_cate_r"><a href="#">进口</a><a href="#">方便面</a><a href="#">酒</a><a href="#">果蔬</a><a href="#">大闸蟹</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>进口食品饮料</dt>
                            <dd>
                            	<a href="#">全部</a><a href="#">饮料冲调</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>休闲零食</dt>
                            <dd>
                            	<a href="#">全部</a><a href="#">传统糕饼</a><a href="#">西式糕点</a>
                            </dd>
                        </dl>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">华为3X独家首发</a></li>
                            <li><a href="#">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">男装</a><a href="#">手表</a><a href="#">家纺</a><a href="#">厨具</a></h2>
                <p class="mod_cate_r"><a href="#">羽绒服</a><a href="#">NIKE</a><a href="#">床品</a><a href="#">箱包</a><a href="#">黄金</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>热门推荐</dt>
                            <dd>
                            	<a href="#">手表</a><a href="#">羽绒服</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>家居日用频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">华为3X独家首发</a></li>
                            <li><a href="#">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">爱车养护</a><a class="hot_sub" href="#">爱车宝</a></h2>
                <p class="mod_cate_r"><a href="#">GPS导航</a><a href="#">机油</a><a href="#">改装配件</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>汽车电子</dt>
                            <dd>
                            	<a class="org" href="#">GPS/专用DVD导航</a><a href="#">MP3 MP4</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>汽车、保养、装饰频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">华为3X独家首发</a></li>
                            <li><a href="#">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="#">文具/办公用品</a><a class="hot_sub" href="#">年会礼品</a></h2>
                <p class="mod_cate_r"><a href="#">打印设备</a><a href="#">耗材</a><a href="#">办公文具</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>打印设备</dt>
                            <dd>
                            	<a class="org" href="#">激光打印机</a><a href="#">喷墨打印机</a><a href="#">针式打印机</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="#"><b>文具周边/办公用品频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="#"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="#"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="#">华为3X独家首发</a></li>
                            <li><a href="#">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="#"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        </ul>
        <div class="mod_cate2">
            <h2><a href="#">QQ网购</a><a class="yel" href="#">彩票</a><a href="#">充值</a></h2>
            <p class="mod_cate_r"><a href="#">美妆</a><a href="#">旅游</a><a href="#">票务</a><a class="yel" href="#">源码之家</a></p>
        </div> 
    </div>
</div>
</body>
</html>