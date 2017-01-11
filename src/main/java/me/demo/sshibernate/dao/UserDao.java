package me.demo.sshibernate.dao;

import java.util.List;

import me.demo.sshibernate.model.User;

public interface UserDao {
	
	public List<User> getAllUser();
	
	public void addUser(User user);

}
