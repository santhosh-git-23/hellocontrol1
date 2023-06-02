package com.example.hello.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloController {

	@GetMapping("/")
	public String getHello(Model model) {
		model.addAttribute("hello","Hello Santhosh!");
		return "hello";
	}
}