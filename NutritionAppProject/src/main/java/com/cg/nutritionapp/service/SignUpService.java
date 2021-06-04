package com.cg.nutritionapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.nutritionapp.exceptions.UserException;
import com.cg.nutritionapp.exceptions.ValidateUserException;
import com.cg.nutritionapp.model.NutritionPlan;
import com.cg.nutritionapp.model.SignUp;

public interface SignUpService {
	 SignUp addUser(SignUp signUp) throws UserException, ValidateUserException;

	 SignUp updateUser(SignUp signUp) throws ValidateUserException;

	 String deleteUser(SignUp signUp);
	 SignUp getUser(SignUp signUp);
	  List<SignUp> getNutritionPlans(NutritionPlan nutritionPlan);
}
