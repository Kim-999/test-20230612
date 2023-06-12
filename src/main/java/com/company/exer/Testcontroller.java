package com.company.exer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {
	
	@RequestMapping(value="/")
	public String index() {
		return "home";
	}

	@RequestMapping(value = "/test")
	public String test() {
		
		return "test";
	}
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("id");
		String mpw = request.getParameter("pw");
		
		model.addAttribute("memberID",mid);
		model.addAttribute("memberPW",mpw);
		
		
		return "loginOk";
	}
}
