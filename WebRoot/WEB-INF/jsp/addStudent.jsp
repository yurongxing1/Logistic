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
    
    <title>添加学生信息</title>
    <meta charset="utf-8" />
		<title>bootstrap案例</title>
		<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
		<!--用百度的静态资源库的cdn安装bootstrap环境-->
		<!-- Bootstrap 核心 CSS 文件 -->
		<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
		<!--font-awesome 核心我CSS 文件-->
		<link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- 在bootstrap.min.js 之前引入 -->
		<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
		<!-- Bootstrap 核心 JavaScript 文件 -->
		<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<!--jquery.validate-->
		<script type="text/javascript" src="js/jquery.validate.min.js" ></script>
		<script type="text/javascript" src="js/message.js" ></script>
		<style type="text/css">
			.form{background: rgba(255,255,255,0.0);width:400px;margin:100px auto;}
			#login_form{display: block;}
			#register_form{display: none;}
			.fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}
			input[type="text"],input[type="password"]{padding-left:26px;}
			.checkbox{padding-left:21px;}
			#xiala{
				 width: 100%;
				 height: 5%;
			    color: #999;
			    /*去掉默认的下拉三角*/
			    appearance:none;  
			    -moz-appearance:none;  
			    -webkit-appearance:none;
			}
		</style>

  </head>
  
  <body>
  <div style="background-image: url(static/images/st.jpg);background-size: cover;height: 100%">
    	<div class="container">
		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" action="addStudent">
				<h2 class="form-title">添加学生信息</h2>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<input class="form-control required" type="text" placeholder="学生姓名" name="student_name" autofocus="autofocus" maxlength="20"/>
					</div>
					<div class="form-group">
							<select name ="student_dormid" id="xiala" class="form-control required">
									 <option value="0">---请选择宿舍---</option>
									 <c:forEach items="${list}" var="s">
									 	<option value="${s.dorm.id}">${s.dorm.dorm_name}</option>
									 </c:forEach>
							</select>
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="学生年龄" name="student_age" maxlength="8"/>
					</div>
					<div class="form-group">
							<input name="student_sex" type="radio" value="1" />男
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input name="student_sex" type="radio" value="2" />女
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success pull-left" value="提交"/>
						<input type="reset" class="btn btn-success pull-right" value="清空"/>  
					</div>
				</div>
			</form>
		</div>
		</div>
		</div>
  </body>
</html>
