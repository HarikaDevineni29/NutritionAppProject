package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nutritionapp.exceptions.DietPlanException;
import com.cg.nutritionapp.model.DietPlan;
import com.cg.nutritionapp.serviceimpl.DietPlanServiceImpl;

@RestController
public class DietPlanController {
	@Autowired
	DietPlanServiceImpl dietPlanService;

	@PostMapping("/createDietPlanDetails")
	public DietPlan createDieticianDetails(@RequestBody DietPlan newDietPlan) throws DietPlanException{
		return dietPlanService.createDietPlanDetails(newDietPlan);
	}
	

	@PutMapping("/updateDietPlan/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public DietPlan updateDietician(@RequestBody DietPlan updateDietPlan) throws DietPlanException {
		return dietPlanService.updateDietPlan(updateDietPlan);
	}

	@GetMapping("/displayDietPlanById/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public DietPlan displayAllDietician(@PathVariable("id") DietPlan dietPlan) {

		return dietPlanService.displayDietPlanById(dietPlan);
	}

	@DeleteMapping("/deleteDietPlan/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public String deleteDietPlan(@PathVariable("id") DietPlan dietPlan) {

		return dietPlanService.deleteDietPlan(dietPlan);
	}
	@GetMapping("/displayAllDietplans")  
	private List<DietPlan> getAllDietPlans()   
	{  
	return dietPlanService.getAllDietPlans();  
	}  

}
