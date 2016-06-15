<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
    <title>也娜美缝剂-瓷砖填缝剂</title>
    <meta name="keywords" content="也娜美缝剂,瓷砖填缝剂">
    <meta name="description" content="也娜美缝剂专注于在终极客户端以完美的施工，最大限度的发挥产品的特点">
    <meta name="author" content="也娜美缝剂">
    <link rel="shortcut icon" type="image/x-icon" href="/maotouying_favicon.ico" media="screen" />
    <link href="../../scripts/common/bootstrap/css/bootstrap.min.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="../../scripts/common/bootstrap/css/bootstrap-theme.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="../../css/nav.css" rel="stylesheet" type="text/css"/>  
     <link href="../../css/partner.css" rel="stylesheet" type="text/css"/>    
   	<link href="../../css/footer.css" rel="stylesheet" type="text/css"/>
   	<link href="../../scripts/common/jquery-wall/css/style.css" rel="stylesheet" type="text/css"/>
   	
   	 	
   	  	<!--[if lt IE 9]>
	<script type="text/javascript" src="/scripts/common/html5.js"></script>
	<script type="text/javascript" src="/scripts/common/html5shiv.js"></script>
	<script type="text/javascript" src="/scripts/common/respond.min.js"></script>
	<![endif]-->
   	
   	<script src="../../scripts/common/jquery-1.11.1.min.js"></script>
    <script src="../../scripts/common/jquery.easing.js"></script>
    <script src="../../scripts/common/bootstrap/js/bootstrap.min.js"></script>  
    <script src="../../scripts/common/jquery.slimsscroll.js"></script>   
   	
   	
    <script src="../../scripts/common/jquery-wall/js/jquery.min.js"></script>
    <script src="../../scripts/common/jquery.easing.js"></script>       
    
    <script type="text/javascript" src="../../scripts/common/jquery-wall/js/jquery.masonry.min.js"></script>   
</head>
<body class="culture">
    <jsp:include page="/pages/navigation.jsp"/>		
   <!--  <div>
		<div class="container content-img">
			<div class="row">
				<div class="col-xs-12 col-md-12" style="text-align:center;">
					<img class="banner-img" src="../../css/img/banner1-aboutus.png"/>					
				</div>			  
			</div>	
		</div>		
	</div> -->
	<div>
		<div class="container content-img" id="content-img">
				
			
			<div class="row" >
			
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-1.png" width="80%" height="150px"/>		
				</div>		
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-2.png" width="80%" height="150px"/>		
				</div>	
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-3.png" width="80%" height="150px"/>		
				</div>			
			
			</div>
			
			<div class="row" >
			
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-4.png" width="80%" height="150px"/>		
				</div>		
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-5.png" width="80%" height="150px"/>		
				</div>	
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-6.png" width="80%" height="150px"/>		
				</div>			
			
			</div>
			
			<div class="row">
			
					
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-7.png" width="80%" height="150px"/>		
				</div>	
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-8.png" width="80%" height="150px"/>		
				</div>	
				<div class="col-xs-4 col-md-4 logo-div" style="text-align:center;">
					<img src="../../css/img/anlie-9.png" width="80%" height="150px"/>		
				</div>		
			
			</div>
		
		
		
		
		
		</div>	
			
		<div id="light" class="white_content">
			<a href="javascript:void(0)" onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">
				<img id="img-row" src=""/>
			</a>
		</div>
		<div id="fade" class="black_overlay"></div>
		
	</div>
	<jsp:include page="/pages/footer.jsp" flush="true" />
</body>
<script type="text/javascript">
	$("#content-img").find("img").click(function(){		
		document.getElementById('light').style.display='block';
		document.getElementById('fade').style.display='block';		
		$("#img-row").attr("src",$(this).attr("src")).css({width:'100%',height:'100%'});
	});
</script>
