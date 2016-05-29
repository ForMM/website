<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>也娜美缝剂-瓷砖填缝剂</title>
    <meta name="keywords" content="也娜美缝剂,瓷砖填缝剂">
    <meta name="description" content="也娜美缝剂专注于在终极客户端以完美的施工，最大限度的发挥产品的特点">
    <meta name="author" content="也娜美缝剂">
    <link rel="shortcut icon" type="image/x-icon" href="/maotouying_favicon.ico" media="screen" />
    <link href="../../scripts/common/bootstrap/css/bootstrap.min.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="../../scripts/common/bootstrap/css/bootstrap-theme.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="../../css/nav.css" rel="stylesheet" type="text/css"/>  
    <link href="../../css/news.css" rel="stylesheet" type="text/css"/>     
   	<link href="../../css/footer.css" rel="stylesheet" type="text/css"/>
    <script src="../../scripts/common/jquery-1.11.1.min.js"></script>
    <script src="../../scripts/common/jquery.easing.js"></script>
    <script src="../../scripts/common/bootstrap/js/bootstrap.min.js"></script>  
    <script src="../../scripts/common/jquery.slimsscroll.js"></script>    
</head>
<body class="news">
    <jsp:include page="/pages/navigation.jsp"/>		
    <div>
		<div class="container content-img">
			<div class="row">
				<div class="col-xs-12 col-md-12" style="text-align:center;">
					<img class="banner-img" src="../../css/img/banner1-aboutus.jpg"/>					
				</div>			  
			</div>	
		</div>		
	</div>
	<div>
		<div class="container content">
			<div class="row">
				<div id="news-list" class="newsList">
				
				</div>
				<div id="newsListPage" class="pageDiv"></div>
				<script id="newsListTmpl" type="text/x-jquery-tmpl">
				{{each(i,item) dataList}}
					<div>
						<div class='header-icon'></div>
						<h1>{{= item.header }}</h1>
					</div>					
					<div>
						类别：{{if item.newsType == 0 }} 企业动态 {{/if}} {{if item.newsType == 1 }} 行业动态 {{/if}} 
						&nbsp;&nbsp;&nbsp;时间：{{= item.createTime }} 
					</div>
					<div class='newsContent'>{{= item.newsContent }}</div>            		
				{{/each}}
				</script>  
			</div>
			<div class="row">
				
			</div>				
		</div>		
	</div>
	<jsp:include page="/pages/footer.jsp" flush="true" />
	<script type="text/javascript" src="/scripts/common/laypage/1.2/laypage.js"></script> 
	<script type="text/javascript" src="/scripts/common/layer/1.9.3/layer.js"></script> 
	<script type="text/javascript" src="/scripts/common/jquery.tmpl.min.js"></script> 
	<script type="text/javascript" src="/scripts/common/jquery.tmplPlus.min.js"></script>
	<script type="text/javascript" src="/scripts/news.js"></script>
</body>
