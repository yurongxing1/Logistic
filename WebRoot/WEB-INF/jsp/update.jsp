<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册页面</title>
    <meta charset="utf-8" />
		<title>bootstrap案例</title>
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
		</style>

  </head>
  
  <body>
  <div style="background-image: url(static/images/zhuce.jpg);background-size: cover">
    	<div class="container">
		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" action="javascript:void(0);"><!-- action="xiugai" -->
				<h2 class="form-title">修改用户信息页面</h2>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
					<input type="hidden" name="id" id="id" value="${user.id}">
						<input class="form-control required" type="text" placeholder="用户名" name="user_name" id="user_name" autofocus="autofocus" maxlength="20" value="${user.user_name}" />
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="密码" name="user_pwd" id="user_pwd" maxlength="8" value="${user.user_pwd}"/>
					</div>
					<div class="form-group">
							<input name="user_sex" id="user_sex" type="radio" value="1" <c:if test="${user.user_sex eq '1'}">checked="checked"</c:if>/>男
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input name="user_sex" id="user_sex" type="radio" value="2" <c:if test="${user.user_sex eq '2'}">checked="checked"</c:if> />女
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="年龄" name="user_age" id="user_age" maxlength="8" value="${user.user_age}"/>
					</div>
					<div class="form-group">
							<input name="user_authorityid" id="user_authorityid" type="radio" value="1" <c:if test="${user.user_authorityid eq '1'}">checked="checked"</c:if>/>管理员
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input name="user_authorityid" id="user_authorityid" type="radio" value="2" <c:if test="${user.user_authorityid eq '2'}">checked="checked"</c:if>/>教师
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="手机号码" name="user_phone" id="user_phone" maxlength="11" value="${user.user_phone}"/>
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="身份证号码" name="user_number" id="user_number" maxlength="18" value="${user.user_number}"/>
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="住址" name="user_address" id="user_address" value="${user.user_address}"/>
					</div>
					<hr/>
					<div class="form-group" style="text-align:center">
						<input type="submit" class="btn btn-success" value="提交" onclick="upuser()"/>
					</div>
				</div>
			</form>
		</div>
		</div>
		</div>
		 <script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
		 <script type="text/javascript" src="static/js/updatauser.js"></script>
  </body>
</html>
