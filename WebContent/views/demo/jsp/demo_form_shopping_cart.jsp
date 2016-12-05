<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>购物车(仿淘宝)</title>
<!-- 作者：张勇(Mark Smith) -->
<!-- 以下JQUERY功能引用 -->
<script src="../js/js_jquery/jquery-1.11.3.min.js" type="text/javascript"></script>
<!-- 以下私有功能引用 -->
<script src="../js/js_self/demo_form_shopping_cart.js" type="text/javascript"></script>
<link href="../css/demo_form_shopping_cart.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table id="lto" border="0px" style="width: 761px">

		<thead class="thead">
			<tr>
				<td style="width: 106px; height: 39px">全选<input type="checkbox"
					class="selectAll" /></td>
				<td style="height: 39px; width: 171px;">店铺宝贝</td>
				<td style="height: 39px; width: 71px;">商城积分</td>
				<td style="height: 39px; width: 73px;">单价(元)</td>
				<td style="height: 39px; width: 50px;">数量</td>
				<td style="height: 39px; width: 48px;">优惠</td>
				<td style="height: 39px; width: 64px;">小计(元)</td>
			</tr>

		</thead>
		<tbody>
			<tr class="opp">
				<td style="width: 106px"><input type="checkbox" class="shopcls" /><label>店铺：</label><a
					href="#a" class="shoplink">七星超市</a></td>
				<td style="width: 171px"><label>卖家</label><a href="#a"
					class="selllink">李莫愁</a></td>
			</tr>
			<tr class="even">
				<td style="width: 106px"><input type="checkbox"
					class="selecthing" /></td>
				<td style="width: 171px"><img alt='商品图片' src="XX.jpg"
					class="img" />
				<div class="detial">
						<span class="things">古森海尔耳机</span><span class="htopay"></span>
					</div></td>
				<td class="countCode" style="width: 71px">33</td>
				<td class="price" style="width: 73px">1250.35</td>
				<td class="quality" style="width: 50px"><img class="cut"
					src="pic/jian.jpg" alt="减少" /><input class="amount" type="text"
					value="0" /><img class="add" alt="增加" src="pic/add.jpg" /></td>
				<td class="youhui" style="width: 48px"><label class="youhui1"></label></td>
				<td class="lcount" style="width: 64px">0</td>
				<td class="deleitem"><a class="deleCls" href="#a">删除</a></td>
			</tr>
			<tr class="even">
				<td style="width: 106px"><input type="checkbox"
					class="selecthing" /></td>
				<td style="width: 171px"><img alt='商品图片' src="XX.jpg"
					class="img" />
				<div class="detial">
						<span class="things">联想天机耳机</span><span class="htopay"></span>
					</div></td>
				<td class="countCode" style="width: 71px">33</td>
				<td class="price" style="width: 73px">754.35</td>
				<td class="quality" style="width: 50px"><img class="cut"
					src="pic/jian.jpg" alt="减少" /><input class="amount" type="text"
					value="0" /><img class="add" alt="增加" src="pic/add.jpg" /></td>
				<td class="youhui" style="width: 48px"><label class="youhui1"></label></td>
				<td class="lcount" style="width: 64px">0</td>
				<td class="deleitem"><a class="deleCls" href="#a">删除</a></td>
			</tr>
			<tr class="opp">
				<td style="width: 106px"><input type="checkbox" class="shopcls" /><label>店铺：</label><a
					href="#a" class="shoplink">五星电器</a></td>
				<td style="width: 171px"><label>卖家</label><a href="#a"
					class="selllink">员工1021</a></td>
			</tr>
			<tr class="even">
				<td style="width: 106px"><input type="checkbox"
					class="selecthing" /></td>
				<td style="width: 171px"><img alt='商品图片' src="XX.jpg"
					class="img" />
				<div class="detial">
						<span class="things">NokiaN97</span><span class="htopay"></span>
					</div></td>
				<td class="countCode" style="width: 71px">125</td>
				<td class="price" style="width: 73px">1254.3</td>
				<td class="quality" style="width: 50px"><img class="cut"
					src="pic/jian.jpg" alt="减少" /><input class="amount" type="text"
					value="0" /><img class="add" alt="增加" src="pic/add.jpg" /></td>
				<td class="youhui" style="width: 48px"><label class="youhui1"></label></td>
				<td class="lcount" style="width: 64px">0</td>
				<td class="deleitem"><a class="deleCls" href="#a">删除</a></td>
			</tr>
			<tr class="opp">
				<td style="width: 106px"><input type="checkbox" class="shopcls" /><label>店铺：</label><a
					href="#a" class="shoplink">联想专卖</a></td>
				<td style="width: 171px"><label>卖家</label><a href="#a"
					class="selllink">员工1021</a></td>
			</tr>
			<tr class="even">
				<td style="width: 106px"><input type="checkbox"
					class="selecthing" /></td>
				<td style="width: 171px"><img alt='商品图片' src="XX.jpg"
					class="img" />
				<div class="detial">
						<span class="things">联想机箱贴膜</span><span class="htopay"></span>
					</div></td>
				<td class="countCode" style="width: 71px">2</td>
				<td class="price" style="width: 73px">65.6</td>
				<td class="quality" style="width: 50px"><img class="cut"
					src="pic/jian.jpg" alt="减少" /><input class="amount" type="text"
					value="0" /><img class="add" alt="增加" src="pic/add.jpg" /></td>
				<td class="youhui" style="width: 48px"><label class="youhui1"></label></td>
				<td class="lcount" style="width: 64px">0</td>
				<td class="deleitem"><a class="deleCls" href="#a">删除</a></td>
			</tr>
			<tr class="opp">
				<td style="width: 106px"><input type="checkbox" class="shopcls" /><label>店铺：</label><a
					href="#a" class="shoplink">天语专卖</a></td>
				<td style="width: 171px"><label>卖家</label><a href="#a"
					class="selllink">员工1021</a></td>
			</tr>
			<tr class="even">
				<td style="width: 106px"><input type="checkbox"
					class="selecthing" /></td>
				<td style="width: 171px"><img alt='商品图片' src="XX.jpg"
					class="img" />
				<div class="detial">
						<span class="things">KingStong-DD3</span><span class="htopay"></span>
					</div></td>
				<td class="countCode" style="width: 71px">10</td>
				<td class="price" style="width: 73px">125</td>
				<td class="quality" style="width: 50px"><img class="cut"
					src="pic/jian.jpg" alt="减少" /><input class="amount" type="text"
					value="0" /><img class="add" alt="增加" src="pic/add.jpg" /></td>
				<td class="youhui" style="width: 48px"><label class="youhui1"></label></td>
				<td class="lcount" style="width: 64px">0</td>
				<td class="deleitem"><a class="deleCls" href="#a">删除</a></td>
			</tr>
		</tbody>
		<tfoot class="tfoot">
			<tr>
				<td style="width: 106px"></td>
				<td style="width: 171px"></td>
				<td style="width: 71px"></td>
				<td style="width: 73px"></td>
				<td style="width: 50px"></td>
				<td style="width: 48px"></td>
				<td style="width: 64px"></td>
				<td class='totle'>商品总计:<span class="cmoney">0</span>元
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>