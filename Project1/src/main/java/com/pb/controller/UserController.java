package com.pb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pb.model.User;
import com.pb.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private User user;
	@Autowired
	private UserService service;
	
	@PostMapping("add-user")
	public String addUser(@RequestBody User user1) {
		return service.addUser(user1);
	}
	
	@GetMapping("get-all-user")
	public List<User> getAllUser(){
		return service.getAllUser();
	}
	
	@GetMapping("get-user-by-id")
	public User getUserById(@RequestParam String username) {
		return service.getUserById(username);
	}
	
	@PutMapping("update-user")
	public User updateUser(@RequestBody User user1) {
		return service.updateUser(user1);
	}
	
	@DeleteMapping("delete-user")
	public User deleteUser(@RequestParam String username) {
		return service.deleteUser(username);
	}
}
