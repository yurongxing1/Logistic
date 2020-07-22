package cn.controller;


import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.pojo.User;
import cn.service.UserDaoService;
import cn.utils.ReturnResult;

@Controller
public class LoginController {

	private Logger logger = Logger.getLogger(LoginController.class);
	
	@Resource
	private UserDaoService daoService;

	@RequestMapping(value="/login")
	public String findDl() {
		return "entry";
	}
	
	@RequestMapping("/zhuce")
	public String zhuce() {
		return "zhuce";
	}

	//登录
	//@RequestMapping("/dologin")
	/*public String doLogin(@RequestParam String user_name,@RequestParam String user_pwd,HttpServletRequest request,HttpServletResponse response,Model model)throws Exception{
		model.addAttribute("user_name", user_name);
		//调用service方法,进行用户匹配
		User user = daoService.findDl(user_name, user_pwd);
		request.setAttribute("user_name", user_name);
		if(null!=user) {
			return "forward:/userall";//转发
			//return "redirect:/userall";//重定向
		}else {
			return "entry";
		}
	}*/
	
	
	@RequestMapping("/dologin")
	public void doLogin(@RequestParam String user_name,@RequestParam String user_pwd,HttpServletRequest request,HttpServletResponse response)throws Exception{
		PrintWriter out = response.getWriter();
		System.out.println("----------------------------------------------ajax");
		System.out.println("----------------------------------------------"+user_name);
		User user = daoService.findDl(user_name, user_pwd);
		boolean result;
		if(user != null) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
	
	
	//注册
	@RequestMapping("/adduser")
	public String addUser(User user) {
		System.out.println("------------------------"+user.getUser_name());
		int row = daoService.addUser(user);
		if(row>0) {
			return "entry";
		}else {
			return "zhuce";
		}
	}
	
	//查询全部信息
	@RequestMapping("/userall")
	public String findAll(String user_name,Integer user_sex,Model model) {
		List<User> list = new ArrayList<User>();
		if(user_name==null || user_sex==null) {
			list = daoService.findAll();
			model.addAttribute("list", list);
		}else {
			System.out.println("---------------------------模糊查询"+user_sex);
			list = daoService.findMohu(user_name, user_sex);
			model.addAttribute("list", list);
		}
		return"homepage";
	}
	
	//模糊查询
	//@RequestMapping("/usermohu")
	/*public String findMohu(String user_name,Integer user_sex,Model model){
		List<User> list = new ArrayList<User>();
		list = daoService.findMohu(user_name, user_sex);
		model.addAttribute("list", list);
		return"homepage";
	}*/
	
	//删除信息
	@RequestMapping("/deluser")
	public void dele(Integer id,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = daoService.deluserid(id);
		boolean result;
		if(row>0){
			result = true;
		}else{
			result = false;
		}
		out.print(result);
	}
	
	//跳转update.jsp页面
	@RequestMapping("/date")
	public String xiugai() {
		return "update";
	}
	
	//查询回显信息并转发到date
	@RequestMapping("/hui")
	public String findHui(Integer id,Model model) {
		User user = new User();
		user = daoService.findHui(id);
		model.addAttribute("user",user);
		
		System.out.println("--------------------"+user.getUser_sex());
		return "forward:/date";
	}
	
	//修改信息
	@RequestMapping("/xiugai")
	public void update(User user,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("---------------------------------------"+user.getId());
		System.out.println("---------------------------------------"+user.getUser_name());
		System.out.println("---------------------------------------"+user.getUser_pwd());
		System.out.println("---------------------------------------"+user.getUser_sex());
		System.out.println("---------------------------------------"+user.getUser_age());
		System.out.println("---------------------------------------"+user.getUser_authorityid());
		System.out.println("---------------------------------------"+user.getUser_phone());
		System.out.println("---------------------------------------"+user.getUser_number());
		System.out.println("---------------------------------------"+user.getUser_address());
		PrintWriter out = response.getWriter();
		int row = daoService.updateUser(user);
		System.out.println(row+"========================================w");
		boolean result;
		if(row>0){
			result = true;
		}else{
			result = false;
		}
		out.print(result);
	}
}
