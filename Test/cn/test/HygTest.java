package cn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pojo.Condition;
import cn.pojo.Dorm;
import cn.pojo.Hygienism;
import cn.service.HygienismService;

class HygTest {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HygienismService service = (HygienismService) context.getBean("HygService");
		List<Hygienism> list = service.findAllhyg();
		System.out.println("11111111");
		
		  for (Hygienism hy : list) { 
			  Dorm dorm = hy.getDorm(); Condition condition = hy.getCondition();
			  System.out.println(dorm.getDorm_name()+"\t"+hy.getHygienism_date()+"\t"+condition.getCondition_name()); 
		  }
		 
	}

}
