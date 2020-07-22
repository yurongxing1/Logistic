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
  	<div class="jumbotron" id="dorm">
			<table class="table table-condensed" style="text-align: center">
				<tr bgcolor="#08E8F0">
					<td><strong>宿舍名</strong></td>
					<td colspan="4"><strong>宿舍人员</strong></td>
				</tr>
				<c:forEach var ="dorm" items="${list}">
					   <tr>
					    <td class="success">${dorm.dorm_name}</td>
					     <c:forEach var = "stu" items="${dorm.studentList}">
					    <td class="">${stu.student_name}</td>
					  </c:forEach>
					  </tr>
				</c:forEach>
			</table>	
	</div>
  </body>
</html>
