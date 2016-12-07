$(document).ready(function() {

    //------------------------------------------------------删除、恢复商品信息操作------------------------------------------------
	//删除商品
	var thisInfo;
	var previous;
	var next;
	$('body').on('click','.delete',function(event){
			var $this = $(event.target);
			thisInfo = $this.parents('.mainCommodity');
			previous = thisInfo.prev();
			next = thisInfo.next();
			var itemBasisInfo = thisInfo.find('.item-basis-info a').text().trim();
			console.log($('.mainCommodity').last());
			var html = '';
			html +='<div class="undo-wrapper">';
			html +='<div class="deleteCom">';
			html +='<p>';
			html +='成功删除';
			html +='<em>1</em>';
			html +='件宝贝，';
			html +='如果有误，可';
			html +='<a href="#" class="turnBack">撤销本次删除</a>';
			html +='</p>';
			html +='</div>';
			html +='</div>';
			if ($('.mainCommodity').first()) {
				next.before(html);
			} else {
				previous.after(html);
			};
			thisInfo.detach();

			return false;
	});

	//恢复商品
	$('body').on('click','.turnBack',function(event){
		previous.after(thisInfo);
		$('.undo-wrapper').hide();
		return false;
	})

    //------------------------------------------------------增加、减少商品数量操作------------------------------------------------
	//商品数量的输入框
	$('body').on('keypress keyup blur','.item-amount input',function(event){
		if (event.type==='keypress') {
			var thisParent = $(this).parents('.td-amount');
			var thisInput = $(this).parent('.item-amount');
			var $text = thisParent.siblings('.td-price').find('span').text();
			var tdSum = thisParent.find('.td-sum').children('span');
			var keyCode = event.keyCode ? event.keyCode : event.charCode ;
			if (keyCode !== 0 && (keyCode <48 || keyCode >57) && keyCode!==8 && keyCode !==37 && keyCode !==39 && keyCode !==46) {
				return false;
			} else {
				return true;
			};
		} else if(event.type ==='keyup'){
			stock($(this));
			var $stock = parseInt($(this).parent('.item-amount').siblings('.stock').text());
			var thisParent = $(this).parents('.td-amount');
			var thisInput = $(this).parent('.item-amount');
			var $text = thisParent.siblings('.td-price').find('span').text();
			var tdSum = thisParent.siblings('.td-sum').find('span');
			var keyCode = event.keyCode ? event.keyCode : event.charCode ;
			if (keyCode !== 8) {
				var num = parseInt($(this).val()) || 0;
				if (num < 1) {
					num = 1;
				} else if(num > $stock){
					num = $stock;
				} else {
					num = num;
				}
				var num = $(this).val();
				tdSum.text($text * num + '.00');
			};
			var anNum = $(this).val();
			tdSum.text($text * anNum +'.00');
			getCount();
		} else {
			stock($(this));
			var $stock = parseInt($(this).parent('.item-amount').siblings('.stock').text());
			var thisParent = $(this).parents('.td-amount');
			var thisInput = $(this).parent('.item-amount');
			var $text = thisParent.siblings('.td-price').find('span').text();
			var tdSum = thisParent.siblings('.td-sum').find('span');
			var keyCode = event.keyCode ? event.keyCode : event.keyCode;
			var num = parseInt($(this).val()) || 0;
			if (num > $stock) {
				num = $stock;
			} else if(num < 1){
				num = 1;
			} else {
				num = num;
			}
			$(this).val(num);
			var anNum = $(this).val();
			tdSum.text($text * anNum +'.00');
			getCount();
		}
	});

	//商品数量增加
	$('body').on('click','.amount-right',function(event){
		var $stock = parseInt($(this).parent('.item-amount').siblings('.stock').text());
		var thisParent = $(this).parents('.td-amount');
		var thisInput = $(this).parent('.item-amount');
		var $text = thisParent.siblings('.td-price').find('span').text();
		var tdSum = thisParent.siblings('.td-sum').find('span');
		var num = thisInput.find('input').val();
		if (num < $stock) {
			num++;
			thisInput.find('input').val(num);
		} else {
			$(this).parent().siblings('.outNum').show('fast');
		}
		$('.amount-left').css({
			'cursor':'pointer',
			'color':'#444'
		})
		tdSum.text($text * num + '.00');
		getCount();
		// stock($(this));
		return false;
	});

	//商品数量减少
	$('body').on('click','.amount-left',function(event){
		var thisParent = $(this).parents('.td-amount');
		var thisInput = $(this).parent('.item-amount');
		var $text = thisParent.siblings('.td-price').find('span').text();
		var tdSum = thisParent.siblings('.td-sum').find('span');
		var num = thisInput.find('input').val();
		if (num > 1 ) {
			num--;
			thisInput.find('input').val(num);
		}
		tdSum.text($text * num +'.00');
		getCount();
		return false;
	});

    //------------------------------------------------------选中、取消商品信息操作------------------------------------------------

	//商品全选
	$('.selectAll').on('click', '.allSelected1', function(event) {
		if ($(this).prop('checked')) {
			$(':checkbox').prop('checked',true);
			$('.commodityInfo').css({
				'background-color':'#FFF8E1'
			});
			$('.submit-btn').css({
				'background-color':'#f40',
				'cursor':'pointer'
			});
			$('#btn-sum').css({
				'background-color':'#f40',
				'cursor':'pointer'
			});
		} else {
			$(':checkbox').prop('checked',false);
			$('.commodityInfo').css({
				'background-color':'#fcfcfc'
			});
			$('.submit-btn').css({
				'background-color':'#aaa',
				'cursor':'not-allowed'
			})
			$('#btn-sum').css({
				'background-color':'#aaa',
				'cursor':'not-allowed'
			})
		}
		getCount();
	});

	//fixed中的全选按钮
	$('.all-selected').on('click', '.allSelected2', function(event) {
		if ($(this).prop('checked')) {
			$(':checkbox').prop('checked',true);
			$('.commodityInfo').css({
				'background-color':'#FFF8E1'
			});
			$('.submit-btn').css({
				'background-color':'#f40',
				'cursor':'pointer'
			})
			$('#btn-sum').css({
				'background-color':'#f40',
				'cursor':'pointer'
			})
		} else {
			$(':checkbox').prop('checked',false);
			$('.commodityInfo').css({
				'background-color':'#fcfcfc'
			});
			$('.submit-btn').css({
				'background-color':'#aaa',
				'cursor':'not-allowed'
			})
			$('#btn-sum').css({
				'background-color':'#aaa',
				'cursor':'not-allowed'
			})
		}
		getCount();
	});




	//取消全选
	function cancelSelect(){
		if ($('.td-inner input').length === $('.td-inner input:checked').length) {
			$('.allSelected1').prop('checked',true);
			$('.allSelected2').prop('checked',true);
		} else {
			$('.allSelected1').prop('checked',false);
			$('.allSelected2').prop('checked',false);
		}
	}

	//如果有商品未选中，则取消全选。
	function cancelCalculator(){
		if ($('.td-inner input:checked').length === 0) {
			$('#btn-sum').css({
				'background-color':'#aaa',
				'cursor':'not-allowed'
			});
			$('.submit-btn').css({
				'background-color':'#aaa',
				'cursor':'not-allowed'
			});
		} else {
			$('#btn-sum').css({
				'background-color':'#f40',
				'cursor':'pointer'
			});
			$('.submit-btn').css({
				'background-color':'#f40',
				'cursor':'pointer'
			})
		}
	}


	//点击某商品时选中
	$('body').on('click','.td-inner input',function(event){
		if ($(this).prop('checked')) {
			$(this).parents('.commodityInfo').siblings('.shopInfo').find('input').prop('checked',true);
			$(this).parents('.commodityInfo').css({
				'background-color':'#fff8e1'
			});
		} else {
			$(this).parents('.commodityInfo').siblings('.shopInfo').find('input').prop('checked',false);
			$(this).parents('.commodityInfo').css({
				'background-color':'#fcfcfc'
			});
		}
		cancelCalculator();
		cancelSelect();
		getCount();
	});

	//点击某商品时选中
	$('body').on('click','.shopInfo input',function(event){
		if ($(this).prop('checked')) {
			$(this).parents('.shopInfo').siblings('.commodityInfo').find('.td-inner input').prop('checked',true);
			$(this).parents('.shopInfo').siblings('.commodityInfo').css({
				'background-color':'#fff8e1'
			});
		} else {
			$(this).parents('.shopInfo').siblings('.commodityInfo').find('.td-inner input').prop('checked',false);
			$(this).parents('.shopInfo').siblings('.commodityInfo').css({
				'background-color':'#fcfcfc'
			});
		}
		cancelCalculator();
		cancelSelect();
		getCount();
	});

    //------------------------------------------------------统计、计算商品数量、金额操作------------------------------------------------
	//获得已选中商品和商品价格总额
	function getCount(){
		var counts = 0;
		var sum = 0;
		$('.td-inner input').each(function(index, el) {
			if ($(this).prop('checked')) {
				for (var i = 0; i < $(this).length; i++) {
					counts += parseInt($(this).parents('.td-chk').siblings('.td-sum').find('span').text());
					sum += 1;
				}
			}
		});
		$('.totalSum').text(sum);
		$('.total-sum').html((counts).toFixed(2));
		$('.total-symbol').html((counts).toFixed(2));
	};

    //------------------------------------------------------上、下结算按钮的禁止操作------------------------------------------------
	//未选中商品时禁止点击上下两个结算按钮
	$('.submit-btn').click(function(event) {
		return false;
	});
	$('#btn-sum').click(function(event) {
		return false;
	});
});
