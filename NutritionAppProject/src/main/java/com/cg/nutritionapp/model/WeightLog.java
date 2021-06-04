package com.cg.nutritionapp.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class WeightLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Long userId;
	/**
	 * weight is of type double and store weight of user
	 */
	
	private Double weight;
	/**
	 * height is also of type double and stores height
	 */
	
	private Double height;
	/**
	 * Stores date of updation of record.
	 */
//	 @JsonFormat(pattern="MM/dd/yyyy")
	public LocalDate updated_At;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public LocalDate getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(LocalDate updated_At) {
		this.updated_At = updated_At;
	}
	
	public WeightLog() {
		
	}
	public WeightLog(int id,Long userId, Double weight, Double height, LocalDate updated_At) {
		super();
		this.id = id;
		this.userId = userId;
		this.weight = weight;
		this.height = height;
		this.updated_At = updated_At;
	}
	@Override
	public String toString() {
		return "WeightLog [id=" + id + ", userId=" + userId + ", weight=" + weight + ", height=" + height
				+ ", updated_At=" + updated_At + "]";
	}
	
	
	
}
