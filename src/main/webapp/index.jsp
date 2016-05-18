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
    <link href="/css/index.css" rel="stylesheet" type="text/css"/>    
   	<link href="/css/footer.css" rel="stylesheet" type="text/css"/>
    <script src="/scripts/common/jquery-1.11.1.min.js"></script>
    <script src="/scripts/common/jquery.easing.js"></script>
    <script src="/scripts/common/bootstrap/js/bootstrap.min.js"></script>
    <script src="/scripts/common/jquery.cookie.js"></script>
    <script src="/scripts/common/fullPage/jquery.fullPage.js"></script>
    <script src="/scripts/common/jquery.slimsscroll.js"></script>

    <script src="/scripts/index.js"></script>
</head>
<body class="index">
    <div class="fixed js-header"  id="header">
        <div class="header">
            <div class="container">
                <a href="/webUser/toIndex" class="logo"  title="猫投鹰">
                    <span class="icon icon-logo"></span>
                </a>
                <ul class="nav-login">
                    <li><a href="/webUser/toLogin" class="login">登录</a></li>
                    <li><a href="/webUser/toSignup" class="signup">注册</a></li>
                </ul>
                <ul class="nav-link">
                    <li><a href="/webUser/toIndex">首页</a></li>                  
                    <li><a href="/webUser/toNewProject">创建项目</a></li>                  
                </ul>
            </div>
        </div>
    </div>

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
					      		<a href="/app/InvestApp-web200-release.apk" class="downa andriod">Andriod下载</a>
					   		</div>				          
					   	</div>			       
				   </div>
			  	</div>
			</div>		
		</div>
		<jsp:include page="/pages/footer.jsp" flush="true" />
	</div>
  
</body>
</html>