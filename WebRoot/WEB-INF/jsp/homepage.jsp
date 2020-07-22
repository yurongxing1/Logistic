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
    
    <title>首页展示</title>
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
   <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							 <a href="userall">用户管理</a>
						</li>
						<li>
							 <a onclick="check();">仓库管理</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">学生信息管理<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="javascript:void(0);" onclick="find()">查询学生信息</a>
								</li>
								<li>
									 <a href="javascript:void(0);" onclick="findhyg()">查询宿舍卫生状况</a>
								</li>
								<li>
									 <a href="finddorm">查询宿舍人员</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="chaxun">新增宿舍人员</a>
								</li>
							</ul>
							
						</li>
						<li style="margin-left:100px">
							 <a><strong style="font-size:30px">学校后勤管理系统</strong></a>
						</li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
						
						<li>
							 <a href="${path}/login">注销</a>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="${path}/zhuce">没有用户?点击注册</a>
						</li>
						
					</ul>

				</div>
			</nav>
			
			<div class="jumbotron" id="aa">
			
			<form class="navbar-form navbar-left" role="search" action="userall">
					<div class="form-group">
					<span style="margin-left:150px"></span>
					<strong style="font-size:20px">姓名:</strong>
					<input type="text" class="form-control" name="user_name"/>
					<span style="margin-left:100px"></span>
					<strong style="font-size:20px">性别:</strong>
					<select class="btn" name="user_sex">
					  <option value ="0">---请选择性别---</option>
					  <option value ="1">男</option>
					  <option value="2">女</option>
					</select>
					<span style="margin-left:100px"></span>
					</div> <button type="submit" class="btn btn-default">查询</button>
			</form>
			
			<table class="table table-condensed" style="text-align: center">
				<tr bgcolor="#08E8F0">
					<td><strong>用户名</strong></td>
					<td><strong>密码</strong></td>
					<td><strong>性别</strong></td>
					<td><strong>年龄</strong></td>
					<td><strong>权限</strong></td>
					<td><strong>电话号码</strong></td>
					<td><strong>身份证号码</strong></td>
					<td><strong>住址</strong></td>
					<td colspan="2"><strong>操作</strong></td>
				</tr>
				<c:forEach var ="user" items="${list}">
					   <tr>
					    <td class="success">${user.user_name}</td>
					    <td class="warning">${user.user_pwd}</td>
					    <td class="info">${user.sex.sex_name}</td>
					    <td class="success">${user.user_age}</td>
					    <td class="warning">${user.authorityList.authority_name}</td>
					    <td class="info">${user.user_phone}</td>
					    <td class="success">${user.user_number}</td>
					    <td class="warning">${user.user_address}</td>
					    <td class="info"><a href="javascript:void(0)" onclick="dele(${user.id})">删除</a></td>
					    <td class="success"><a href="hui?id=${user.id}">修改</a></td>
					  </tr>
				</c:forEach>
			</table>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="static/js/deleuser.js"></script>
<script type="text/javascript">
	function check(){
		$(".jumbotron").removeClass();
		$("#aa").load("cangku #mater");
	}
	//dorm
	function checkdorm(){
		$(".jumbotron").removeClass();
		$("#aa").load("finddorm #dorm"); 
	}
	
	function check1(){
		$("#aa").removeClass();
		var ise = {
			"user_name" :	$(user_name).val()
		};
		$("#aa").load("cangku #mater",ise);
	}		
	
	/* 查询全部学生信息 */
	function find(){
		$(".jumbotron").removeClass();
		$("#aa").load("findstu #student");
	}
	
	/* 模糊查询 */
	function findmohu(){
		$("#aa").removeClass();
		var ise = {
			"student_name"	:	$(student_name).val()
		};
		$("#aa").load("findstu #student",ise);
	}
	
	function findhyg(){
		$("#aa").removeClass();
		$("#aa").load("findhyg #Hygienism");
	}
	function delmater(id){
    		var $dele = confirm("确定要删除吗?");
    		if($dele == true){
    			$.ajax({
    				"url"		:		"shanchu",	
    				"type"		:		"post",								
    				"data"		:		"id="+id,							
    				"dataType"	:		"text",							
    				"success"	:		callBack,						
    				"error"		:		function(){						
    					alert("删除信息请求失败!");
    				}
    			});
    			function callBack(ruelt){
    				if(ruelt == "true"){
    					alert("删除成功!");
    					$(".jumbotron").removeClass();
						$("#aa").load("cangku #mater");
    				}else{
    					alert("删除失败!");
    					window.location.href = "userall";
    				}
    			}
    		}
	}
</script>
  </body>
</html>
			