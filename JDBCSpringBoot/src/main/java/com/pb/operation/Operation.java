package com.pb.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.entity.LaptopProduct;

@RestController
public class Operation {
	
	@RequestMapping("/index")
	public String msg() {
		return "hello";
	}
	
	LaptopProduct lp = new LaptopProduct();
	List<LaptopProduct> list = new ArrayList<>();
	int rows;
	
	@GetMapping("/insert")
	public String insert(){
		
		lp.setId(10);
		lp.setLaptopBrand("HP");
		lp.setLaptopName("HP RYZEN3");
		lp.setLaptopService("Windows 11");
		lp.setPrice(39000.23d);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootproductdb","root","admin");
			
			String sql = "insert into laptopproduct values(?,?,?,?,?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			
			ps.setInt(1, lp.getId());
			ps.setString(2, lp.getLaptopBrand());
			ps.setString(3, lp.getLaptopName());
			ps.setString(4, lp.getLaptopService());
			ps.setDouble(5, lp.getPrice());
			
			rows = ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(rows > 0) {
			return rows+" are affected";
		}
		else {
			return "No affected";
		}
		
	}
	
	@GetMapping("/show")
	public List<LaptopProduct> show(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootproductdb","root","admin");

			
			String sql = "select * from laptopproduct";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rows = 0;
			while(rs.next()) {
				int id = rs.getInt(1);
				String brand = rs.getString(2);
				String name = rs.getString(3);
				String service = rs.getString(4);
				double price = rs.getDouble(5);
				
				LaptopProduct lp1 = new LaptopProduct(id,brand,name,service,price);
				list.add(lp1);
				rows++;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(rows > 0) {
			return list;
			//return (list.forEach(System.out::println));
		}
		else {
			return null;
		}
		//return list;
	}
	
}
