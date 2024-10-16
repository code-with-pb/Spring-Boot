package com.pb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pb.model.LoginRequest;

@Controller
public class AuthController {
	
	/*
	 * Using RequestParam
	 * 
	 * @GetMapping("/login-user")
	public String loginProcess(@RequestParam String fullname, @RequestParam String username, @RequestParam String password) {
		
		System.out.println(fullname);
		System.out.println(username);
		System.out.println(password);
		
		return null;
	}*/
	
	
	@GetMapping("/login-user")
	public String loginProcess(@ModelAttribute LoginRequest loginreq) {
		
		System.out.println(loginreq);
		return null;
	}
}
