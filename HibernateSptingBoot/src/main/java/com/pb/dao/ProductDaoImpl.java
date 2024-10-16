package com.pb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sf;
	private Transaction tx;
	
	
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(product);
			tx.commit();
			return "Product Added SuccessFully !!";
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			sn.close();
		}
		return null;
	}

	@Override
	public Product getProductbyId(int pid) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Product p = sn.get(Product.class, pid);
			return p;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Criteria criteria = sn.createCriteria(Product.class);
			List<Product> list = criteria.list();
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			sn.close();
		}
		return null;
	}

	@Override
	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			Product p = sn.get(Product.class, id);
			sn.delete(p);
			tx.commit();
			return "Product Deleted SuccessFully !!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			//Product p = sn.get(Product.class, product.getProductId());
			sn.update(product);
			tx.commit();
			return "Product Updated SuccessFully !!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sn.close();
		}
		return null;
	}

}
