package cn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pojo.Authority;
import cn.pojo.Sex;
import cn.pojo.User;
import cn.service.UserDaoService;

class UserTest {

	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	UserDaoService daoService = (UserDaoService) context.getBean("userService");
	User user = new User();
	
	//测试登录
	@Test
	void test() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名:");
		String name = input.next();
		System.out.print("请输入密码:");
		String pwd = input.next();
		user = daoService.findDl(name, pwd);
		if(user!=null) {
			System.out.println("登录成功!");
		}else {
			System.out.println("用户名或密码错误!");
		}
	}

	//测试注册
	@Test
	void adduser() {
		user.setUser_name("yu");
		user.setUser_pwd("123456");
		user.setUser_sex(1);
		user.setUser_age("20");
		user.setUser_authorityid(2);
		user.setUser_phone("151132156151");
		user.setUser_number("341551321115626642");
		user.setUser_address("浙江省杭州市");
		int row = daoService.addUser(user);
		if(row>0) {
			System.out.println("添加成功!");
		}else {
			System.out.println("添加失败!");
		}
	}
	
	//测试查询全部信息
	@Test
	void findAll() {
		List<User> list = daoService.findAll();
		for (User user : list) {
			Sex sex = user.getSex();
			Authority at = user.getAuthorityList();
			System.out.println("用户名"+user.getUser_name()+"\t密码"+user.getUser_pwd()+"性別\t"+sex.getSex_name()+"\t权限"+at.getAuthority_name());
		}
	}
}
