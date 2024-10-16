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

import com.pb.entity.Product;
import com.pb.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private Product p;
	
	@Autowired
	private ProductService ps;
	String msg;
	
	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product product) {
		msg = ps.addProduct(product);
		return msg;
	}
	
	@GetMapping("/get-product-by-id")
	public Product getProductbyId(@RequestParam int pid) {
		p = ps.getProductbyId(pid);
		return p;
	}
	
	@GetMapping("/get-all-product")
	public List<Product> getAllProduct(){
		List<Product> list = ps.getAllProduct();
		return list;
	}
	
	@DeleteMapping("/delete-product")
	public String deleteProductById(@RequestParam int id) {
		msg = ps.deleteProductById(id);
		return msg;
	}
	
	@PutMapping("/update-product")
	public String updateProduct(@RequestBody Product product) {
		System.out.println(product);
		msg = ps.updateProduct(product);
		return msg;
	}
}
