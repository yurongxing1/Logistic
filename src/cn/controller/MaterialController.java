package cn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pojo.Material;
import cn.service.MaterialService;

@Controller
public class MaterialController {

	@Resource
	private MaterialService service;

	public MaterialService getService() {
		return service;
	}

	public void setService(MaterialService service) {
		this.service = service;
	}
	
	//查询仓库信息
	@RequestMapping("/cangku")
	public String aa(String user_name,Model model) {
		List<Material> list = new ArrayList<Material>();
		if(user_name==null || user_name == "") {
			list = service.findMater();
			model.addAttribute("list",list);
		}else {
			System.out.println("--------------------------------进入模糊查询"+user_name);
			list = service.findMohu(user_name);
			model.addAttribute("list",list);
		}
		return "Material";
	}
	
	//删除信息
	@RequestMapping("/shanchu")
	public void dele(Integer id,Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int row = service.delematerid(id);
		boolean result;
		if(row >0) {
			result = true;
		}else {
			result = false;
		}
		out.print(result);
	}
	
	@RequestMapping("/AddMater")
	public String Mater() {
		return"AddMater";
	}
	
	//查询姓名
	@RequestMapping("/findname")
	public String findName(Model model) {
		List<Material> list = service.findusername();
		model.addAttribute("list",list);
		return "forward:/AddMater";
	}
	
	@RequestMapping("/add")
	public String addMater(Material material) {
		System.out.println("------------------------------------------------------------------------------------------------");
		int row = service.addMater(material);
		
		if(row>0) {
			return"forward:/cangku";
		}else {
			return"AddMater";
		}
	}
}
