$(function(){
	partnerModel.getpartnerList();

})

var partnerModel = {
	initCtrl:function(){
		
	},
	verify:function(){
		
		
	},
	getpartnerList:function(){		
		$.ajax({
			url : "/partner/partnerList",
			type : "post",
			async : false,
			dataType : "json",
			data : "",
			success : function(result) {					
				
				$("#partnr-logo").html("");
				$("#partnrLogo").tmpl(result).appendTo('#partnr-logo');
			
				
			},
			error : function(e) {
				alert('系统错误！');
			}
		});
	}
}