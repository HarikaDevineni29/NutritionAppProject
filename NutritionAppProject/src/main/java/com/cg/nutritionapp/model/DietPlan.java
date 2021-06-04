package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class DietPlan {
	@Id
	@Column(name="id",unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private	int userId;
	@Column
	private	String slots;
	@Column
	private	String foodType;
	@Column
	private	double proteinRatio;
	@Column
	private	double fatRatio;
	@Column
	private	double carbsRatio;
	@Column
	private	double total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getProteinRatio() {
		return proteinRatio;
	}
	public void setProteinRatio(double proteinRatio) {
		this.proteinRatio = proteinRatio;
	}
	public double getFatRatio() {
		return fatRatio;
	}
	public void setFatRatio(double fatRatio) {
		this.fatRatio = fatRatio;
	}
	public double getCarbsRatio() {
		return carbsRatio;
	}
	public void setCarbsRatio(double carbsRatio) {
		this.carbsRatio = carbsRatio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public DietPlan(int id, int userId, String slots, String foodType, double proteinRatio, double fatRatio,
			double carbsRatio, double total) {
		super();
		this.id = id;
		this.userId = userId;
		this.slots = slots;
		this.foodType = foodType;
		this.proteinRatio = proteinRatio;
		this.fatRatio = fatRatio;
		this.carbsRatio = carbsRatio;
		this.total = total;
	}
	
	public DietPlan() {
		
	}

}
