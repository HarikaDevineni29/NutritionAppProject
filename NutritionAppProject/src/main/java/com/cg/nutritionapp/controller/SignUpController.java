package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.cg.nutritionapp.exceptions.UserException;
import com.cg.nutritionapp.exceptions.ValidateUserException;
import com.cg.nutritionapp.model.DietPlan;
import com.cg.nutritionapp.model.NutritionPlan;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.service.SignUpService;
import com.cg.nutritionapp.serviceimpl.SignUpServiceImpl;

@RestController
public class SignUpController {
	@Autowired
	SignUpServiceImpl signUpService;

	@PostMapping("/createUser")
	public SignUp addUser(@RequestBody SignUp newSignUp) throws UserException, ValidateUserException{
		return signUpService.addUser(newSignUp);
	}
	

	@PutMapping("/updateUser/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public SignUp updateUser(@RequestBody SignUp updateUser) throws ValidateUserException {
		return signUpService.updateUser(updateUser);
	}

	@GetMapping("/searchUser/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public SignUp getUser(@PathVariable("id") SignUp signUp) {

		return signUpService.getUser(signUp);
	}

	@DeleteMapping("/deleteUser/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public String deleteUser(@RequestBody SignUp signUp) {

		return signUpService.deleteUser(signUp);
	}
	@GetMapping("/showAllUsers")  
	private List<SignUp> getAllUsers()   
	{  
	return signUpService.getAllUsers();  
	}  
	

	@GetMapping("/usernutritionplans/{id}")
	public List<SignUp> getNutritionPlans(@PathVariable("id")NutritionPlan nutritionPlan) {
		return signUpService.getNutritionPlans(nutritionPlan);
	}
	@GetMapping("/getDietPlans/{userId}")
	public List<SignUp> getDietPlans(@PathVariable("userId")DietPlan dietPlan) {
		return signUpService.getDietPlans(dietPlan);
	}

}