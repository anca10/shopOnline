package main.java.com.fortech.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.fortech.shop.dao.UserDao;
import main.java.com.fortech.shop.model.User;

@Service("userService")
public class UserService implements UserServiceInterface{

	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
		
	}

	public void deleteUser(int id) {
		userDao.deleteUser(id);
		
	}

}
