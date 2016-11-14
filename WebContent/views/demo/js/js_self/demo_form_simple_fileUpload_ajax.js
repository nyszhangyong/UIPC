$(function() {  
	var location = (window.location+'').split('/'); 
	var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
	$('#fileupload').fileupload();               
}); 