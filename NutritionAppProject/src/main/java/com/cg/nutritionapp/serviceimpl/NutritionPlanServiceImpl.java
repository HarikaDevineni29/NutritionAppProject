package com.cg.nutritionapp.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nutritionapp.exceptions.NutritionPlanException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.DietPlan;
import com.cg.nutritionapp.model.NutritionPlan;
import com.cg.nutritionapp.model.Payment;
import com.cg.nutritionapp.service.NutritionPlanService;
import com.cg.nutritionapp.repository.NutritionPlanRepository;

@Service
public class NutritionPlanServiceImpl implements NutritionPlanService{
	@Autowired
	NutritionPlanRepository nutritionPlanRepository;
	
	@Override
	public NutritionPlan addPlan(NutritionPlan nutritionPlan) throws NutritionPlanException{
		// TODO Auto-generated method stub
		setnutritionplanDetails( nutritionPlan);
		Optional<NutritionPlan> findUserById = nutritionPlanRepository.findById(nutritionPlan.getPlanId());
			if (!findUserById.isPresent()) {
				return nutritionPlanRepository.save(nutritionPlan);
				
			} else
				throw new NutritionPlanException("User with Id: " + nutritionPlan.getPlanId() + " already exists!!");
		} 

	
	/**public List<NutritionPlan> displayAllPlans() {
		// TODO Auto-generated method stub
		for (NutritionPlan nutritionPlan:(List< NutritionPlan>) NutritionPlanRepository.findAll()) {
			System.out.println(nutritionPlan);
		}
		
		return (List< NutritionPlan>) NutritionPlanRepository.findAll();
	}*/
	

	@Override
	public String deletePlan(NutritionPlan nutritionPlan) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		setnutritionplanDetails( nutritionPlan);
		Optional<NutritionPlan> findUserById = nutritionPlanRepository.findById(nutritionPlan.getPlanId());
		if (findUserById.isPresent()) {
			nutritionPlanRepository.deleteById(nutritionPlan.getPlanId());
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}
	@Override
	public NutritionPlan getPlan(NutritionPlan nutritionPlan) throws RecordNotFoundException{
		Optional<NutritionPlan> findUserById =  nutritionPlanRepository.findById(nutritionPlan.getPlanId());
		if(findUserById.isPresent()) {
			return findUserById.get();
		}else {
			throw new RecordNotFoundException(" User doesn't exist with Id : " +nutritionPlan.getPlanId());
		} 

	
	
	}
	public List<NutritionPlan> getAllNutritionPlan() {
		// TODO Auto-generated method stub
		List<NutritionPlan> nutritionPlan = new ArrayList<NutritionPlan>();  
		nutritionPlanRepository.findAll().forEach(nutritionPlan1 -> nutritionPlan.add(nutritionPlan1));  
		return nutritionPlan;  
	}	
	
	public void setnutritionplanDetails(NutritionPlan nutritionplan){
		 LocalDate localdate =java.time.LocalDate.now();
		 nutritionplan.setCreated_At(localdate);

		}
	
	
}