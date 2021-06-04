package com.cg.nutritionapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.nutritionapp.exceptions.NutritionPlanException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.NutritionPlan;

public interface NutritionPlanService {
	 NutritionPlan addPlan(NutritionPlan nutritionPlan) throws NutritionPlanException ;
	 //List<NutritionPlan> displayAllPlans();
	 String deletePlan(NutritionPlan nutritionPlan) throws RecordNotFoundException;
	 NutritionPlan getPlan(NutritionPlan nutritionPlan) throws RecordNotFoundException;
	 public void setnutritionplanDetails(NutritionPlan nutritionplan);

}