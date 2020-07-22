package cn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.Dorm;
import cn.service.DormService;

@Controller
public class DormController {

	@Resource
	private DormService service;

	public DormService getService() {
		return service;
	}

	public void setService(DormService service) {
		this.service = service;
	}
	
	@RequestMapping("/finddorm")
	public String findDorm(Model model) {
		List<Dorm> list = new ArrayList<Dorm>();
		list = service.findDorm();
		model.addAttribute("list",list);
		return "Dorm";
	}
}
