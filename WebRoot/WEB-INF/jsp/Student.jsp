<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息展示</title>
  </head>
  
  <body>
    	<div class="jumbotron" id="student">
			<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
					<span style="margin-left:250px"></span>
					<strong style="font-size:20px">学生姓名:</strong>
					<input type="text" class="form-control" name="student_name" id="student_name"/>
					<span style="margin-left:100px"></span>
					</div> <button type="button" class="btn btn-default" onclick="findmohu()">查询</button>
					<strong style="margin-left:150px"><a href="chaxun">添加学生信息</a></strong>
			</form>
	
			<table class="table table-condensed" style="text-align: center">
				<tr bgcolor="#08E8F0">
					<td><strong>学生姓名</strong></td>
					<td><strong>宿舍号</strong></td>
					<td><strong>学生年龄</strong></td>
					<td><strong>性别</strong></td>
					<td><strong>操作</strong></td>
				</tr>
				<c:forEach var ="st" items="${list}">
					   <tr>
					    <td class="success">${st.student_name}</td>
					    <td class="warning">${st.dorm.dorm_name}</td>
					    <td class="info">${st.student_age}</td>
					    <td class="success">${st.sex.sex_name}</td>
					    <td class="info"><a href="deleStudent?id=${st.id}">删除</a></td>
					  </tr>
				</c:forEach>
			</table>
			</div>
  </body>
</html>
