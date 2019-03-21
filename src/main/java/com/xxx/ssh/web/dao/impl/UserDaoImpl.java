package com.xxx.ssh.web.dao.impl;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.xxx.ssh.web.dao.UserDao;
import com.xxx.ssh.web.domain.User;
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	@Override
	public Class<User> getEntityClass() {
		return User.class;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public User findByUsername(String username) {
		Session session = getSession();
		Query<User> query = session.createQuery("from "+getEntityClass().getName()+" where username = :username");
		query.setParameter("username", username);
		return query.uniqueResult();
	}
}
