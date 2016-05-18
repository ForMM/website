<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>猫投鹰，让投资更简单</title>
    <meta name="keywords" content="猫投鹰,创业,投资,创业梦想">
    <meta name="description" content="猫投鹰专注于为以高科技为基础的新创公司提供融资活动，只要你的创业项目好，资金就在我们这里找。">
    <meta name="author" content="猫投鹰">
    <link rel="shortcut icon" type="image/x-icon" href="/maotouying_favicon.ico" media="screen" />
    <link href="/scripts/common/bootstrap/css/bootstrap.min.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="/scripts/common/bootstrap/css/bootstrap-theme.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="/css/nav.css" rel="stylesheet" type="text/css"/>
    <link href="/css/main.css" rel="stylesheet" type="text/css"/>
    <link href="/css/footer.css" rel="stylesheet" type="text/css"/>

    <script src="/scripts/common/jquery-1.11.1.min.js"></script>
    <script src="/scripts/common/jquery.easing.js"></script>
    <script src="/scripts/common/bootstrap/js/bootstrap.min.js"></script>
    <script src="/scripts/common/jquery.cookie.js"></script>
    <script src="/scripts/common/fullPage/jquery.fullPage.js"></script>
    <script src="/scripts/common/jquery.slimsscroll.js"></script>
    <script src="/scripts/main.js"></script>
</head>
<body class="index">
    <jsp:include page="/pages/navigation.jsp" flush="true" />		
    <%--  <div id="fullPage">
        <div class="section section-home section-switch-banner">
           <div id="indexCarousel" class="carousel bslide" data-ride="carousel">            
               <div class="carousel-inner" role="listbox">
                   <div class="item active banner-ronghe">
                   		<div class="bannerPhone"></div>                   		                       
                	   	<div class="bannerPhoneText">
                       		<h1>猫投鹰</h1>  
                       		<span>让投资更简单</span>                      
                        </div>      
			            <div class="downloadDiv">				            
			            	<div class="hrefDiv">
			            		<img alt="" class="qrCode" src="/css/img/qrCode.png"/>
			            		<div class="downHref">
				            		<a href="#" class="downa iphone">iPhone 下载</a>
					             	<a href="#" class="downa andriod">Andriod下载</a>
			            		</div>				          
			            	</div>			       
			            </div>		     	          				  			
                   </div>                 
               </div>
               <jsp:include page="/pages/footer.jsp" flush="true" />	           
           </div>          
        </div>
    </div>    --%>
    <div id="fullPage" >
		<div class="container divBanner">
			<div class="row">
				<div class="col-xs-12 col-md-6" style="text-align:center;">
				<!-- 	<img class="bannerPhone" /> -->
					<div class="bannerPhone"></div> 		
				</div>
			  	<div class="col-xs-12 col-sm-12  col-md-6" style="text-align:center;">
			  		<div class="bannerPhoneText">
		                <h1>猫投鹰</h1>  
		                <span>让投资更简单</span>                      
		            </div>  
		  			<div class="downloadDiv">				            
					   	<div class="hrefDiv" style="text-align:center;">
					   		<img alt="" class="qrCode" src="/css/img/qrCode.png"/>
					   		<div class="downHref">
					    		<a href="#" class="downa iphone">iPhone 下载</a>
					      		<a href="#" class="downa andriod">Andriod下载</a>
					   		</div>				          
					   	</div>			       
				   </div>
			  	</div>
			</div>	
		</div>
		<jsp:include page="/pages/footer.jsp" flush="true" />
	</div>
</body>
