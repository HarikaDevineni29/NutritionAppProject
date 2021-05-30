package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;

@Entity
public class SignUp {
	@Column(name="Id") @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * name is of type String and used to store user's name
	 */
	@Column(name="Name", nullable = true, length = 50)
	private String name;
	/**
	 * contact is of type String and store user contact details
	 */
	@Column(name="Contact", nullable = true) @Size(min=10,max=10)
	private String contact;
	/**
	 * gender is of type String and stores gender value
	 */
	@Column(name="Gender", nullable = true, length = 10)
	private String gender;
	/**
	 * dob is Date of Birth and is of type String
	 */
	@Column(name="DateOfBirth", nullable = true, length = 25)
	private String dob;
	/**
	 * photo is used to store filename of with jpg/png extension
	 */
	@Column(name="Photo")
	private String photo;
	/**
	 * email stores email of user
	 */
	@Column(name="Email", nullable = true)
	private String email;
	/**
	 * Role specifies whether a user is customer or a dietitian 
	 */
	@Column(name="Role", nullable = true, length = 50)
	private String role;
	/**
	 * loginNmae is the login name specified by user
	 */
	@Column(name="UserName", nullable = true, length = 50)
	private String userName;
	/**
	 * password is the password set by user
	 */
	@Column(name="Password", nullable = true) @Size(min=5, max=10)
	private String password;
	
	private Long getId() {
		return id;
	}
	private void setId(Long id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getContact() {
		return contact;
	}
	private void setContact(String contact) {
		this.contact = contact;
	}
	private String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	private String getDob() {
		return dob;
	}
	private void setDob(String dob) {
		this.dob = dob;
	}
	private String getPhoto() {
		return photo;
	}
	private void setPhoto(String photo) {
		this.photo = photo;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getRole() {
		return role;
	}
	private void setRole(String role) {
		this.role = role;
	}
	private String getUserName() {
		return userName;
	}
	private void setLoginName(String userName) {
		this.userName = userName;
	}
	private String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	
	public SignUp() {
		
	}
	public SignUp(Long id, String name, String contact, String gender, String dob, String photo, String email,
			String role, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.photo = photo;
		this.email = email;
		this.role = role;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignUp [id=" + id + ", name=" + name + ", contact=" + contact + ", gender=" + gender + ", dob=" + dob
				+ ", photo=" + photo + ", email=" + email + ", role=" + role + ", userName=" + userName + ", password="
				+ password + "]";
	}
}
