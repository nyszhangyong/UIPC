//页面初次加载的时候，首次执行查询方法，参数为空
$(query_list_custom());
//查询执行方法
function query_list_custom(){
	$.ajax({ 
		type: "post", 
		url: "/UIPC/views/consumer/js/js_self/demo_query_page_custom_list.json", 
		data: "",//serialize方式，表单中的DOM元素的属性必须要有name属性，仅有ID不行
		success: function(returnMessage) {
			//alert("success");
			$.each(returnMessage.rows, function(i, userInfo) {
				$("#customTable").append(
				      function(){
				    	  var trInfo="<tr>";
				    	  trInfo+="<td>"+userInfo.CategoryName+"</td>";
				    	  trInfo+="<td>"+userInfo.ProductName+"</td>";
				    	  trInfo+="<td>"+userInfo.Country+"</td>";
				    	  trInfo+="<td>"+userInfo.Price+"</td>";
				    	  trInfo+="<td>"+userInfo.Quantity+"</td>";
				    	  trInfo+="</tr>";
				    	  return trInfo;
				      }
				);
	        });
			$("#customPagination").append(
				      function(){
				    	  var pagerInfo="";
				    	  pagerInfo += "<a href='javascript:goFirstPage()' id='firstPage'>首页</a>";
				    	  pagerInfo += "<a href='javascript:goPrePage()' id='prePage'>上页</a>";
				    	  pagerInfo += "<span>";
				    	  pagerInfo += "<input id='currentPage' type='text' size='1'";
				    	  pagerInfo += " maxlength='11'";
				    	  pagerInfo += " onkeyup='checkCurrentPageInvalidNumber()'";
				    	  pagerInfo += " onkeydown='javascript:goCurrentPage()'";
				    	  pagerInfo += "/>";
				    	  pagerInfo += "/";
				    	  pagerInfo += "<span id='totalPage'></span>页";
				    	  pagerInfo += "(";
				    	  pagerInfo += "共<span id='totalRecord'></span>条,";
				    	  pagerInfo += "单页";
				    	  pagerInfo += "<input id='singlePageRecord' type='text' size='1'";
				    	  pagerInfo += " maxlength='11'";
				    	  pagerInfo += " onkeyup='checkSinglePageRecordInvalidNumber()'";
				    	  pagerInfo += " onkeydown='javascript:goSinglePageRecord()'";
				    	  pagerInfo += "/>";				    	  
				    	  pagerInfo += "条";
				    	  pagerInfo += ")";
				    	  pagerInfo += "</span>";
				    	  pagerInfo += "<a href='javascript:goNextPage()' id='nextPage'>下页</a>";
				    	  pagerInfo += "<a href='javascript:goEndPage()' id='endPage'>尾页</a>";	    	  
				    	  return pagerInfo;
				      }
			);
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {
			alert("返回失败！");
		}
	}); 
}
function goFirstPage(){
	alert("首页");
};
function goPrePage(){
	alert("上页");
};
function goCurrentPage(){
	var event = event||window.event;  
    if (event.keyCode == 13){
    	alert("当前页");
    }
};
function goSinglePageRecord(){
	var event = event||window.event;  
    if (event.keyCode == 13){
    	alert("单页");
    }
};
function checkCurrentPageInvalidNumber(){
    if(checkInvalidNumber()==false){
    	var temp=$("#currentPage").val();
    	$("#currentPage").val(temp.replace(/[^1-9]{1}[^0-9]*/g,""));//替换首位0和其它非数字字符
    }
}
function checkSinglePageRecordInvalidNumber(){
    if(checkInvalidNumber()==false){
    	var temp=$("#currentPage").val();
    	$("#currentPage").val(temp.replace(/[^1-9]{1}[^0-9]*/g,""));//替换首位0和其它非数字字符
    }
}
function checkInvalidNumber(){
	var event = event||window.event;
	var ifInvalid;	
	ifInvalid=ifInvalid||event.keyCode==48||event.keyCode==96;//验证输入的是否是0（48是字母键盘0,96是数字键盘0）
	ifInvalid=ifInvalid||event.keyCode==49||event.keyCode==97;//1
	ifInvalid=ifInvalid||event.keyCode==50||event.keyCode==98;//2
	ifInvalid=ifInvalid||event.keyCode==51||event.keyCode==99;//3
	ifInvalid=ifInvalid||event.keyCode==52||event.keyCode==100;//4
	ifInvalid=ifInvalid||event.keyCode==53||event.keyCode==101;//5
	ifInvalid=ifInvalid||event.keyCode==54||event.keyCode==102;//6
	ifInvalid=ifInvalid||event.keyCode==55||event.keyCode==103;//7
	ifInvalid=ifInvalid||event.keyCode==56||event.keyCode==104;//8
	ifInvalid=ifInvalid||event.keyCode==57||event.keyCode==105;//9	
    if(ifInvalid==false){
    	alert("请您输入数字!");
    }
	return ifInvalid;
}
function goNextPage(){
	alert("下页");
};
function goEndPage(){
	alert("尾页");
};