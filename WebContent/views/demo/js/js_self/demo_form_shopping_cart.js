// JScript 文件
$(document).ready(function(){
     //--假设用户全部选定
     $("form :checkbox").attr('checked','true');
     var ado=$("#lto :input[type='checkbox']"); var cshop;
     //cshop= $(this).parent().parent().next().find(":checkbox") 
     //这里是为了得到他的下一个祖父元素.注意：同一个商家的东西要放在一起....这里就比较麻烦
     $(".shopcls").click(function(){
    	 var ge=$(this).parent().parent();
         //--因为这里cshop返回的是 一个tr 对象，所以药寻找 checkbox对象
         cshop= ge.nextUntil(".opp"); 
         if(this.checked){
    	     cshop.find(":checkbox").attr('checked','true');  
         }else {
    	     cshop.find(":checkbox").removeAttr('checked'); 
         }
     });
     
	$(".selectAll").click(function(){
		if(this.checked){ado.attr('checked','true');
		   //--全选的话 ，就开始计算全值
		   fn_allMoney();
		}else {
		   ado.removeAttr('checked'); 
		   $("tfoot .totle .cmoney").text(0); 
	    } 
	 }); 
});

 //--这里的难点在于如何确定是那个 ，如果使用类的话，回有多个，所以会执行多个结果。
 // 所以这里比较难搞。
 //--此是一个计算函数，用于计算总钱数和时时前述
 function fn_calMoney(count,price)
 {
    return count*price;
 } 
 //--为总的计数函数.因为这个函数，上面两个JQ都要用到所以，拿出来。而不是放在代码内部产生一个引用
 function fn_allMoney()
 {
     var count=0;
     //--还要有一个就是，如果 用户单击了 checkbox之后，因为一些商品虽然有价钱，
     //但是，没有选中。所以，依然是归零的，所以从这里入手，冲所有的 selecthing 入手
     //因为他们的父母操作的就是他们。所以，直接利用这些就可以了。
     $("tbody .selecthing").each(function(){ 
    	 if(this.checked) {
    		 count+=parseFloat($(this).parent().parent().find(".lcount",$(this).parent()).text());
    	 }
    });
  //--保存小数位数
  count=count.toFixed(2);
  //--个人感觉，最好是手动指定路径还是比较好一些
  $("tfoot .totle .cmoney").text(count);
 }
 
$(document).ready(function(){
     var i=0; 
     $("tbody .cut").bind('click', function(){
    	 var mount=parseInt($(this).next().val());
    	 if(mount<=0){
    		 return false;
    	 }else{
    		 mount-=1;
    	 } 
         //--注意这里必须加一个 this.parentNode 限定范围。否则会导致错误的发生即。所有的 amount都会增加相应的数值
         $(".amount",this.parentNode).val(mount);
         var c= fn_calMoney(mount,parseFloat($(".price",this.parentNode.parentNode).text()));
         c=c.toFixed(2);//取2位数自动月份
         $(".lcount",this.parentNode.parentNode).text(c);
         fn_allMoney();
     });     
     //--这里为了模拟库存，设置一个最大数为20
     $("tbody .add").bind('click', function(){
    	 var mount=parseInt($(this).prev().val()) ;
    	 if(mount<0||mount>=20){ 
    		 return false;
    	  }else{ 
    		  mount+=1;
    	  };
          $(".amount",this.parentNode).val(mount);
          var c=fn_calMoney(mount,parseFloat($(".price",this.parentNode.parentNode).text()));
          c=c.toFixed(2);//首先约分，取2位数
          $(".lcount",this.parentNode.parentNode).text(c); fn_allMoney();
     }); 
});
 
 //---单独作为，当用户点击了某个checkbox的时候就要重新进行计算的
$(document).ready(function(){ 
	$(":checkbox").click(function(){
		fn_allMoney();
	})
});

//=======================================>>
//--当用户单击了删除按钮的时候
$(document).ready(function(){
	$("tbody .deleCls").click(function(){
        if(confirm('是否删除此商品？')){ 
	        //--注意这里删除的时候也要把 商家信息删除..--         //递归
	        var par=$(this,par).parent().parent();
	        //--利用prevUntil进行探测，如果到  <tr class="opp"> ==1 的话，那么连商家信息也删除。否则的话，不
	        if(par.prevUntil(".opp").length==0){
		        par.prev().remove();
		        //--记住，首先给checkbox清楚选择
		        par.find(".selecthing").removeAttr('checked');
		        par.remove(); fn_allMoney();
            }else{
	            //--这里注意，visivible还在单元格中流着。在流中仍然保存
	            par.remove(); 
	            par.find(".selecthing").removeAttr('checked'); 
	            fn_allMoney();
            }
       };
   });
});