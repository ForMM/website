<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="/website/scripts/common/bootstrap/css/bootstrap.min.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="/website/scripts/common/bootstrap/css/bootstrap-theme.css?v={JS_CSS_V}" rel="stylesheet" type="text/css" />
    <link href="/website/css/nav.css" rel="stylesheet" type="text/css"/> 
</head>
<body class="index">
    <div class="fixed js-header"  id="header">
        <div class="header">
            <div class="container">
                <a href="/webUser/toIndex" class="logo"  title="猫投鹰">
                    <span class="icon icon-logo"></span>
                </a> 	
               			
				 <ul class="nav-login">
                    <li>						
				    	<a title="${sessionScope.user.cUserAccount}" id="loginUser" class="loginUser">
				    		<c:if test="${sessionScope.user.cUserPortrait == ''}">
				    			<img src="/website/css/img/user.png" style="height:40px;width:40px">
				    		</c:if>
				    		<c:if test="${sessionScope.user.cUserPortrait != ''}">
				    			<img src="${sessionScope.user.cUserPortrait}" style="height:40px;width:40px">
				    		</c:if>							
						</a>																   
					</li>					
                    <li><a href="/webUser/logout" style="height:40px;width:100px;" class="logout">登出</a></li>
                </ul>
                <ul class="nav-link">
                    <li><a href="/webUser/toIndex">首页</a></li>                 
                    <li><a href="/webUser/toNewProject">创建项目</a></li>                
                </ul>
            </div>
        </div>
    </div>
    <div class="userNav">   
    	<div class="container">
             <ul class="userNavMenuA" id="userNavMenu" style="top:40px;">
            	<li><a href="/webUser/toUserInfo"><i class='icon-home'></i>个人中心</a></li>                   
	            <li><a href="/webUser/accountSettings"><i class='icon-edit '></i>修改密码</a></li>                      
	        </ul>
        </div>  
	</div>		       
</body>

</html>