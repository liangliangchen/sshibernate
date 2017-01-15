package me.demo.sshibernate.dao;

import java.util.List;

import me.demo.sshibernate.model.Users;

public interface UserDao {
	
	public List<Users> getAllUser();
	
	public void addUser(Users user);

}
