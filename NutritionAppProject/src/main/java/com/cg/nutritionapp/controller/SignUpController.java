package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nutritionapp.exceptions.RecordAlreadyPresentException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.service.SignUpService;

@ComponentScan(basePackages = "com")
@RestController
public class SignUpController {
	@Autowired
	SignUpService signUpService;

	@PostMapping("/createUser")
//	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addUser(@RequestBody SignUp newSignUp) {
		signUpService.createUser(newSignUp);
	}
	
	@ResponseBody
	@GetMapping("/readAllUsers")
	public List<SignUp> readAllUsers() {

		return signUpService.displayAllUser();
	}

	@PutMapping("/updateUser")
//	@ExceptionHandler(RecordNotFoundException.class)
	public void updateUser(@RequestBody SignUp updateUser) {
		signUpService.updateUser(updateUser);
	}

	@GetMapping("/searchUser/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> searchUserByID(@PathVariable("id") Long userId) {

		return signUpService.findUserById(userId);
	}

	@DeleteMapping("/deleteUser/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") Long userId) {

		signUpService.deleteUser(userId);
	}
}