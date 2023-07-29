package com.crud.dao;

import java.util.List;

import com.crud.entity.User;


public interface UserDao {

	
	public int saveUser(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUser();
	
	public void update(User user);
	
	public void deleteUser(int id);
	
	
}
