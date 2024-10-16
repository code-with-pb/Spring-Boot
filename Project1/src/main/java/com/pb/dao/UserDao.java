package com.pb.dao;

import java.util.List;

import com.pb.model.User;

public interface UserDao {

	String addUser(User user1);

	List<User> getAllUser();

	User getUserById(String username);

	User updateUser(User user1);

	User deleteUser(String username);

}
