package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.exceptions.WeightLogException;
import com.cg.nutritionapp.model.Payment;
import com.cg.nutritionapp.model.WeightLog;

import com.cg.nutritionapp.service.WeightLogService;
import com.cg.nutritionapp.serviceimpl.WeightLogServiceImpl;

@RestController
public class WeightLogController {
	@Autowired
	WeightLogServiceImpl weightLogService;

	@PostMapping("/createWeight")
	public WeightLog addWeightLog(@RequestBody WeightLog weightLog) throws WeightLogException {
		return weightLogService.addWeightLog(weightLog);
	}
	
	@GetMapping("/readAllWeights")
	public List<WeightLog> displayAllWeightLog() {
		return weightLogService.displayAllWeightLog();
	}

	@PutMapping("/updateWeight")
	public WeightLog updateWeightLog(@RequestBody WeightLog weightLog) throws RecordNotFoundException{
		return weightLogService.updateWeightLog(weightLog);
	}
	
	@GetMapping("/searchWeight/{id}")
	public WeightLog searchWeightLogById(@PathVariable("id") WeightLog weightLog) throws RecordNotFoundException{
		return weightLogService.searchWeightLogById(weightLog);
	}

	@DeleteMapping("/deleteWeight/{id}")
	public WeightLog deleteWeightLog(@PathVariable("id") WeightLog weightLog ) throws RecordNotFoundException{

		return weightLogService.deleteWeightLog(weightLog);
	}
	@GetMapping("/showAllWeightss")  
	private List<WeightLog> getAllWeights()   
	{  
	return weightLogService.getAllWeights();  
	}  



}