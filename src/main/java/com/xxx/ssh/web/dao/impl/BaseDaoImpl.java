package com.xxx.ssh.web.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.xxx.ssh.web.dao.BaseDao;
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	public abstract Class<T> getEntityClass();
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(T entity) {
		getSession().persist(entity);
	}
	
	@Override
	public void update(T entity) {
		getSession().update(entity);
	}
	
	@Override
	public T findById(Serializable key) {
		return getSession().get(getEntityClass(), key);
	}
	
	@Override
	public void delete(Serializable key) {
		getSession().delete(findById(key));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<T> findAll() {
		String hql = "from "+getEntityClass().getName();
		Query query = getSession().createQuery(hql);
		return query.list();
	}
}
