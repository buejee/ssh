package com.xxx.ssh.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxx.ssh.web.domain.User;
import com.xxx.ssh.web.service.UserService;
import com.xxx.ssh.web.util.MD5Utils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring.xml"})
public class UserTest {
	@Autowired
	private UserService userService;
	@Test
	public void save() {
		User user = new User();
		user.setUsername("hadoop");
		user.setPassword(MD5Utils.md5("123456"));
		user.setAge(22);
		user.setMobile("13800138001");
		user.setStatus(true);
		userService.save(user);
	}
	
	@Test
	public void update() {
		User user = userService.findById(1);
		user.setStatus(true);
		userService.update(user);
	}
}
