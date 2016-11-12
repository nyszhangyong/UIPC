//要查询的页码
var pageNumber = 1;
//要查询的页大小
var pageSize = 5;
//总记录数
var totalRecord=0;
//查询关键词
var queryKeywords;

//页面初次加载的时候，首次执行查询方法，参数为空
$(function(){
	pageNumber = 1;	
    query_list_custom(pageNumber,pageSize);	
});

//查询执行方法
function query_list_custom(pageNumber,pageSize){
	$.ajax({ 
		type: "post", 
		url: "/UIPC/server/controller/demo_query_page_custom_list/queryUserList", 
		data: "pageNumber="+pageNumber+"&pageSize="+pageSize,//serialize方式，表单中的DOM元素的属性必须要有name属性，仅有ID不行
		success: function(returnMessage) {
			//要查询的页码
			pageNumber = returnMessage.page.pageNumber;
			//要查询的页大小
			pageSize = returnMessage.page.pageSize;
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
				    	  trInfo+="<th>用户名</th>";
				    	  trInfo+="<th>密码</th>";
				    	  trInfo+="<th>手机</th>";
				    	  trInfo+="<th>出生日期</th>";
				    	  trInfo+="<th>性别</th>";
				    	  trInfo+="<th>地址</th>";		    	  
				    	  trInfo+="</tr>";
				    	  trInfo+="<tr>";
				    	  trInfo+="<td>"+userInfo.userName+"</td>";
				    	  trInfo+="<td>"+userInfo.password+"</td>";
				    	  trInfo+="<td>"+userInfo.mobile+"</td>";
				    	  trInfo+="<td>"+userInfo.dateOfBirth+"</td>";
				    	  trInfo+="<td>"+userInfo.sex+"</td>";
				    	  trInfo+="<td>"+userInfo.address+"</td>";				    	  
				    	  trInfo+="</tr>";
					}else{
				    	  trInfo+="<tr>";
				    	  trInfo+="<td>"+userInfo.userName+"</td>";
				    	  trInfo+="<td>"+userInfo.password+"</td>";
				    	  trInfo+="<td>"+userInfo.mobile+"</td>";
				    	  trInfo+="<td>"+userInfo.dateOfBirth+"</td>";
				    	  trInfo+="<td>"+userInfo.sex+"</td>";
				    	  trInfo+="<td>"+userInfo.address+"</td>";
				    	  trInfo+="</tr>";
					}
				    	  return trInfo;
				 });
	        });
			generatePageBar();
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {
			alert("查询用户分页列表，返回失败！");
		}
	}); 
}
function generatePageBar(){
	//先清除分页条中的历史数据
	$("#customPagination *").remove();
	//生成分页条
	$("#customPagination").append(
		      function(){
		    	  var pagerInfo="";
		    	  pagerInfo += "<a href='javascript:goFirstPage()' id='firstPage'>&nbsp;&nbsp;首页&nbsp;&nbsp;</a>";
		    	  pagerInfo += "<a href='javascript:goPrePage()' id='prePage'>&nbsp;&nbsp;上页&nbsp;&nbsp;</a>";
		    	  pagerInfo += "<a href='javascript:goNextPage()' id='nextPage'>&nbsp;&nbsp;下页&nbsp;&nbsp;</a>";
		    	  pagerInfo += "<a href='javascript:goEndPage()' id='endPage'>&nbsp;&nbsp;尾页&nbsp;&nbsp;</a>";	
		    	  pagerInfo += "<span>";
		    	  pagerInfo += "共";
		    	  pagerInfo += "<span id='totalPage'></span>";
		    	  pagerInfo += "页，";		
		    	  pagerInfo += "跳到第";
		    	  pagerInfo += "<input id='pageNumber' type='text' size='1'";
		    	  pagerInfo += " maxlength='11'";
		    	  pagerInfo += " onkeyup='checkPageNumberInvalidNumber()'";
		    	  pagerInfo += " onkeydown='javascript:goPageNumber()'";
		    	  pagerInfo += "/>";
		    	  pagerInfo += "页，";
		    	  pagerInfo += "共";
		    	  pagerInfo += "<span id='totalRecord'></span>条，";
		    	  pagerInfo += "每页";
		    	  pagerInfo += "<input id='pageSize' type='text' size='1'";
		    	  pagerInfo += " maxlength='11'";
		    	  pagerInfo += " onkeyup='checkPageSizeInvalidNumber()'";
		    	  pagerInfo += " onkeydown='javascript:goPageSize()'";
		    	  pagerInfo += "/>";				    	  
		    	  pagerInfo += "条";
		    	  pagerInfo += "</span>";
		    	  return pagerInfo;
		      }
	);
	//为分页条赋新值
	var totalPage=Math.ceil(totalRecord/pageSize);
	$("#totalRecord").text(totalRecord);
	$("#totalPage").text(totalPage);
	$("#pageNumber").val(pageNumber);
	$("#pageSize").val(pageSize);
}
function goFirstPage(){
	pageNumber = 1;
	query_list_custom(pageNumber,pageSize)
};
function goPrePage(){
	pageNumber = pageNumber-1<= 0 ? 1 : pageNumber-1;
	query_list_custom(pageNumber,pageSize)
};
function goPageNumber(){
	var event = event||window.event;  
    if (event.keyCode == 13){
       query_list_custom(pageNumber,pageSize);
    }
};
function goPageSize(){
	var event = event||window.event;  
    if (event.keyCode == 13){
        query_list_custom(pageNumber,pageSize);
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
    	$("#pageNumber").val("1");
        alert("共"+$("#totalPage").text()+"页，您输入的页码是"+newPageCode+"!,请输入有效的页面范围!");
    }
    //立刻更新要查询的页码
    pageNumber =$("#pageNumber").val();

}
function checkPageSizeInvalidNumber(){
	var newPageSize=$("#pageSize").val();
	//判断输入的记录数是否是数字，如果不是，则替换掉非数字
    if(checkInvalidNumber()==false){
    	$("#pageSize").val(newPageSize.replace(/[^1-9]{1}[^0-9]*/g,""));//替换首位0和其它非数字字符
    }
	//判断是否输入了页大小
    if($("#pageSize").val().length < 1){
    	$("#pageSize").val("5");
    }
    //判断页大小是否在最大范围内
    if (newPageSize < 0 || newPageSize >100) {
    	$("#pageSize").val("5");
        alert("您输入的是"+newPageSize+",为了提高查询性能,请输入小于100的数字！");
    }    
    //立刻更新要查询的页大小
    pageSize = $("#pageSize").val(); 
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
    query_list_custom(pageNumber,pageSize)
};
function goEndPage(){
	pageNumber = parseInt($("#totalPage").text());
	query_list_custom(pageNumber,pageSize)
};