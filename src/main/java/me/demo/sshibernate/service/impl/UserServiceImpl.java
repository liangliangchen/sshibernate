package me.demo.sshibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.demo.sshibernate.dao.UserDao;
import me.demo.sshibernate.model.Users;
import me.demo.sshibernate.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(Users user) {
		userDao.addUser(user);
	}

}
