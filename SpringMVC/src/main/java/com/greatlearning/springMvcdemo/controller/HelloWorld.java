package com.greatlearning.springMvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/")
public class HelloWorld {
	
	public String sayhello() {
		return "main-menu";
	}
}
