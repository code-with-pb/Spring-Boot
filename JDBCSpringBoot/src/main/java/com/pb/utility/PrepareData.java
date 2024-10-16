package com.pb.utility;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.pb.entity.LaptopProduct;

public class PrepareData {
	LaptopProduct lp = new LaptopProduct();
	
	@RequestMapping("/index.jsp")
	public List<LaptopProduct> getData(){
		return null;
		
		
	}
}
