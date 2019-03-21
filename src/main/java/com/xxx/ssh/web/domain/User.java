package com.xxx.ssh.web.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="xx_user")
public class User extends BaseEntity {
	private String username;
	private String password;
	@Column(length=11)
	private String mobile;
	private int age;
	private boolean status;
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", status=" + status + ", id=" + id + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
