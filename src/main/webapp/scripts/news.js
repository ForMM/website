$(function(){
	newsModel.getnewsList(1);
	$("#pageSize").on("change",function(){
		newsModel.getnewsList(1);
	});
	
	$("#searchInvestor").click(function(){
		newsModel.getnewsList(1);
	});
})

var newsModel = {
	initCtrl:function(){
		
	},
	verify:function(){
		
		
	},
	getnewsList:function(currentPage){
		var pageSize = 4;
		
		var param = {};
		param.page=currentPage;
		param.pageSize=pageSize;	
		$.ajax({
			url : "/news/newsList",
			type : "post",
			async : false,
			dataType : "json",
			data : param,
			success : function(result) {					
				
				var countPage=result.pageCount;		
								
				$("#news-list").html("");
				$("#newsListTmpl").tmpl(result).appendTo('#news-list');
			
				laypage({
				    cont: $('#newsListPage'), //容器。值支持id名、原生dom对象，jquery对象,
				    pages:countPage, //总页数
				    skip: true, //是否开启跳页
				    skin: '#319ad3',
				    groups: 5, //连续显示分页数
				    curr: currentPage || 1, 
				    jump: function(e, first){ //触发分页后的回调
				        if(!first){ //一定要加此判断，否则初始时会无限刷新
				        	var pageNow = e.curr;					        	
				        	newsModel.getnewsList(pageNow);
				        }
				    }
				});	
				
			},
			error : function(e) {
				alert('系统错误！');
			}
		});
	}
}