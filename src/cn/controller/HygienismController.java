package cn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.Hygienism;
import cn.service.HygienismService;

@Controller
public class HygienismController {

	@Resource
	private HygienismService service;

	public HygienismService getService() {
		return service;
	}

	public void setService(HygienismService service) {
		this.service = service;
	}
	
	@RequestMapping("/findhyg")
	public String findhyg(Model model) {
		List<Hygienism> list = service.findAllhyg();
		model.addAttribute("list", list);
		return"Hygienism";
	}
}
