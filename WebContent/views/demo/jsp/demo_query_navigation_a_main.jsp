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
            <li><a href="http://www.mycodes.net/">家电城</a><span class="hot"></span></li>
            <li><a href="http://www.mycodes.net/">天黑黑</a></li>
            <li><a href="http://www.mycodes.net/">团购</a></li>
            <li><a href="http://www.mycodes.net/">发现</a></li>
            <li><a href="http://www.mycodes.net/">二手特卖</a></li>
            <li><a href="http://www.mycodes.net/">源码之家</a><span class="hot"></span></li>
        </ul>
    </div>
    <div id="nav">
    	<div class="mod_cate_hd">全部商品分类</div>
    	<ul class="tit">
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">手机</a><a href="http://www.mycodes.net/">数码</a><a class="hot_sub" href="http://www.mycodes.net/">合约机</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">三星</a><a href="http://www.mycodes.net/">联想</a><a href="http://www.mycodes.net/">数码相机</a><a href="http://www.mycodes.net/">智能设备</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>手机通讯</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">全部手机</a><a href="http://www.mycodes.net/">对讲机</a>
                                <i class="mod_subcate_line"></i>
                                <a href="http://www.mycodes.net/">三星</a><a href="http://www.mycodes.net/">苹果</a><a href="http://www.mycodes.net/">华为</a><a href="http://www.mycodes.net/">小米</a><a href="http://www.mycodes.net/">诺基亚</a><a href="http://www.mycodes.net/">联想</a><a href="http://www.mycodes.net/">HTC</a><a href="http://www.mycodes.net/">索尼</a><a href="http://www.mycodes.net/">中兴</a><a href="http://www.mycodes.net/">酷派</a><a href="http://www.mycodes.net/">海尔</a><a href="http://www.mycodes.net/">中国移动</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>运营商</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">购机送费</a><a href="http://www.mycodes.net/" class="org">0元购机</a><a href="http://www.mycodes.net/">3G上网卡</a><a href="http://www.mycodes.net/">选号入网</a><a href="http://www.mycodes.net/">充值</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>手机配件</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/" class="org">移动电源</a><a href="http://www.mycodes.net/" class="org">蓝牙耳机</a><a href="http://www.mycodes.net/">手机套/外壳</a><a href="http://www.mycodes.net/">贴膜</a><a href="http://www.mycodes.net/">电池</a><a href="http://www.mycodes.net/">充电器</a><a href="http://www.mycodes.net/">数据线</a><a href="http://www.mycodes.net/">手机耳机/耳麦</a><a href="http://www.mycodes.net/">车载</a><a href="http://www.mycodes.net/">创意配件</a><a href="http://www.mycodes.net/">其他配件</a><a href="http://www.mycodes.net/">iPhone配件</a><a href="http://www.mycodes.net/">TF卡</a><a href="http://www.mycodes.net/">蓝牙音响</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>数码摄像</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">数码相机</a><a href="http://www.mycodes.net/" class="org">微电/微单相机</a><a href="http://www.mycodes.net/">摄像机</a><a href="http://www.mycodes.net/">拍立得</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>单反/镜头</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">全部</a><a href="http://www.mycodes.net/">佳能</a><a href="http://www.mycodes.net/">尼康</a><a href="http://www.mycodes.net/">宾得</a><a href="http://www.mycodes.net/">更多></a>
                                <i class="mod_subcate_line"></i>
                                <a href="http://www.mycodes.net/">单反镜头</a><a href="http://www.mycodes.net/">微单镜头</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>数码摄像</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">数码相机</a><a href="http://www.mycodes.net/" class="org">微电/微单相机</a><a href="http://www.mycodes.net/">摄像机</a><a href="http://www.mycodes.net/">拍立得</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>数码配件</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/" class="org">存储卡</a><a href="http://www.mycodes.net/" class="org">U盘</a><a href="http://www.mycodes.net/">相机包</a><a href="http://www.mycodes.net/">相机电池</a><a href="http://www.mycodes.net/">贴膜</a><a href="http://www.mycodes.net/">滤镜</a><a href="http://www.mycodes.net/">三脚架</a><a href="http://www.mycodes.net/">闪光灯</a><a href="http://www.mycodes.net/">遮光罩</a><a href="http://www.mycodes.net/">专业配件</a><a href="http://www.mycodes.net/">清洁用品</a><a href="http://www.mycodes.net/">望远镜</a><a href="http://www.mycodes.net/">移动硬盘</a><a href="http://www.mycodes.net/" class="org">移动电源</a><a href="http://www.mycodes.net/">读卡器</a><a href="http://www.mycodes.net/">干电池</a><a href="http://www.mycodes.net/">充电电池</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>苹果专区</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">iphone</a><a href="http://www.mycodes.net/">ipad</a><a href="http://www.mycodes.net/">Mac</a><a href="http://www.mycodes.net/">ipod</a><a href="http://www.mycodes.net/">iphone配件</a><a href="http://www.mycodes.net/">ipad配件</a><a href="http://www.mycodes.net/">功能类配件</a><a href="http://www.mycodes.net/">苹果电脑配件</a><a href="http://www.mycodes.net/">ipod配件</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>娱乐影音</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/" class="org">智能穿戴</a><a href="http://www.mycodes.net/">MP3和MP4</a><a href="http://www.mycodes.net/">插卡音箱</a><a href="http://www.mycodes.net/">潮流电玩</a><a href="http://www.mycodes.net/">数码相框</a><a href="http://www.mycodes.net/">收音/收录机</a><a href="http://www.mycodes.net/">高清播放器</a><a href="http://www.mycodes.net/">耳机</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>电子教育</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">电纸书</a><a href="http://www.mycodes.net/">录音笔</a><a href="http://www.mycodes.net/">电子词典</a><a href="http://www.mycodes.net/">智能学习/点读</a><a href="http://www.mycodes.net/">幼儿教育</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>手机/配件频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>相机、数码、苹果频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">华为3X独家首发</a></li>
                            <li><a href="http://www.mycodes.net/">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">电脑</a><a href="http://www.mycodes.net/">硬件外设</a><a class="hot_sub" href="http://www.mycodes.net/">装机宝</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">鼠标</a><a href="http://www.mycodes.net/">移动硬盘</a><a href="http://www.mycodes.net/">键盘</a><a href="http://www.mycodes.net/">平板</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>热门推荐</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">ipad air</a><a href="http://www.mycodes.net/">mini</a><a href="http://www.mycodes.net/">Surface</a><a href="3">移动硬盘1TB</a><a href="http://www.mycodes.net/">无线键盘</a><a href="http://www.mycodes.net/">游戏鼠标</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>电脑整机频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>硬件/外设频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>电脑附件频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>音频馆</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>腾讯周边</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/9.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/10.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/11.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/12.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/13.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/14.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/15.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/16.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/17.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/18.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/19.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">神舟新春最惠 全场最高直降500！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/00.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">大家电</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">电视</a><a href="http://www.mycodes.net/">空调</a><a href="http://www.mycodes.net/">冰箱</a><a href="http://www.mycodes.net/">洗衣机</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>电视</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">全部</a><a href="http://www.mycodes.net/">创维</a><a class="org" href="http://www.mycodes.net/">海信</a><a href="3">TCL</a><a href="http://www.mycodes.net/">康佳</a><a href="http://www.mycodes.net/">长虹</a><a class="org" href="http://www.mycodes.net/">夏普</a><a href="http://www.mycodes.net/">三星</a><a class="org" href="http://www.mycodes.net/">索尼</a><a href="http://www.mycodes.net/">乐华</a><a href="http://www.mycodes.net/">LG</a><a href="http://www.mycodes.net/">联想</a><a href="http://www.mycodes.net/">熊猫</a><a href="http://www.mycodes.net/">三洋</a><a href="http://www.mycodes.net/">东芝</a><a class="org" href="http://www.mycodes.net/">乐视</a><a href="http://www.mycodes.net/">更多></a>
                                <i class="mod_subcate_line"></i>
                                <a href="http://www.mycodes.net/">32英寸</a><a href="http://www.mycodes.net/">39-40英寸</a><a href="http://www.mycodes.net/">42-43英寸</a><a class="org" href="http://www.mycodes.net/">46-48英寸</a><a href="http://www.mycodes.net/">50-55英寸</a><a href="http://www.mycodes.net/">60英寸以上</a><a href="http://www.mycodes.net/">32英寸以下</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>彩电影音/空调冰洗频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/20.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/21.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/22.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/23.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/24.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/25.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">【源码之家】TCL春节提前抢</a></li>
                            <li><a href="http://www.mycodes.net/">海信彩电跨年聚惠</a></li>
                            <li><a href="http://www.mycodes.net/">联想智能电视机马年钜惠</a></li>
                            <li><a href="http://www.mycodes.net/">三星喜迎新春马上有礼</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/000.jpg" /></a> 
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">厨卫电器</a><a href="http://www.mycodes.net/">生活电器</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">剃须刀</a><a href="http://www.mycodes.net/">微波炉</a><a href="http://www.mycodes.net/">取暖设备</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>生活小电</dt>
                            <dd>
                            	<a class="org" href="http://www.mycodes.net/">空气净化器</a><a class="org" href="http://www.mycodes.net/">取暖设备</a><a class="org" href="http://www.mycodes.net/">电热油汀</a><a href="http://www.mycodes.net/">快热炉</a><a href="http://www.mycodes.net/">暖风机</a><a href="http://www.mycodes.net/">小太阳</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>厨卫电器频道</b><i class="arrow_dot"></i></a><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>生活电器频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">华为3X独家首发</a></li>
                            <li><a href="http://www.mycodes.net/">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">食品/饮料/生鲜</a><a class="hot_sub" href="http://www.mycodes.net/">粮油</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">进口</a><a href="http://www.mycodes.net/">方便面</a><a href="http://www.mycodes.net/">酒</a><a href="http://www.mycodes.net/">果蔬</a><a href="http://www.mycodes.net/">大闸蟹</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>进口食品饮料</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">全部</a><a href="http://www.mycodes.net/">饮料冲调</a>
                            </dd>
                        </dl>
                    	<dl>
                        	<dt>休闲零食</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">全部</a><a href="http://www.mycodes.net/">传统糕饼</a><a href="http://www.mycodes.net/">西式糕点</a>
                            </dd>
                        </dl>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">华为3X独家首发</a></li>
                            <li><a href="http://www.mycodes.net/">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">男装</a><a href="http://www.mycodes.net/">手表</a><a href="http://www.mycodes.net/">家纺</a><a href="http://www.mycodes.net/">厨具</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">羽绒服</a><a href="http://www.mycodes.net/">NIKE</a><a href="http://www.mycodes.net/">床品</a><a href="http://www.mycodes.net/">箱包</a><a href="http://www.mycodes.net/">黄金</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>热门推荐</dt>
                            <dd>
                            	<a href="http://www.mycodes.net/">手表</a><a href="http://www.mycodes.net/">羽绒服</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>家居日用频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">华为3X独家首发</a></li>
                            <li><a href="http://www.mycodes.net/">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">爱车养护</a><a class="hot_sub" href="http://www.mycodes.net/">爱车宝</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">GPS导航</a><a href="http://www.mycodes.net/">机油</a><a href="http://www.mycodes.net/">改装配件</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>汽车电子</dt>
                            <dd>
                            	<a class="org" href="http://www.mycodes.net/">GPS/专用DVD导航</a><a href="http://www.mycodes.net/">MP3 MP4</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>汽车、保养、装饰频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">华为3X独家首发</a></li>
                            <li><a href="http://www.mycodes.net/">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        	<li class="mod_cate">
            	<h2><i class="arrow_dot fr"></i><a href="http://www.mycodes.net/">文具/办公用品</a><a class="hot_sub" href="http://www.mycodes.net/">年会礼品</a></h2>
                <p class="mod_cate_r"><a href="http://www.mycodes.net/">打印设备</a><a href="http://www.mycodes.net/">耗材</a><a href="http://www.mycodes.net/">办公文具</a></p>
                <div class="mod_subcate">
                	<div class="mod_subcate_main">
                    	<dl>
                        	<dt>打印设备</dt>
                            <dd>
                            	<a class="org" href="http://www.mycodes.net/">激光打印机</a><a href="http://www.mycodes.net/">喷墨打印机</a><a href="http://www.mycodes.net/">针式打印机</a>
                            </dd>
                        </dl>
                    	<div class="mod_subcate_channel"><a class="mod_btn_arrow" href="http://www.mycodes.net/"><b>文具周边/办公用品频道</b><i class="arrow_dot"></i></a></div>
                    </div>
                    <div class="mod_subcate_side">
                    	<div class="mod_subcate_side_hd">热门品牌</div>
                        <ul class="mod_subcate_side_brand clearfix">
                        	<li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/1.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/2.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/3.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/4.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/5.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/6.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/7.jpg" /></a></li>
                            <li><a href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/8.jpg" /></a></li>
                        </ul>
                        <div class="mod_subcate_side_hd">热门活动</div>
                        <ul class="mod_subcate_side_hotlist">
                        	<li><a href="http://www.mycodes.net/">华为3X独家首发</a></li>
                            <li><a href="http://www.mycodes.net/">青橙手机贺新春 直降400！</a></li>
                        </ul>
                        <a class="mod_subcate_gg" href="http://www.mycodes.net/"><img src="../images/demo_query_navigation_a_main/0.jpg" /></a>
                    </div>
                </div>
            </li>
        </ul>
        <div class="mod_cate2">
            <h2><a href="http://www.mycodes.net/">QQ网购</a><a class="yel" href="http://www.mycodes.net/">彩票</a><a href="http://www.mycodes.net/">充值</a></h2>
            <p class="mod_cate_r"><a href="http://www.mycodes.net/">美妆</a><a href="http://www.mycodes.net/">旅游</a><a href="http://www.mycodes.net/">票务</a><a class="yel" href="http://www.mycodes.net/">源码之家</a></p>
        </div> 
    </div>
</div>
</body>
</html>