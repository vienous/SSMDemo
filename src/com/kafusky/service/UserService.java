package com.kafusky.service;

import java.util.List;

import com.kafusky.model.User;

public interface UserService {
	void save(User user);
	
	boolean update(User user);
	
	boolean delete(int id);
	
	User findById(int id);
	
	List<User> findAll();
}
