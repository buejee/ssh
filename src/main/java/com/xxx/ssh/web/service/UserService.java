package com.xxx.ssh.web.service;
import java.util.List;
import com.xxx.ssh.web.domain.User;
public interface UserService {
	void save(User entity);
	void update(User entity);
	void delete(Integer id);
	User findById(Integer id);
	User findByUsername(String username);
	List<User> findAll();
}
