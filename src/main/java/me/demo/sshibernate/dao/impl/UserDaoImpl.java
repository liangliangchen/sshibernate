package me.demo.sshibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.demo.sshibernate.dao.UserDao;
import me.demo.sshibernate.model.Users;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUser() {
		String sql = "select * from user";
		return sessionFactory.getCurrentSession().createSQLQuery(sql).
				addEntity(Users.class).list();
	}

	@Override
	public void addUser(Users user) {
		sessionFactory.getCurrentSession().save(user);
	}

}
