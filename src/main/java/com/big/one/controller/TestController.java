package com.big.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class TestController {

	
	@RequestMapping("/test")
	public String gogogogo() {
		System.out.print("Fixed 해줘");
		System.out.print("굿!");
		System.err.print("굿");
		return "home";
	}
	public static void main(String[] args) {
		System.out.print("Fixed 해줘");
		System.out.print("굿!");
		System.err.print("굿");
	}
	
}
