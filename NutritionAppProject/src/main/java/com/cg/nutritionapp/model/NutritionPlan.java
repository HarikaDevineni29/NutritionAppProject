package com.cg.nutritionapp.model;

	import java.time.LocalDate;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	import org.springframework.format.annotation.DateTimeFormat;
@Entity

	public class NutritionPlan {
		
		@Id 
		@Column(name="PlanId")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int planId;
		/**
		 * Name of the Nutrition Plan
		 */
		@Column(name="PlanName", nullable = true, length = 50)
		private String name;
		/**
		 * Description of the Plan
		 */
		
//		@Column(name="PlanDescription", nullable = true, length = 50)
//		String planDescription;
		/**
		 * Date of creation of the Plan
		 */
		//@Temporal(TemporalType.DATE)
		//@DateTimeFormat(style = "yyyy-MM-dd")
		private LocalDate created_At;
		/**
		 * Date of updation of Plan
		 */
		/**
		 * Price of the Plan
		 */
		
		private int price;
		public NutritionPlan() {
			super();
			// TODO Auto-generated constructor stub
		}
		public NutritionPlan(int planId, String name, LocalDate created_At, int price) {
			super();
			this.planId = planId;
			this.name = name;
			this.created_At = created_At;
			this.price = price;
		}
		
		public int getPlanId() {
			return planId;
		}
		public void setPlanId(int planId) {
			this.planId = planId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getCreated_At() {
			return created_At;
		}
		public void setCreated_At(LocalDate created_At) {
			this.created_At = created_At;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "NutritionPlan [planId=" + planId + ", name=" + name + ", created_At=" + created_At + ", price=" + price
					+ "]";
		}
		

	}
