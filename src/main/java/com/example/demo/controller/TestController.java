package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.PojoPerson;
import com.example.demo.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;

	@RequestMapping("/hello")
	public String test(String name,Integer age,Model model){
		PojoPerson person=testService.select(name,age);
		model.addAttribute(person);
		model.addAttribute("person", person);
		return "show.jsp";
	}
}
