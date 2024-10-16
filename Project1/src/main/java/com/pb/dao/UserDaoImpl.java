package com.pb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sf;
	private Transaction tx;
	
	@Override
	public String addUser(User user1) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.save(user1);
			tx.commit();
			return "User Added..!";
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			Criteria criteria = sn.createCriteria(User.class);
			List<User> list = criteria.list();
			return list;
		}catch(Exception e) {
			
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public User getUserById(String username) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			User user = sn.get(User.class, username);
			return user;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public User updateUser(User user1) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			sn.update(user1);
			tx.commit();
			return user1;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

	@Override
	public User deleteUser(String username) {
		// TODO Auto-generated method stub
		Session sn = sf.openSession();
		try {
			tx = sn.beginTransaction();
			User user = sn.get(User.class, username);
			sn.delete(user);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sn.close();
		}
		return null;
	}

}
