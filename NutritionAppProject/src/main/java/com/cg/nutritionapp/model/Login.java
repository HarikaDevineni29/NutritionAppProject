package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Login {
	/**
	 * email stores email of user
	 */
	@Column(name="Email", nullable = true, length = 50)
	private String email;
	/**
	 * loginNmae is the login name specified by user
	 */
	@Column(name="UserName", nullable = true, length = 50)
	private String userName;
	/**
	 * password is the password set by user
	 */
	@Column(name="Password", nullable = true, length = 50)
	private String password;
	
	public Login() {
		
	}
	public Login(String email, String userName, String password) {
		super();
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
	
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getUserName() {
		return userName;
	}
	private void setUserName(String userName) {
		this.userName = userName;
	}
	private String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", userName=" + userName + ", password=" + password + "]";
	}
}