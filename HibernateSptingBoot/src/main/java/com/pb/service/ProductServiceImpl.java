package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.dao.ProductDao;
import com.pb.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pd;
	
	@Autowired
	private Product p;
	
	private String msg;
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		msg = pd.addProduct(product);
		return msg;
	}
	@Override
	public Product getProductbyId(int pid) {
		// TODO Auto-generated method stub
		p = pd.getProductbyId(pid);
		return p;
	}
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> list = pd.getAllProduct();
		return list;
	}
	@Override
	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		msg = pd.deleteProductById(id);
		return msg;
	}
	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		msg = pd.updateProduct(product);
		return msg;
	}

}
