package com.xxx.ssh.web.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.xxx.ssh.web.domain.User;
import com.xxx.ssh.web.service.UserService;
public class SecurityUserDetailsService implements UserDetailsService {
	@Autowired
	private UserService userService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("用户名或密码错误");
		}
		return new org.springframework.security.core.userdetails.User(username, 
				user.getPassword(), 
				user.isStatus(), 
				true, 
				true, 
				true, 
				getGrantedAuthority(user));
	}
	public List<GrantedAuthority> getGrantedAuthority(User user){
		List<GrantedAuthority> list = new ArrayList<>();
		list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		return list;
	}
}
