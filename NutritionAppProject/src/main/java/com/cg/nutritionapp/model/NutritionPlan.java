package com.cg.nutritionapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NutritionPlan {
	/**
	 * ID of the Nutrition Plan
	 * ID is auto-generated
	 */
	@Id @Column(name="PlanId") @GeneratedValue(strategy = GenerationType.AUTO)
	Integer planId;
	/**
	 * Name of the Nutrition Plan
	 */
	@Column(name="PlanName", nullable = true, length = 50)
	String name;
	/**
	 * Description of the Plan
	 */
	
//	@Column(name="PlanDescription", nullable = true, length = 50)
//	String planDescription;
	/**
	 * Date of creation of the Plan
	 */
	
	Date created_At;
	/**
	 * Date of updation of Plan
	 */
	Date updated_At;
	/**
	 * Price of the Plan
	 */
	Long price;
}