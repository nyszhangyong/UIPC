$(function(){
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
				    	  pagerInfo += "<a href='#' id='firstPage'>首页</a>";
				    	  pagerInfo += "<a href='#' id='prePage'>上页</a>";
				    	  pagerInfo += "<span>";
				    	  pagerInfo += "<input id='currentPage' type='text' size='1'/>";
				    	  pagerInfo += "/";
				    	  pagerInfo += "<span id='totalPage'></span>页";
				    	  pagerInfo += "(共<span id='totalRecord'></span>条)";
				    	  pagerInfo += "</span>";
				    	  pagerInfo += "<a href='#' id='nextPage'>下页</a>";
				    	  pagerInfo += "<a href='#' id='endPage'>尾页</a>";
				    	  return pagerInfo;
				      }
			);
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {
			alert("返回失败！");
		}
	}); 
});