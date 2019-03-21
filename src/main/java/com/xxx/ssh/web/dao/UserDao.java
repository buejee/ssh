package com.xxx.ssh.web.dao;

import com.xxx.ssh.web.domain.User;

public interface UserDao extends BaseDao<User> {
	User findByUsername(String username);
}
