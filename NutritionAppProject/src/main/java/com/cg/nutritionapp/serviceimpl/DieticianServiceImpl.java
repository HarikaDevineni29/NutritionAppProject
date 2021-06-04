package com.cg.nutritionapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.exceptions.UserException;
import com.cg.nutritionapp.model.Dietician;
import com.cg.nutritionapp.repository.DieticianRepository;
import com.cg.nutritionapp.service.DieticianService;

@Service
public class DieticianServiceImpl implements DieticianService{
	@Autowired
	DieticianRepository dieticianRepository;
	
	@Override
	
	public Dietician createDieticianDetails(Dietician dietician) throws UserException{
		// TODO Auto-generated method stub
		//validateUser(dietician);
		Optional<Dietician> findDieticianById = dieticianRepository.findById(dietician.getId());
			if (!findDieticianById.isPresent()) {
				return dieticianRepository.save(dietician);
				
			} else
				throw new UserException(
						"User with Id: " + dietician.getId() + " already exists!!");
		} 
	

	@Override
	public Dietician updateDietician(Dietician dietician) {
		// TODO Auto-generated method stub
		//validateUser(signUp);
		Optional<Dietician> findDieticianById = dieticianRepository.findById(dietician.getId());
		if (findDieticianById.isPresent()) {
			dieticianRepository.save(dietician);
		} else
			throw new RecordNotFoundException(
					"User with Id: " + dietician.getId() + " not exists!!");
		return dietician;
	}

	//@Override
	public String deleteDietician(Dietician dietician) {
		// TODO Auto-generated method stub
		Optional<Dietician> findDieticianById = dieticianRepository.findById(dietician.getId());
		if (findDieticianById.isPresent()) {
			dieticianRepository.deleteById(dietician.getId());
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}
	public Dietician displayAllDietician(Dietician dietician) {
		Optional<Dietician> findDieticianById =  dieticianRepository.findById(dietician.getId());
		if(findDieticianById.isPresent()) {
			return findDieticianById.get();
		}else {
			throw new RecordNotFoundException(" User doesn't exist with Id : " +dietician.getId());
		}
	
	}
	public List<Dietician> getAllDieticians() {
		// TODO Auto-generated method stub
		List<Dietician> dietician = new ArrayList<Dietician>();  
		dieticianRepository.findAll().forEach(dietician1 -> dietician.add(dietician1));  
		return dietician;  
	}	


}
