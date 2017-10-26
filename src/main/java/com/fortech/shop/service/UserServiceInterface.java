package main.java.com.fortech.shop.service;

import java.util.List;

import main.java.com.fortech.shop.model.User;

public interface UserServiceInterface {
	public List<User> getAllUsers();
	public void insertUser(User user);
	public void deleteUser(int id);
	
}
