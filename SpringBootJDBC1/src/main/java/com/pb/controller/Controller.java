package com.pb.controller;

import com.pb.entity.Product;
import com.pb.service.ProductService;
import com.pb.utility.PrepareData;

public class Controller {

	PrepareData pd = new PrepareData();
	ProductService ps = new ProductService();
	Product p = new Product();
	String str;
	
	Product data = pd.insertData(p);
	
	str = ps.insertData(data);
}
