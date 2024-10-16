package com.pb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/msg")
	public String msg() {
		return "Hii";
	}
	
	@GetMapping("/add")
	public int add() {
		return 10;
	}
}
