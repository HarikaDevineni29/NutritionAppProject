package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SignUp {
	@Id
	@NotNull
	@Column(name="id") @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * name is of type String and used to store user's name
	 */
	@Column(name="name", length = 50)
	private String name;
	/**
	 * contact is of type String and store user contact details
	 */
	@Column(name="contact") @Size(min=10,max=10)
	private String contact;
	/**
	 * gender is of type String and stores gender value
	 */
	@Column(name="gender",length = 10)
	private String gender;
	/**
	 * dob is Date of Birth and is of type String
	 */
	@Column(name="date_of_birth",length = 25)
	private String dob;
	/**
	 * photo is used to store filename of with jpg/png extension
	 */
	@Column(name="photo")
	private String photo;
	/**
	 * email stores email of user
	 */
	@Column(name="email")
	private String email;
	/**
	 * Role specifies whether a user is customer or a dietitian 
	 */
	@Column(name="role", length = 50)
	private String role;
	/**
	 * loginNmae is the login name specified by user
	 */
	@Column(name="user_name", length = 50)
	private String userName;
	/**
	 * password is the password set by user
	 */
	@Column(name="password") @Size(min=5, max=10)
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public SignUp() {
		
	}
	public SignUp(String name, String contact, String gender, String dob, String photo, String email,
			String role, String userName, String password) {
		super();
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
