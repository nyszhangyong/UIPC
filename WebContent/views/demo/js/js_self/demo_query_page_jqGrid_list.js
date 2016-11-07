$(document).ready(function () {

		$("#jqGrid").jqGrid({
		url: '/UIPC/views/consumer/js/js_self/demo_query_page_jqGrid_list.json',
		datatype: "json",
		colModel: [
			{ label: 'Category Name', name: 'CategoryName', width: 75 },
			{ label: 'Product Name', name: 'ProductName', width: 90 },
			{ label: 'Country', name: 'Country', width: 100 },
			{ label: 'Price', name: 'Price', width: 80, sorttype: 'integer' },
			// sorttype is used only if the data is loaded locally or loadonce is set to true
			{ label: 'Quantity', name: 'Quantity', width: 80, sorttype: 'number' }                   
		],
		viewrecords: true, // show the current page, data rang and total records on the toolbar
		width: 780,
		height: 200,
		rowNum: 30,
		loadonce: true, // this is just for the demo
		pager: "#jqGridPager"
	});
});