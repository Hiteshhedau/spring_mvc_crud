package com.crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.crud.entity.User;


@Repository
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	
	@Transactional
	@Override
	public int saveUser(User user) {
		int i = (int) hibernateTemplate.save(user);
		return i;
	}

	@Override
	public User getUserById(int id) {
		User user = hibernateTemplate.get(User.class, id);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = hibernateTemplate.loadAll(User.class);

		return users;
	}

	
	@Transactional
	@Override
	public void update(User user) {
		hibernateTemplate.update(user);

	}

	
	@Transactional
	@Override
	public void deleteUser(int id) {
	User user=	hibernateTemplate.get(User.class, id);
	
	hibernateTemplate.delete(user);

	}

}
