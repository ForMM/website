<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Four Boxes Slideshow | Demo 1</title>

 <!-- 	<link rel="stylesheet" type="text/css" href="css/normalize.css" /> -->
	<!-- <link rel="stylesheet" type="text/css" href="css/demo.css" /> -->
	<link rel="stylesheet" type="text/css" href="css/component.css" />
<script src="../../scripts/common/jquery-1.11.1.min.js"></script>
    <script src="js/modernizr.custom.js"></script>
    <script>
    $(function(){
    	setInterval(auto,5000);
   		 function auto(){
    		$("span[class='prev']").children("i").click();
   		 }
    });
    </script>
</head>
<body>
<div class="container">

	
	<div id="boxgallery" class="boxgallery" data-effect="effect-1">
		<div class="panel"><img src="../../css/img/banner-one.png" alt="Image 1"/></div>
		<div class="panel"><img src="../../css/img/banner-two.png" alt="Image 2"/></div>
		<div class="panel"><img src="../../css/img/banner-three.png" alt="Image 3"/></div>
		<div class="panel"><img src="../../css/img/banner-two.png" alt="Image 3"/></div>
	</div>
	
</div><!-- /container -->

<script src="js/classie.js"></script>
<script src="js/boxesFx.js"></script>
<script>
	new BoxesFx( document.getElementById( 'boxgallery' ) );
</script>

</body>
</html>