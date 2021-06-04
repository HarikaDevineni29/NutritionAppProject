package com.cg.nutritionapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.constants.AllConstants;
import com.cg.nutritionapp.constants.DietPlanConstants;
import com.cg.nutritionapp.exceptions.DietPlanException;
import com.cg.nutritionapp.model.DietPlan;
import com.cg.nutritionapp.repository.DietPlanRepository;
import com.cg.nutritionapp.service.DietPlanService;

@Service

public class DietPlanServiceImpl implements DietPlanService {
	@Autowired
	DietPlanRepository dietPlanRepository;
	
	@Override
	
	public DietPlan createDietPlanDetails(DietPlan dietPlan) throws DietPlanException{
		// TODO Auto-generated method stub
		setPlanDetails(dietPlan);
		//validateUser(dietPlan);
		validateDietPlan(dietPlan);
		Optional<DietPlan> findDietPlanById = dietPlanRepository.findById(dietPlan.getId());
			if (!findDietPlanById.isPresent()) {
				return dietPlanRepository.save(dietPlan);
				
			} else
				throw new DietPlanException(
						"Diet Plan with Id: " + dietPlan.getId() + " already exists!!");
		} 
	

	@Override
	public DietPlan updateDietPlan(DietPlan dietPlan) throws DietPlanException{
		// TODO Auto-generated method stub
		//validateUser(signUp);
		validateDietPlan(dietPlan);
		setPlanDetails(dietPlan);

		Optional<DietPlan> findDietPlanById = dietPlanRepository.findById(dietPlan.getId());
		if (findDietPlanById.isPresent()) {
			dietPlanRepository.save(dietPlan);
		} else
			throw new RecordNotFoundException(
					"Diet Plan with Id: " + dietPlan.getId() + " not exists!!");
		return dietPlan;
	}

	//@Override
	public String deleteDietPlan(DietPlan dietPlan) {
		// TODO Auto-generated method stub
		Optional<DietPlan> findDietPlanById = dietPlanRepository.findById(dietPlan.getId());
		if (findDietPlanById.isPresent()) {
			dietPlanRepository.deleteById(dietPlan.getId());
			return "Diet Plan Deleted!!";
		} else
			throw new RecordNotFoundException("Diet Plan not found for the entered UserID");
	}
	public DietPlan displayDietPlanById(DietPlan dietPlan) {
		Optional<DietPlan> findDietPlanById =  dietPlanRepository.findById(dietPlan.getId());
		if(findDietPlanById.isPresent()) {
			return findDietPlanById.get();
		}else {
			throw new RecordNotFoundException("Diet Plan doesn't exist with Id : " +dietPlan.getId());
		}
	
	}

	public void setPlanDetails(DietPlan dietPlan){
		if(dietPlan.getSlots().equalsIgnoreCase(DietPlanConstants.MORNING_MEAL)) {
			if(dietPlan.getFoodType().equalsIgnoreCase(DietPlanConstants.VEG) ) {
				dietPlan.setProteinRatio( DietPlanConstants.VEG_PROTEIN_RATIO);
				dietPlan.setFatRatio ( DietPlanConstants.VEG_FAT_RATIO);
				dietPlan.setCarbsRatio ( DietPlanConstants.VEG_CARBS_RATIO);
				dietPlan.setTotal ( DietPlanConstants.VEG_TOTAL);
			}
			else {
				dietPlan.setProteinRatio ( DietPlanConstants.NON_VEG_PROTEIN_RATIO);
				dietPlan.setFatRatio ( DietPlanConstants.NON_VEG_FAT_RATIO);
				dietPlan.setCarbsRatio ( DietPlanConstants.NON_VEG_CARBS_RATIO);
				dietPlan.setTotal (DietPlanConstants.NON_VEG_TOTAL);
			}
		}
		else if(dietPlan.getSlots().equalsIgnoreCase(DietPlanConstants.EVENING_MEAL)) {
			if(dietPlan.getFoodType().equalsIgnoreCase(DietPlanConstants.VEG)) {
				dietPlan.setProteinRatio ( DietPlanConstants.VEG_PROTEIN_RATIO);
				dietPlan.setFatRatio (DietPlanConstants.VEG_FAT_RATIO);
				dietPlan.setCarbsRatio ( DietPlanConstants.VEG_CARBS_RATIO);
				dietPlan.setTotal ( DietPlanConstants.VEG_TOTAL);
			}
			else
			{
				dietPlan.setProteinRatio( DietPlanConstants.NON_VEG_PROTEIN_RATIO);
				dietPlan.setFatRatio ( DietPlanConstants.NON_VEG_FAT_RATIO);
				dietPlan.setCarbsRatio ( DietPlanConstants.NON_VEG_CARBS_RATIO);
				dietPlan.setTotal ( DietPlanConstants.NON_VEG_TOTAL);
			}
	}
	}
	public List<DietPlan> getAllDietPlans() {
		// TODO Auto-generated method stub
		List<DietPlan> dietPlan = new ArrayList<DietPlan>();  
		dietPlanRepository.findAll().forEach(dietPlan1 -> dietPlan.add(dietPlan1));  
		return dietPlan;  
	}	
	
	public void validateDietPlan(DietPlan dietplan) throws DietPlanException {
		if (!dietplan.getSlots().matches("morning meal") && !dietplan.getSlots().matches("evening meal")) {
			throw new DietPlanException(AllConstants.SLOT_INVALID);
		}
		if (!dietplan.getFoodType().matches("veg") && !dietplan.getFoodType().matches("non veg")) {
			throw new DietPlanException(AllConstants.FOODTYPE_INVALID);
		}
	}
}

