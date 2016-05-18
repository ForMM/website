<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
	
	<script>
	$(function(){

	$("#progressBar").hide();
	$("#background").css("display","none");
	})
	</script>
<h2 style="color:red">对不起，系统还在开发中！</h2>
