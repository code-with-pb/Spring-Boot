package com.pb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pb.entity.Product;

@RestController
public class TestController {
	
	@GetMapping("/getproduct/{pname}")
	public String getProduct(@PathVariable String pname) {
		return pname;
	}
	
	@DeleteMapping("/deleteproduct/{pname}")
	public String deleteProduct(@PathVariable String pname) {
		return "Deleted"+pname;
	}
	
	@PostMapping("/addproduct")
	public Product deleteProduct(@RequestBody Product p) {
		return p;
	}
}
