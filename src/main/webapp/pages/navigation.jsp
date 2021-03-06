<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">   
</head>
<body class="index">
   <div class="fixed"  id="header">
        <div class="header">
            <div class="container">
            	<div class="row">            	
            		<div class="col-sm-2 col-md-2 nav-left">
            			<a href="/" class="logo-nav" style="float:right;" title="也娜美缝剂">
            				<img alt="logo" src="/css/img/logo.png" style="margin-top:0;padding:0;width:128px;height:67px;"/>
            			</a>
            		</div>
            		<div class="col-sm-10 col-md-10 nav-bar">
	            		<ul class="nav nav-link">
		                    <li><a href="../index.jsp">首页</a></li>     
		                    
		                    <li role="presentation" class="dropdown">
							    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="menu" aria-haspopup="true" aria-expanded="false">
							       	企业介绍<span class="caret"></span>
							    </a>
							    <ul class="dropdown-menu dropdown-menu-custom">
							       	<li><a href="../pages/company.jsp"><i class="icon-file"></i>企业简介</a></li>
				                    <li><a href="../pages/culture.jsp" ><i class="icon-group"></i>企业证书</a></li>
				                    <li><a href="../pages/organization.jsp"><i class="icon-group"></i>工程部管理团队</a></li>
							    </ul>
							</li>
				                   				    
				            <li role="presentation" class="dropdown">
							    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="menu" aria-haspopup="true" aria-expanded="false">
							       		产品展厅<span class="caret"></span>
							    </a>
							    <ul class="dropdown-menu dropdown-menu-custom">
							       <li><a href="../pages/product.jsp"><i class="icon-file"></i>美缝产品</a></li>
				                   <li><a href="../pages/tools.jsp" ><i class="icon-group"></i>美缝工具</a></li>	
							    </ul>
							</li>
				                        
		                   	<li><a href="../pages/partner.jsp">合作伙伴</a></li> 
		                   	<li role="presentation" class="dropdown">
							    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="menu" aria-haspopup="true" aria-expanded="false">
							       	美缝案例<span class="caret"></span>
							    </a>
							    <ul class="dropdown-menu dropdown-menu-custom">
							       <li><a href="../pages/decoration.jsp"><i class="icon-file"></i>家装</a></li>
				                   <li><a href="../pages/decoration.jsp"><i class="icon-group"></i>工程装</a></li>				                     
							    </ul>
							</li>        		                               
		                    <li><a href="../pages/news.jsp">企业动态</a></li>   		                    
		                    <li><a href="../pages/aboutus.jsp">联系我们</a></li>                      
		                </ul>            		
            		</div>
            	</div>                
            </div>
        </div>
    </div>		       
</body>

</html>