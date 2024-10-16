package com.pb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pb.entity.Product;

public class ProductDao {
	static Connection cn = null;
	String sql;
	int rows;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootproductdb","root","admin");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String insertData(Product data) {
		sql = "insert into product values(?,?,?)";
		
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement(sql);
			ps.setInt(1, data.getId());
			ps.setString(2, data.getProductName());
			ps.setDouble(3, data.getPrice());
			
			rows = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rows+" rows affected";
	}
}
