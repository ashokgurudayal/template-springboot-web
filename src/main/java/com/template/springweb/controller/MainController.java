package com.template.springweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("/")
	public String userLogin(Model model) {
		return "home.html";
	}
}
