<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后勤系统登录页面</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
  </head>
  
  <style>

    .bb{
        height: 600px;
        background-image:url(static/images/aa.jpg);
        background-size:cover;
    }

    .form{
        padding: 40px;
       margin-top: 175px;
       background: rgba(255,255,255,0.0);
    }

   .footer{
    height: 60px;
    padding-top:20px; 
    font-size: 14px;
    font-weight: bold;
    text-align: center;
   }
   

   
</style>
    </head>
<body>
<div class="bb">
    <div style="text-align:center">
        <h1>学校后勤系统登录界面</h1>
   </div>
        <div class="row bg">
          <div class="col-md-offset-6 col-md-4 col-sm-offset-3 col-sm-7 col-xs-offset-2 col-xs-8 col-lg-offset-6 col-lg-3 form">
            <form class="form-horizontal" id="loginForm" action="javascript:void(0);"><!-- action="dologin" -->
                <div class="form-group">
                  <label for="username" class="col-sm-4 control-label">用户名</label>
                  <div class="col-sm-8">
                    <input type="text" class="form-control" id="username" placeholder="请输入用户名" name="user_name">
                  </div>
                </div>
                <div class="form-group">
                  <label for="password" class="col-sm-4 control-label">密码</label>
                  <div class="col-sm-8">
                    <input type="password" class="form-control" id="password" placeholder="请输入密码" name="user_pwd">
                  </div>
                </div>
      
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <div class="checkbox">
                      <label>
                        <input type="checkbox" checked>记住密码
                      </label>
                      <label><a href="zhuce">还没有账户?点我注册</a></label>
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" id="submitBtn" name="log_btn" class="btn btn-success"  style="width: 50%;" onclick="loginCheck()">登录</button>
                  </div>
                </div>
              </form>
              <script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
              <script type="text/javascript" src="static/js/doLogin.js"></script>
          </div> 
      </div>
    </div>
</body>
</html>
