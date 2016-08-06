if (typeof jQuery != 'undefined') {  
    // jQuery is loaded => print the version
   console.log("jquery loaded");
}

function injectStyles(rule) {
  var div = $("<style/>",{
    html:   rule 
  }).appendTo("head");    
}
	

$("#bul1").click("click",function() {	
	injectStyles('#bul1{background: url(/images/icons/bullet.png) 0 -11px; }');
});

$("#bul2").click(function() {
  injectStyles('#bul2{background: url(/images/icons/bullet.png) 0 -11px; }');
});

$("#bul3").click(function() {
  injectStyles('#bul3{background: url(/images/icons/bullet.png) 0 -11px; }');
});

$("#bul4").click(function() {
  injectStyles('#bul4{background: url(/images/icons/bullet.png) 0 -11px; }');
});


	