jQuery(document).ready(function () {
    $("#accordion").accordion();
    $("#demoFrame").attr("src", "./jsp/demo_form_simple_login_main.jsp");
});

function changeFrameHeight(){
    var ifm= document.getElementById("iframepage"); 
    ifm.height=document.documentElement.clientHeight;
}
window.onresize=function(){  
     changeFrameHeight();  
} 