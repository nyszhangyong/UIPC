//要查询的页码
var pageNumber = 1;
//要查询的页大小
var pagesize = 5;
//总记录数
var totalRecord=0;
//查询关键词
var queryKeywords;

//页面初次加载的时候，首次执行查询方法，参数为空
$(function(){
	queryKeywords = "";
	pageNumber = 1;	
    query_list_custom(queryKeywords,pageNumber,pagesize);	
});

//查询执行方法
function query_list_custom(queryKeywords,pageNumber,pagesize){
	$.ajax({ 
		type: "post", 
		url: "/UIPC/server/controller/demo_query_page_custom_list/queryUserList", 
		data: "pageNumber="+pageNumber+"&pagesize="+pagesize,//serialize方式，表单中的DOM元素的属性必须要有name属性，仅有ID不行
		success: function(returnMessage) {
			//要查询的页码
			pageNumber = returnMessage.page.pageNumber;
			//要查询的页大小
			pagesize = returnMessage.page.pagesize;
			//总记录数
			totalRecord=returnMessage.page.totalRecord;
			//先清除分页表格中的历史数据
			$("#customTable *").remove();
			//循环返回对象列表
			$.each(returnMessage.data, function(i, userInfo) {
				$("#customTable").append(function(){
					//初始化表头变量
					var trInfo="";
					if(i==0){
				    	  trInfo+="<tr>";
				    	  trInfo+="<td>用户名</td>";
				    	  trInfo+="<td>密码</td>";
				    	  trInfo+="</tr>";
				    	  trInfo+="<tr>";
				    	  trInfo+="<td>"+userInfo.userName+"</td>";
				    	  trInfo+="<td>"+userInfo.password+"</td>";
				    	  trInfo+="</tr>";
					}else{
				    	  trInfo+="<tr>";
				    	  trInfo+="<td>"+userInfo.userName+"</td>";
				    	  trInfo+="<td>"+userInfo.password+"</td>";
				    	  trInfo+="</tr>";
					}
				    	  return trInfo;
				 });
	        });
			//先清除分页条中的历史数据
			$("#customPagination *").remove();
			//生成分页条
			$("#customPagination").append(
				      function(){
				    	  var pagerInfo="";
				    	  pagerInfo += "<a href='javascript:goFirstPage()' id='firstPage'>首页</a>";
				    	  pagerInfo += "<a href='javascript:goPrePage()' id='prePage'>上页</a>";
				    	  pagerInfo += "<span>";
				    	  pagerInfo += "<input id='pageNumber' type='text' size='1'";
				    	  pagerInfo += " maxlength='11'";
				    	  pagerInfo += " onblur='checkPageNumberInvalidNumber()'";
				    	  pagerInfo += " onkeydown='javascript:goPageNumber()'";
				    	  pagerInfo += "/>";
				    	  pagerInfo += "/";
				    	  pagerInfo += "<span id='totalPage'></span>页";
				    	  pagerInfo += "(";
				    	  pagerInfo += "共<span id='totalRecord'></span>条,";
				    	  pagerInfo += "每页";
				    	  pagerInfo += "<input id='pagesize' type='text' size='1'";
				    	  pagerInfo += " maxlength='11'";
				    	  pagerInfo += " onblur='checkPagesizeInvalidNumber()'";
				    	  pagerInfo += " onkeydown='javascript:goPagesize()'";
				    	  pagerInfo += "/>";				    	  
				    	  pagerInfo += "条";
				    	  pagerInfo += ")";
				    	  pagerInfo += "</span>";
				    	  pagerInfo += "<a href='javascript:goNextPage()' id='nextPage'>下页</a>";
				    	  pagerInfo += "<a href='javascript:goEndPage()' id='endPage'>尾页</a>";	    	  
				    	  return pagerInfo;
				      }
			);
			//为分页条赋新值
			var totalPage=Math.ceil(totalRecord/pagesize);
			$("#totalRecord").text(totalRecord);
			$("#totalPage").text(totalPage);
			$("#pageNumber").val(pageNumber);
			$("#pagesize").val(pagesize);
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {
			alert("查询用户分页列表，返回失败！");
		}
	}); 
}
function goFirstPage(){
	pageNumber = 1;
	query_list_custom("",pageNumber,pagesize)
};
function goPrePage(){
	pageNumber = pageNumber-1<= 0 ? 1 : pageNumber-1;
	query_list_custom("",pageNumber,pagesize)
};
function goPageNumber(){
	var event = event||window.event;  
    if (event.keyCode == 13){
       query_list_custom("",pageNumber,pagesize);
    }
};
function goPagesize(){
	var event = event||window.event;  
    if (event.keyCode == 13){
        query_list_custom("",pageNumber,pagesize);
    }
};
function checkPageNumberInvalidNumber(){
	var newPageCode=$("#pageNumber").val();
	//判断输入的页码是否是数字，如果不是，则替换掉非数字
    if(checkInvalidNumber()==false){
    	$("#pageNumber").val(newPageCode.replace(/[^1-9]{1}[^0-9]*/g,""));//替换首位0和其它非数字字符
    }
	//判断是否输入了页码
    if($("#pageNumber").val().length < 1){
    	$("#pageNumber").val("1");
    }
    //判断页码是否在总页数范围内
    if (newPageCode < 0 || newPageCode >parseInt($("#totalPage").text())) {
        alert("共"+$("#totalPage").text()+"页，您输入的页码是"+newPageCode+"!,请输入有效的页面范围!");
    }
    //立刻更新要查询的页码
    pageNumber =$("#pageNumber").val();

}
function checkPagesizeInvalidNumber(){
	//判断输入的记录数是否是数字，如果不是，则替换掉非数字
    if(checkInvalidNumber()==false){
    	var newPageSize=$("#pagesize").val();
    	$("#pagesize").val(newPageSize.replace(/[^1-9]{1}[^0-9]*/g,""));//替换首位0和其它非数字字符
    }
	//判断是否输入了页大小
    if($("#pagesize").val().length < 1){
    	$("#pagesize").val("5");
    }
    //立刻更新要查询的页大小
    pagesize = $("#pagesize").val(); 
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
    if (pageNumber + 1 <= parseInt($("#totalPage").text())) {
        pageNumber=pageNumber+1;
    }
    query_list_custom("",pageNumber,pagesize)
};
function goEndPage(){
	pageNumber = parseInt($("#totalPage").text());
	query_list_custom("",pageNumber,pagesize)
};