package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer {
	@Column(name = "Id")
	private Long userId;
	/**
	 * status defines if any user is active or blocked
	 */
	@Column(name="Status", nullable = true)
	private String status;
	/**
	 * intensity is a number which defines the ability to do workout on the scale of 1-10
	 */
	@Column(name="Intensity", nullable = true)
	private Integer intensity;
	/**
	 * goal defines the specific goal set by user or dietitian 
	 */
	@Column(name="Goal", nullable = true)
	private String goal;
	/**
	 * number of hours a person can workout
	 */
	@Column(name="WorkoutTime", nullable = true)
	private String workOutTime;
	/**
	 * time by which user wakes up
	 */
	@Column(name="WakeUpTime", nullable = true)
	private String wakeUpTime;
	/**
	 * time by which user goes to sleep
	 */
	@Column(name="SleepTime", nullable = true)
	private String sleepTime;
	/**
	 * medical condition defines if a user is having any medical conditions or not
	 */
	@Column(name="MedicalCondition", nullable = true)
	private String medicalConditon;
	/**
	 * this is a String type stores value if a person is allergic to something
	 */
	@Column(name="Allergies", nullable = true)
	private String allergicTo;
	private Long getUserId() {
		return userId;
	}
	private void setUserId(Long userId) {
		this.userId = userId;
	}
	private String getStatus() {
		return status;
	}
	private void setStatus(String status) {
		this.status = status;
	}
	private Integer getIntensity() {
		return intensity;
	}
	private void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}
	private String getGoal() {
		return goal;
	}
	private void setGoal(String goal) {
		this.goal = goal;
	}
	private String getWorkOutTime() {
		return workOutTime;
	}
	private void setWorkOutTime(String workOutTime) {
		this.workOutTime = workOutTime;
	}
	private String getWakeUpTime() {
		return wakeUpTime;
	}
	private void setWakeUpTime(String wakeUpTime) {
		this.wakeUpTime = wakeUpTime;
	}
	private String getSleepTime() {
		return sleepTime;
	}
	private void setSleepTime(String sleepTime) {
		this.sleepTime = sleepTime;
	}
	private String getMedicalConditon() {
		return medicalConditon;
	}
	private void setMedicalConditon(String medicalConditon) {
		this.medicalConditon = medicalConditon;
	}
	private String getAllergicTo() {
		return allergicTo;
	}
	private void setAllergicTo(String allergicTo) {
		this.allergicTo = allergicTo;
	}
	
	public Customer() {
		
	}
	public Customer(Long userId, String status, Integer intensity, String goal, String workOutTime, String wakeUpTime,
			String sleepTime, String medicalConditon, String allergicTo) {
		super();
		this.userId = userId;
		this.status = status;
		this.intensity = intensity;
		this.goal = goal;
		this.workOutTime = workOutTime;
		this.wakeUpTime = wakeUpTime;
		this.sleepTime = sleepTime;
		this.medicalConditon = medicalConditon;
		this.allergicTo = allergicTo;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", status=" + status + ", intensity=" + intensity + ", goal=" + goal
				+ ", workOutTime=" + workOutTime + ", wakeUpTime=" + wakeUpTime + ", sleepTime=" + sleepTime
				+ ", medicalConditon=" + medicalConditon + ", allergicTo=" + allergicTo + "]";
	}
}