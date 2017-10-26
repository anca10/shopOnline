package main.java.com.fortech.shop.dao;

import java.util.List;

import main.java.com.fortech.shop.model.User;

public interface UserDaoInterface {

	public List<User> getAllUsers();
	public void insertUser(User user);
	public void deleteUser(int id);

}
