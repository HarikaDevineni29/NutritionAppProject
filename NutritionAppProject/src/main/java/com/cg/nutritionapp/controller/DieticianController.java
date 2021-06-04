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

import com.cg.nutritionapp.exceptions.UserException;
import com.cg.nutritionapp.model.Dietician;
import com.cg.nutritionapp.serviceimpl.DieticianServiceImpl;

@RestController
public class DieticianController {
	@Autowired
	DieticianServiceImpl dieticianService;

	@PostMapping("/createDieticianDetails")
	public Dietician createDieticianDetails(@RequestBody Dietician newDietician) throws UserException{
		return dieticianService.createDieticianDetails(newDietician);
	}
	

	@PutMapping("/updateDietician/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public Dietician updateDietician(@RequestBody Dietician updateDietician) {
		return dieticianService.updateDietician(updateDietician);
	}

	@GetMapping("/displayAllDietician/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public Dietician displayAllDietician(@PathVariable("id") Dietician dietician) {

		return dieticianService.displayAllDietician(dietician);
	}

	@DeleteMapping("/deleteDietician/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public String deleteDietician(@PathVariable("id") Dietician dietician) {
		//@RequestBody Dietician dietician

		return dieticianService.deleteDietician(dietician);
	}
	@GetMapping("/DisplayAllDieticians")  
	private List<Dietician> getAllDieticians()   
	{  
	return dieticianService.getAllDieticians();  
	}  

}
