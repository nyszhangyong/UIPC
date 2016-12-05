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
	<table id="lto">
		<thead class="thead">
			<tr>
				<td><input type="checkbox" class="selectAll" />全选</td>
				<td>商品信息</td>
				<td>单价</td>
				<td>数量</td>
				<td>金额</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody>
			<tr class="opp">
				<td colspan="6">
				    <input type="checkbox" class="shopcls" />
				    <label>店铺：</label>
				    <a href="#" class="shoplink">七星超市</a>
					<label>卖家</label>
					<a href="#" class="selllink">李莫愁</a>
				</td>
			</tr>
			<tr class="even">
				<td><input type="checkbox" class="selecthing" /></td>
				<td>
				    <img alt='商品图片' src="../images/demo_form_shopping_cart/cart_01.jpg" class="img" />
				    <div class="detial">
					    <span class="things">古森海尔耳机</span>
					    <span class="htopay"></span>
				    </div>
				</td>
				<td class="price">1250.35</td>
				<td class="quality">
				    <img class="cut" src="../images/demo_form_shopping_cart/minus.jpg" alt="减少" />
				    <input class="amount" type="text" value="0" />
				    <img class="add" alt="增加" src="../images/demo_form_shopping_cart/adding.jpg" />
				</td>
				<td class="lcount">0</td>
				<td class="deleitem"><a class="deleCls" href="#a">删除</a></td>
			</tr>
		</tbody>
		<tfoot class="tfoot">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td class='totle'>商品总计:<span class="cmoney">0</span>元</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>