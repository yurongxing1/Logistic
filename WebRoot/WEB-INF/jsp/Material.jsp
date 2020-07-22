<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
		<!--font-awesome 核心我CSS 文件-->
		<link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- 在bootstrap.min.js 之前引入 -->
		<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
		<!-- Bootstrap 核心 JavaScript 文件 -->
		<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<!--jquery.validate-->
		<script type="text/javascript" src="js/jquery.validate.min.js" ></script>
  </head>
  
  <body>
    	<div class="jumbotron" id="mater">
			<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
					<span style="margin-left:250px"></span>
					<strong style="font-size:20px">领用人:</strong>
					<input type="text" class="form-control" name="user_name" id="user_name"/>
					<span style="margin-left:100px"></span>
					</div> <button type="button" class="btn btn-default" onclick="check1()">查询</button>
					<strong style="margin-left:150px"><a href="findname">添加仓库领用信息</a></strong>
			</form>
	
			<table class="table table-condensed" style="text-align: center">
				<tr bgcolor="#08E8F0">
					<td><strong>物资名称</strong></td>
					<td><strong>物资价格</strong></td>
					<td><strong>物资领用人</strong></td>
					<td><strong>领用数量</strong></td>
					<td><strong>操作</strong></td>
				</tr>
				<c:forEach var ="mater" items="${list}">
					   <tr>
					    <td class="success">${mater.material_name}</td>
					    <td class="warning">${mater.material_money}</td>
					    <td class="info">${mater.user.user_name}</td>
					    <td class="success">${mater.material_quantity}</td>
					    <%-- <td class="warning">${mater.material_data}</td> --%>
					    <td class="info"><a href="javascript:void(0)" onclick="delmater(${mater.id})">删除</a></td>
					  </tr>
				</c:forEach>
			</table>
			</div>		
  </body>
</html>
