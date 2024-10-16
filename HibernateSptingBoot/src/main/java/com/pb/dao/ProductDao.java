package com.pb.dao;

import java.util.List;

import com.pb.entity.Product;

public interface ProductDao {
	
	public String addProduct(Product product);

	public Product getProductbyId(int pid);

	public List<Product> getAllProduct();

	public String deleteProductById(int id);

	public String updateProduct(Product product);
}
