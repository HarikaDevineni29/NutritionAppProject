package com.cg.nutritionapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


import com.cg.nutritionapp.constants.AllConstants;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.exceptions.UserException;
import com.cg.nutritionapp.exceptions.ValidateUserException;
import com.cg.nutritionapp.repository.SignUpRepository;
import com.cg.nutritionapp.model.DietPlan;
import com.cg.nutritionapp.model.NutritionPlan;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService{
	@Autowired
	SignUpRepository signUpRepository;
	private SignUp signUp;
	@Override
	
	public SignUp addUser(SignUp signUp) throws UserException, ValidateUserException{
		// TODO Auto-generated method stub
		validateUser(signUp);
		Optional<SignUp> findUserById = signUpRepository.findById(signUp.getId());
			if (!findUserById.isPresent()) {
				return signUpRepository.save(signUp);
				
			} else
				throw new UserException(
						"User with Id: " + signUp.getId() + " already exists!!");
		} 
	

	@Override
	public SignUp updateUser(SignUp signUp) throws ValidateUserException {
		// TODO Auto-generated method stub
		validateUser(signUp);
		Optional<SignUp> findUserById = signUpRepository.findById(signUp.getId());
		if (findUserById.isPresent()) {
			signUpRepository.save(signUp);
		} else
			throw new RecordNotFoundException(
					"User with Id: " + signUp.getId() + " not exists!!");
		return signUp;
	}

	//@Override
	public String deleteUser(SignUp signUp) {
		// TODO Auto-generated method stub
		Optional<SignUp> findUserById = signUpRepository.findById(signUp.getId());
		if (findUserById.isPresent()) {
			signUpRepository.deleteById(signUp.getId());
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}
	@Override
	public SignUp getUser(SignUp signUp) {
		Optional<SignUp> findUserById =  signUpRepository.findById(signUp.getId());
		if(findUserById.isPresent()) {
			return findUserById.get();
		}else {
			throw new RecordNotFoundException(" User doesn't exist with Id : " +signUp.getId());
		} 

	
	
	}
	public boolean validateUser(SignUp signup) throws ValidateUserException {
		if (!signup.getUserName().matches(AllConstants.USERNAME_PATTERN)) {
			throw new ValidateUserException(AllConstants.USER_CANNOT_BE_EMPTY);
		}
		if (!signup.getPassword().matches(AllConstants.PASSWORD_PATTERN)) {
			throw new ValidateUserException(AllConstants.PASSWORD_NOT_STRONG);
		}
		if (!signup.getRole().matches("Customer") && !signup.getRole().matches("Dietician")) {
			throw new ValidateUserException(AllConstants.ROLE_INVALID);
		}
		if (!signup.getContact().matches(AllConstants.PHONENUMBER_PATTERN) ) {
			throw new ValidateUserException(AllConstants.INVALID_PHONENUMBER);
		}
		if (!signup.getEmail().matches(AllConstants.EMAIL_PATTERN) ) {
			throw new ValidateUserException(AllConstants.EMAIL_CANNOT_BE_EMPTY);
		}
		if (!signup.getGender().matches("Female") && !signup.getGender().matches("Male") && !signup.getGender().matches("Others") ) {
			throw new ValidateUserException(AllConstants.GENDER_INVALID);
		}
		return true;
	}
	public List<SignUp> getNutritionPlans(NutritionPlan nutritionPlan) {
		List<SignUp> plans = new ArrayList<>();
		if(signUp.getNutritionPlan().getPlanId() == nutritionPlan.getPlanId()) {
			plans.add(signUp);
		}
		return plans;
	}
	public List<SignUp> getDietPlans(DietPlan dietPlan) {
		List<SignUp> plans = new ArrayList<>();
		if(signUp.getDietplan().getUserId() == dietPlan.getUserId()) {
			plans.add(signUp);
		}
		return plans;
	}


	public List<SignUp> getAllUsers() {
		// TODO Auto-generated method stub
		List<SignUp>  signUp = new ArrayList<SignUp>();  
		 signUpRepository.findAll().forEach( signUp1 ->  signUp.add( signUp1));  
		return signUp;
		
	}
	

	
	
}