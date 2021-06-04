package com.cg.nutritionapp.service;

import com.cg.nutritionapp.exceptions.DietPlanException;
import com.cg.nutritionapp.model.DietPlan;


public interface DietPlanService {
	DietPlan createDietPlanDetails(DietPlan dietPlan) throws DietPlanException;

	DietPlan updateDietPlan(DietPlan dietPlan) throws DietPlanException;

	 String deleteDietPlan(DietPlan dietPlan);
	 DietPlan displayDietPlanById(DietPlan dietPlan);

}
