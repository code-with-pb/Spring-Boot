package com.pb.service;

import com.pb.dao.ProductDao;
import com.pb.entity.Product;

public class ProductService {
	ProductDao pd = new ProductDao();
	public String insertData(Product data) {
		return pd.insertData(data);
	}
}
