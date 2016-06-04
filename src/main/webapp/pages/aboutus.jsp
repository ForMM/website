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
    <link href="../../css/aboutus.css" rel="stylesheet" type="text/css"/>     
   	<link href="../../css/footer.css" rel="stylesheet" type="text/css"/>
   	
   	 	
   	<!--[if lt IE 9]>
<script type="text/javascript" src="../../scripts/common/html5.js"></script>
<script type="text/javascript" src="../../scripts/common/bootstrap/js/respond.min.js"></script>
<![endif]-->
   	
    <script src="../../scripts/common/jquery-1.11.1.min.js"></script>
    <script src="../../scripts/common/jquery.easing.js"></script>
    <script src="../../scripts/common/bootstrap/js/bootstrap.min.js"></script>  
    <script src="../../scripts/common/jquery.slimsscroll.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=136a0c1063fcd5642df9618ddf29a973"></script>
</head>
<body class="aboutus">
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
				<div class="col-xs-3 col-md-3" style="text-align:center;">				
					<img class="banner-img" src="../../css/img/left-contact.jpg"/>	 		
				</div>	
				<div class="col-xs-9 col-md-9 contact-div" >
					<div>
						<h1>也娜运营中心</h1>
						<h3>电话：400-807-9557</h3> 
						<h3>传真：010-87653982</h3> 
						<h3>E-mail: bosh1705@sina.com</h3> 
						<h3>网址：www.bjbosh.com</h3> 
						<h3>地址：北京市大兴区亦庄工业园12栋B</h3> 	
					</div>		
					<div>
						<img class="qr-code" src="../../css/img/qr-code.png"/>	 
					</div>		
						
				</div>			  
			</div>
			<div class="row">
				<div id="allmap"></div>
			</div>	
			<script type="text/javascript">
				// 百度地图API功能
				var map = new BMap.Map("allmap");    // 创建Map实例
				var point = new BMap.Point(113.004549,28.139983);
				map.centerAndZoom(point, 15);  // 初始化地图,设置中心点坐标和地图级别
				
				var sContent ="<h3>也娜环保科技有限公司</h3><span>联系人：林先生 18664556413</span>";
				var infoWindow = new BMap.InfoWindow(sContent);  // 创建信息窗口对象
				map.openInfoWindow(infoWindow,point); //开启信息窗口
				
				
				map.addControl(new BMap.MapTypeControl());   //添加地图类型控件
				map.setCurrentCity("北京");          // 设置地图显示的城市 此项是必须设置的
				map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
			</script>
		</div>		
	</div>
	<jsp:include page="/pages/footer.jsp" flush="true" />
</body>
