$(function() {
  var location = (window.location+'').split('/'); 
  var basePath = location[0]+'//'+location[2]+'/'+location[3]; 
  $("#upload").on("change",function(){
      var objUrl = getObjectURL(this.files[0]) ;  
      if (objUrl) {
        $("#pic").attr("src", objUrl) ;      
      }
  });
  $("#pic").click(function () {
     $("#upload").click();
     $("#upload").on("change",function(){
       var objUrl = getObjectURL(this.files[0]) ;  
       if (objUrl) {
         $("#pic").attr("src", objUrl) ;      
       }
    });
  });
});

//建立一个可存取FILE的URL
function getObjectURL(file) {
  var url = null ;
  if (window.createObjectURL!=undefined) {//BASIC
    url = window.createObjectURL(file) ;
  } else if (window.URL!=undefined) {//MOZILLA(FIREFOX)
    url = window.URL.createObjectURL(file) ;
  } else if (window.webkitURL!=undefined) {//WEBKIT OR CHROME
    url = window.webkitURL.createObjectURL(file) ;
  }
  return url ;
}