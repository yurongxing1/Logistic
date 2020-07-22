package cn.Material;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pojo.Material;
import cn.pojo.User;
import cn.service.MaterialService;

class Test {

	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	MaterialService service = (MaterialService) context.getBean("MaterService");
	
	@org.junit.jupiter.api.Test
	void test() {
		List<Material> list = service.findMater();
		for (Material m : list) {
			User u = m.getUser();
			System.out.println("物资名称\t物资价格\t领用人\t物资数量\t领用时间");
			System.out.println(m.getMaterial_name()+"\t"+m.getMaterial_money()+"\t"+u.getUser_name()+"\t"+m.getMaterial_quantity()+"\t"+m.getMaterial_data());
		}
	}
	@org.junit.jupiter.api.Test
	void test2() {
		String user_name = "ls";
		List<Material> list = service.findMohu(user_name);
		for (Material m : list) {
			User u = m.getUser();
			System.out.println("物资名称\t物资价格\t领用人\t物资数量\t领用时间");
			System.out.println(m.getMaterial_name()+"\t"+m.getMaterial_money()+"\t"+u.getUser_name()+"\t"+m.getMaterial_quantity()+"\t"+m.getMaterial_data());
		}
	}

	@org.junit.jupiter.api.Test
	void test3() {
		List<Material> list = service.findusername();
		for (Material material : list) {
			User user = material.getUser();
			System.out.println(user.getId()+"\t"+user.getUser_name());
		}
	}
	
	@org.junit.jupiter.api.Test
	void test4() {
		Material m = new Material();
		m.setMaterial_name("钢笔");
		m.setMaterial_money("40");
		m.setMaterial_userid(3);
		m.setMaterial_quantity("20");
		String sdate = "2020-06-22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date = sdf.parse(sdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		m.setMaterial_data(date);
		int row = service.addMater(m);
		if(row>0) {
			System.out.println("添加成功!");
		}else {
			System.out.println("添加失败!");
		}
	}
}
