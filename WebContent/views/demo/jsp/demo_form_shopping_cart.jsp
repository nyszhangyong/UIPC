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
	<div class='main'>
	
		<div class="container">
			<div class="content">
				<div class="tbBar">
					<ul class = 'switch-cart'></ul>
					<div class="cart-sum">
						<span>已选商品（不含运费）</span>
						<strong class='price'>￥
                            <span class='total-symbol'>0.00</span>
						</strong>
						<a href="#" class="submit-btn btn-common">结算</a>
					</div>
					<div class="wrap-line">
					</div>
				</div>
				<div class="tbMain">
					<div class="commodityColumn">
						<div class="th-chk">
							<div id="selectAll" class="selectAll ">
								<input type="checkbox" name="selectAllChckbox" id='selectAllChckbox' class='allSelected1' autocomplete="off">
								<label for="selectAllChckbox">全选</label>
							</div>
						</div>
						<div class="th-inner">
							<div class="commodityMsg">
								<div>商品信息</div>
							</div>
						</div>
						<div class="th-space">
							<div class="td-inner">&nbsp;</div>
						</div>
						<div class="th-price">
							<div class="td-inner">单价</div>
						</div>
						<div class="th-amount">
							<div class="td-inner">数量</div>
						</div>
						<div class="th-sum">
							<div class="td-inner">金额</div>
						</div>
						<div class="th-operation">
							<div class="td-inner">操作</div>
						</div>
					</div>
					<div class='commodityContainer'>

						<div class="mainCommodity">
							<div class="shopInfo">
								<div class="shopMsg">
									<input type="checkbox" name="shopMsg" id='zhangjunyameimei' class='shopMsg-input' autocomplete="off">
									<label for="zhangjunyameimei">店铺：</label>
									<a href="#">张君雅小妹妹旗舰</a>
								</div>
							</div>
							<div class="commodityInfo">
								<ul>
									<li class='td-chk'>
										<div class="td-inner">
											<input type="checkbox" name='checkbox' autocomplete="off">
										</div>
									</li>
									<li class='td-item'>
										<div class="td-inner">
											<a href="#" class='zhangjunya'><img src="../images/demo_form_shopping_cart/zhangjunyameimei.png"/>
											</a>
											<div class="item-info">
												<div class="item-basis-info">
													<a href="#">
														台湾进口零食张君雅小妹妹12包零食组合甜甜圈捏脆面点心面礼包
													</a>
												</div>
												<div class="item-other-info">
													<div class="item-other-space"></div>
													<div class="item-other-list">
														<a href="#" title='支持信用卡支付'>
															<div class="bandCard"><img src="../images/demo_form_shopping_cart/bankCard.png"/></div>
														</a>
														<a href="#" class='sevenDay' title='7天无理由'>
															<div class="sevenDay"><img src="../images/demo_form_shopping_cart/sevenDay.png"/></div>
														</a>
														<a href="#" title='消费者保障服务'>
															<div class="guarantee"><img src="../images/demo_form_shopping_cart/guarantee.png"/></div>
														</a>
													</div>
												</div>
											</div>
										</div>
									</li>
									<li class='td-info'>
										<div class="td-info-msg">
											<p>口味：12包零食组合</p>
										</div>
									</li>
									<li class='td-price'>
										<div class="td-inner">
											<p class='non-discount'>￥79.00</p>
											<p class='discount'>￥<span>39.00</span></p>
											<div class="promotion">
												卖家促销
												<i class='promotionIcon'></i>
											</div>
											<div class="proSlidedown">
												<p class='newPro'>卖家促销：9月狂欢购</p>
												<p>优惠：￥40.00</p>
											</div>
										</div>
									</li>
									<li class='td-amount'>
										<div class="item-amount">
											<a href="#" class='amount-left amount-color'>-</a>
											<input type="text" name='amountNum' value='1' autocomplete="off">
											<a href="#" class="amount-right">+</a>
										</div>
										<div class="stock">
											399
										</div>
										<div class="outNum">
											<span class="instr">最多只能购买</span>
											<span class='stockNum'></span>
											<em>件</em>
										</div>
		 							</li>
									<li class='td-sum'>
										<em>￥</em><!--
										--><span>39.00</span>
									</li>
									<li class='td-operation'>
										<p><a href="#" class='delete'>删除</a></p>
									</li>
								</ul>
							</div>
						</div>

						<div class="mainCommodity">
							<div class="shopInfo">
								<div class="shopMsg">
									<input type="checkbox" name="shopMsg" id='zhangjunyameimei' class='shopMsg-input' autocomplete="off">
									<label for="zhangjunyameimei">店铺：</label>
									<a href="#">张君雅小妹妹旗舰</a>
								</div>
							</div>
							<div class="commodityInfo">
								<ul>
									<li class='td-chk'>
										<div class="td-inner">
											<input type="checkbox" name='checkbox' autocomplete="off">
										</div>
									</li>
									<li class='td-item'>
										<div class="td-inner">
											<a href="#" class='zhangjunya'><img src="../images/demo_form_shopping_cart/zhangjunyameimei.png"/>
											</a>
											<div class="item-info">
												<div class="item-basis-info">
													<a href="#">
														台湾进口零食张君雅小妹妹12包零食组合甜甜圈捏脆面点心面礼包
													</a>
												</div>
												<div class="item-other-info">
													<div class="item-other-space"></div>
													<div class="item-other-list">
														<a href="#" title='支持信用卡支付'>
															<div class="bandCard"><img src="../images/demo_form_shopping_cart/bankCard.png"/></div>
														</a>
														<a href="#" class='sevenDay' title='7天无理由'>
															<div class="sevenDay"><img src="../images/demo_form_shopping_cart/sevenDay.png"/></div>
														</a>
														<a href="#" title='消费者保障服务'>
															<div class="guarantee"><img src="../images/demo_form_shopping_cart/guarantee.png"/></div>
														</a>
													</div>
												</div>
											</div>
										</div>
									</li>
									<li class='td-info'>
										<div class="td-info-msg">
											<p>口味：12包零食组合</p>
										</div>
									</li>
									<li class='td-price'>
										<div class="td-inner">
											<p class='non-discount'>￥79.00</p>
											<p class='discount'>￥<span>39.00</span></p>
											<div class="promotion">
												卖家促销
												<i class='promotionIcon'></i>
											</div>
											<div class="proSlidedown">
												<p class='newPro'>卖家促销：9月狂欢购</p>
												<p>优惠：￥40.00</p>
											</div>
										</div>
									</li>
									<li class='td-amount'>
										<div class="item-amount">
											<a href="#" class='amount-left amount-color'>-</a>
											<input type="text" name='amountNum' value='1' autocomplete="off">
											<a href="#" class="amount-right">+</a>
										</div>
										<div class="stock">
											399
										</div>
										<div class="outNum">
											<span class="instr">最多只能购买</span>
											<span class='stockNum'></span>
											<em>件</em>
										</div>
		 							</li>
									<li class='td-sum'>
										<em>￥</em><!--
										--><span>39.00</span>
									</li>
									<li class='td-operation'>
										<p><a href="#" class='delete'>删除</a></p>
									</li>
								</ul>
							</div>
						</div>

						<div class="mainCommodity">
							<div class="shopInfo">
								<div class="shopMsg">
									<input type="checkbox" name="shopMsg" id='zhangjunyameimei' class='shopMsg-input' autocomplete="off">
									<label for="zhangjunyameimei">店铺：</label>
									<a href="#">张君雅小妹妹旗舰</a>
								</div>
							</div>
							<div class="commodityInfo">
								<ul>
									<li class='td-chk'>
										<div class="td-inner">
											<input type="checkbox" name='checkbox' autocomplete="off">
										</div>
									</li>
									<li class='td-item'>
										<div class="td-inner">
											<a href="#" class='zhangjunya'><img src="../images/demo_form_shopping_cart/zhangjunyameimei.png"/>
											</a>
											<div class="item-info">
												<div class="item-basis-info">
													<a href="#">
														台湾进口零食张君雅小妹妹12包零食组合甜甜圈捏脆面点心面礼包
													</a>
												</div>
												<div class="item-other-info">
													<div class="item-other-space"></div>
													<div class="item-other-list">
														<a href="#" title='支持信用卡支付'>
															<div class="bandCard"><img src="../images/demo_form_shopping_cart/bankCard.png"/></div>
														</a>
														<a href="#" class='sevenDay' title='7天无理由'>
															<div class="sevenDay"><img src="../images/demo_form_shopping_cart/sevenDay.png"/></div>
														</a>
														<a href="#" title='消费者保障服务'>
															<div class="guarantee"><img src="../images/demo_form_shopping_cart/guarantee.png"/></div>
														</a>
													</div>
												</div>
											</div>
										</div>
									</li>
									<li class='td-info'>
										<div class="td-info-msg">
											<p>口味：12包零食组合</p>
										</div>
									</li>
									<li class='td-price'>
										<div class="td-inner">
											<p class='non-discount'>￥79.00</p>
											<p class='discount'>￥<span>39.00</span></p>
											<div class="promotion">
												卖家促销
												<i class='promotionIcon'></i>
											</div>
											<div class="proSlidedown">
												<p class='newPro'>卖家促销：9月狂欢购</p>
												<p>优惠：￥40.00</p>
											</div>
										</div>
									</li>
									<li class='td-amount'>
										<div class="item-amount">
											<a href="#" class='amount-left amount-color'>-</a>
											<input type="text" name='amountNum' value='1' autocomplete="off">
											<a href="#" class="amount-right">+</a>
										</div>
										<div class="stock">
											399
										</div>
										<div class="outNum">
											<span class="instr">最多只能购买</span>
											<span class='stockNum'></span>
											<em>件</em>
										</div>
		 							</li>
									<li class='td-sum'>
										<em>￥</em><!--
										--><span>39.00</span>
									</li>
									<li class='td-operation'>
										<p><a href="#" class='delete'>删除</a></p>
									</li>
								</ul>
							</div>
						</div>


					</div>
				</div>
			</div>
			<div class="footer">
				<div class="all-selected">
					<input type="checkbox" name='all-selected' id='all-selected' class='allSelected2' autocomplete="off">
					<label for="all-selected">全选</label>
				</div>
				<div class="operation">
					<a href="#" class='delete'>删除</a>
				</div>
				<div class="float-bar-right">
					<div class="amount-sum">
						<span>已选商品</span>
						<em class='totalSum'>0</em>
						<span>件</span>
					</div>
					<div class="price-sum">
						<span>合计（不含运费）：</span>
						<span class='moneySym'>￥</span><!--
						--><em class='total-sum'>0.00</em>
					</div>
					<div class="btn-area">
						<a href="#" class='btn-common' id='btn-sum'>结 算</a>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>