package com.pb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pb.model.LoginRequest;

@Controller
public class RegisterController {
	
	@GetMapping("/register")
	public String RegisterPage(@ModelAttribute LoginRequest lg) {
		System.out.println(lg.getUsername()+" "+lg.getPassword());
		return "register";
	}
}
