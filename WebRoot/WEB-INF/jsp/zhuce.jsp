<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" action="adduser">
				<h2 class="form-title">学校后勤系统注册页面</h2>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<input class="form-control required" type="text" placeholder="用户名" name="user_name" autofocus="autofocus" maxlength="20"/>
					</div>
					<div class="form-group">
							<input class="form-control required" type="password" placeholder="密码" name="user_pwd" maxlength="8"/>
					</div>
					<div class="form-group">
							<input name="user_sex" type="radio" value="1" />男
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input name="user_sex" type="radio" value="2" />女
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="年龄" name="user_age" maxlength="8"/>
					</div>
					<div class="form-group">
							<input name="user_authorityid" type="radio" value="1" />管理员
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input name="user_authorityid" type="radio" value="2" />教师
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="手机号码" name="user_phone" maxlength="11"/>
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="身份证号码" name="user_number" maxlength="18"/>
					</div>
					<div class="form-group">
							<input class="form-control required" type="text" placeholder="住址" name="user_address"/>
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
