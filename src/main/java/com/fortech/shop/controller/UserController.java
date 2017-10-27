package main.java.com.fortech.shop.controller;

import java.util.Arrays;
import java.util.List;

import main.java.com.fortech.shop.model.User;
import main.java.com.fortech.shop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usr")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		List<User> users = userService.getAllUsers();
		if(users.isEmpty()) return Arrays.asList(new User(100,"Lista goala","No pass"));
		return users;
	}
	
	@RequestMapping(value = "/user/insert", method = RequestMethod.POST)
	public void insertUser(User user){
		userService.insertUser(user);
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") int id){
		userService.deleteUser(id);
	}

}
