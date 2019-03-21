package com.xxx.ssh.web.action.admin;
import java.util.List;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import com.xxx.ssh.web.domain.User;
import com.xxx.ssh.web.service.UserService;
@ParentPackage("ssh")
public class UserAction {
	@Autowired
	private UserService userService;
	
	private List<User> users;
	private Integer id;
	private User user;
	
	public String detail() {
		System.out.println(id);
		user = userService.findById(id);
		return "detail";
	}
	
	public String list() {
		users = userService.findAll();
		return "list";
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
}
