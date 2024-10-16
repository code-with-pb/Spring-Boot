package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.dao.UserDao;
import com.pb.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;
	
	@Override
	public String addUser(User user1) {
		// TODO Auto-generated method stub
		return dao.addUser(user1);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return dao.getAllUser();
	}

	@Override
	public User getUserById(String username) {
		// TODO Auto-generated method stub
		return dao.getUserById(username);
	}

	@Override
	public User updateUser(User user1) {
		// TODO Auto-generated method stub
		return dao.updateUser(user1);
	}

	@Override
	public User deleteUser(String username) {
		// TODO Auto-generated method stub
		return dao.deleteUser(username);
	}

}
