package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nutritionapp.exceptions.NutritionPlanException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.DietPlan;
import com.cg.nutritionapp.model.NutritionPlan;
import com.cg.nutritionapp.serviceimpl.NutritionPlanServiceImpl;
@RestController
public class NutritionPlanController {
	
	
		@Autowired
		NutritionPlanServiceImpl nutritionPlanService;
		@PostMapping("/createPlan")
		public NutritionPlan addPlan(@RequestBody NutritionPlan nutritionPlan) throws NutritionPlanException {
			return nutritionPlanService.addPlan(nutritionPlan);
		}
		//@GetMapping("/displayAllPlans")
		//public List<NutritionPlan> displayAllPlans() {
			//return NutritionPlanService.displayAllPlans();
		//}

		@GetMapping("/searchPlan/{id}")
//		@ExceptionHandler(RecordNotFoundException.class)
		public NutritionPlan getPlan(@PathVariable("id") NutritionPlan nutritionPlan) throws RecordNotFoundException {

			return nutritionPlanService.getPlan(nutritionPlan);
		}

		@DeleteMapping("/deletePlan/{id}")
//		@ExceptionHandler(RecordNotFoundException.class)
		public String deletePlan(@PathVariable("id") NutritionPlan nutritionPlan) throws RecordNotFoundException{

			return nutritionPlanService.deletePlan(nutritionPlan);
		}
		
		@GetMapping("/displayAllNutritionplans")  
		private List<NutritionPlan> getAllNutritionPlans()   
		{  
		return nutritionPlanService.getAllNutritionPlan();  
		}  

}