package com.big.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping("/test")
	public String gogogogo() {
		System.out.print("close 해줘");
		return "home";
	}
}
