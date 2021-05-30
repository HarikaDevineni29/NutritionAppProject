package com.cg.nutritionapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class WeightLog {
	@Column(name = "UserId")
	private Long userId;
	/**
	 * weight is of type double and store weight of user
	 */
	@Column(name="Weight")
	private Double weight;
	/**
	 * height is also of type double and stores height
	 */
	@Column(name="Height")
	private Double height;
	/**
	 * Stores date of updation of record.
	 */
	@Column(name="LastUpdated")
	LocalDate updated_At;
	
	private Long getUserId() {
		return userId;
	}
	private void setUserId(Long userId) {
		this.userId = userId;
	}
	private Double getWeight() {
		return weight;
	}
	private void setWeight(Double weight) {
		this.weight = weight;
	}
	private Double getHeight() {
		return height;
	}
	private void setHeight(Double height) {
		this.height = height;
	}
	private LocalDate getUpdated_At() {
		return updated_At;
	}
	private void setUpdated_At(LocalDate updated_At) {
		this.updated_At = updated_At;
	}
	
	public WeightLog() {
		
	}
	public WeightLog(Long userId, Double weight, Double height, LocalDate updated_At) {
		super();
		this.userId = userId;
		this.weight = weight;
		this.height = height;
		this.updated_At = updated_At;
	}
	
	@Override
	public String toString() {
		return "WeightLog [userId=" + userId + ", weight=" + weight + ", height=" + height + ", updated_At="
				+ updated_At + "]";
	}
	
}
