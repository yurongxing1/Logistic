package cn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.Student;
import cn.service.StudentService;

@Controller
public class StudentController {

	@Resource
	private StudentService service;

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}
	

	//查询
	@RequestMapping("/findstu")
	public String findstu(String student_name,Model model) {
		List<Student> list = new ArrayList<Student>();
		if(student_name !=null) {
			list = service.findStuMohu(student_name);
			model.addAttribute("list",list);
		}else{
			list = service.findStu();
			model.addAttribute("list",list);
		}
		
		return "Student";
	}
	//跳转添加页面
	@RequestMapping("/addStu")
	public String addStuaa() {
		return"addStudent";
	}
	//查询姓名回显
	@RequestMapping("/chaxun")
	public String findname(Model model) {
		List<Student> list = service.findDorm();
		model.addAttribute("list",list);
		return"forward:/addStu";
	}
	
	//添加信息
	@RequestMapping("/addStudent")
	public String tianjia(Student student) {
		int row = service.addStudent(student);
		if(row>0) {
			return"redirect:/userall";
		}else {
			return"addStudent";
		}
	}
	
	@RequestMapping("/deleStudent")
	public String deleStudent(Integer id) {
		int row = service.deleStudent(id);
		if(row>0) {
			return"redirect:/userall";
		}else {
			return"redirect:/findstu";
		}
	}
}
