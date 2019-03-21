package com.xxx.ssh.web.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxx.ssh.web.dao.UserDao;
import com.xxx.ssh.web.domain.User;
import com.xxx.ssh.web.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public void save(User entity) {
		userDao.save(entity);
	}

	@Override
	public void update(User entity) {
		userDao.update(entity);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
