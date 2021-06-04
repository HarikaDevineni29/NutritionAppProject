package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="sign_up")
public class SignUp {
	@Id
	@Column(name="id",unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "planId",referencedColumnName = "planId")
	private NutritionPlan nutritionPlan;
	public NutritionPlan getNutritionPlan() {
		return nutritionPlan;
	}
	public void setNutritionPlan(NutritionPlan nutritionPlan) {
		this.nutritionPlan = nutritionPlan;
	}
	/**
	 * name is of type String and used to store user's name
	 */

	@OneToOne
	@JoinColumn(name = "userId",referencedColumnName = "userId")
	private DietPlan dietplan;
	
	
	public DietPlan getDietplan() {
		return dietplan;
	}
	public void setDietplan(DietPlan dietplan) {
		this.dietplan = dietplan;
	}
	@Column
	private String name;
	/**
	 * contact is of type String and store user contact details
	 */
	@Column
	private String contact;
	/**
	 * gender is of type String and stores gender value
	 */
	@Column
	private String gender;
	/**
	 * dob is Date of Birth and is of type String
	 */
	@Column
	private String dob;
	/**
	 * photo is used to store filename of with jpg/png extension
	 */
	@Column
	private String photo;
	/**
	 * email stores email of user
	 */
	@Column
	private String email;
	/**
	 * Role specifies whether a user is customer or a dietitian 
	 */
	@Column
	private String role;
	/**
	 * loginNmae is the login name specified by user
	 */
	@Column
	private String userName;
	/**
	 * password is the password set by user
	 */
	@Column
	private String password;

	public SignUp() {
		
	}
	public SignUp(int id,String name, String contact, String gender, String dob, String photo, String email,
			String role, String userName, String password,NutritionPlan nutritionPlan,DietPlan dietplan) {
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
		this.nutritionPlan=nutritionPlan;
		this.dietplan = dietplan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Override
	public String toString() {
		return "SignUp [id=" + id + ", name=" + name + ", contact=" + contact + ", gender=" + gender + ", dob=" + dob
				+ ", photo=" + photo + ", email=" + email + ", role=" + role + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
	
}