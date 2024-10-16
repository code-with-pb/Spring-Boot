package com.pb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pb.entity.Login;

@RestController
public class Operation {
	
	@GetMapping("/api/{str}")
	public String getString(@PathVariable String str) {
		return str;
	}
	
	@GetMapping("/api/login/{un}")
	public String  getUsername(@PathVariable String un) {
		return un;
	}
	
	@GetMapping("/api/login/{un}/{pass}")
	public String login(@PathVariable String un,@PathVariable String pass) {
		String msg = un +" "+ pass;
		return msg;
	}
	
	@DeleteMapping("/api/delete/{str}")
	public String delete(@PathVariable String str) {
		return str+" deleted";
	}
	
	@PutMapping("/api/update")
	public Login updateData(@RequestBody Login lg) {
		return lg;
	}
	
	@PostMapping("/api/add")
	public Login putdata(@RequestBody Login lg) {
		return lg;
		
	}
	
	@GetMapping("/api/as")
	public String pramuse(@RequestParam String nm,@RequestParam String pass) { // url /api/as?nm=fasd&pass=sadf
		return nm+" "+pass;
	}
}
