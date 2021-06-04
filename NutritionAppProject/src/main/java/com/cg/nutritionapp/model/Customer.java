package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Customer {
	@Id
	//@NotNull
	@Column(name="") @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * status defines if any user is active or blocked
	 */
	@Column(name="", nullable = true)
	private String status;
	/**
	 * intensity is a number which defines the ability to do workout on the scale of 1-10
	 */
	@Column(name="", nullable = true)
	private Integer intensity;
	/**
	 * goal defines the specific goal set by user or dietitian 
	 */
	@Column(name="", nullable = true)
	private String goal;
	/**
	 * number of hours a person can workout
	 */
	@Column(name="", nullable = true)
	private String workOutTime;
	/**
	 * time by which user wakes up
	 */
	@Column(name="", nullable = true)
	private String wakeUpTime;
	/**
	 * time by which user goes to sleep
	 */
	@Column(name="", nullable = true)
	private String sleepTime;
	/**
	 * medical condition defines if a user is having any medical conditions or not
	 */
	@Column(name="", nullable = true)
	private String medicalCondition;
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	/**
	 * this is a String type stores value if a person is allergic to something
	 */
	@Column(name="", nullable = true)
	private String allergicTo;
	
	@Column(name="", nullable = true)
	private Long userId;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getIntensity() {
		return intensity;
	}
	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getWorkOutTime() {
		return workOutTime;
	}
	public void setWorkOutTime(String workOutTime) {
		this.workOutTime = workOutTime;
	}
	public String getWakeUpTime() {
		return wakeUpTime;
	}
	public void setWakeUpTime(String wakeUpTime) {
		this.wakeUpTime = wakeUpTime;
	}
	public String getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(String sleepTime) {
		this.sleepTime = sleepTime;
	}
	
	public String getAllergicTo() {
		return allergicTo;
	}
	public void setAllergicTo(String allergicTo) {
		this.allergicTo = allergicTo;
	}
	
	public Customer() {
		
	}
	public Customer(Long userId, String status, Integer intensity, String goal, String workOutTime, String wakeUpTime,
			String sleepTime, String medicalCondition, String allergicTo) {
		super();
		this.userId = userId;
		this.status = status;
		this.intensity = intensity;
		this.goal = goal;
		this.workOutTime = workOutTime;
		this.wakeUpTime = wakeUpTime;
		this.sleepTime = sleepTime;
		this.medicalCondition = medicalCondition;
		this.allergicTo = allergicTo;
		
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", status=" + status + ", intensity=" + intensity + ", goal=" + goal
				+ ", workOutTime=" + workOutTime + ", wakeUpTime=" + wakeUpTime + ", sleepTime=" + sleepTime
				+ ", medicalConditon=" + medicalCondition + ", allergicTo=" + allergicTo + "]";
	}
}