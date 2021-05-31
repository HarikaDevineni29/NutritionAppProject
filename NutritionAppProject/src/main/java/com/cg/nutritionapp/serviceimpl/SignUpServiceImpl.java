package com.cg.nutritionapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.nutritionapp.exceptions.RecordAlreadyPresentException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.repository.SignUpRepository;
import com.cg.nutritionapp.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService{
	@Autowired
	SignUpRepository signUpDAO;
	
	//@Override
	public ResponseEntity<?> createUser(SignUp newSignUp) {
		// TODO Auto-generated method stub
		Optional<SignUp> findUserById = signUpDAO.findById(newSignUp.getId());
		try {
			if (!findUserById.isPresent()) {
				signUpDAO.save(newSignUp);
				return new ResponseEntity<SignUp>(newSignUp, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"User with Id: " + newSignUp.getId() + " already exists!!");
		} catch (RecordAlreadyPresentException e) {

			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	//@Override
	public SignUp updateUser(SignUp updateSignUp) {
		// TODO Auto-generated method stub
		Optional<SignUp> findUserById = signUpDAO.findById(updateSignUp.getId());
		if (findUserById.isPresent()) {
			signUpDAO.save(updateSignUp);
		} else
			throw new RecordNotFoundException(
					"User with Id: " + updateSignUp.getId() + " not exists!!");
		return updateSignUp;
	}

	//@Override
	public String deleteUser(Long userId) {
		// TODO Auto-generated method stub
		Optional<SignUp> findUserById = signUpDAO.findById(userId);
		if (findUserById.isPresent()) {
			signUpDAO.deleteById(userId);
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}

	//@Override
	public List<SignUp> displayAllUser() {
		// TODO Auto-generated method stub
		for (SignUp signup:(List<SignUp>) signUpDAO.findAll()) {
			System.out.println(signup);
		}
		
		return (List<SignUp>) signUpDAO.findAll();
	}

	//@Override
	public ResponseEntity<?> findUserById(Long userId) {
		// TODO Auto-generated method stub
		Optional<SignUp> findById = signUpDAO.findById(userId);
		try {
			if (findById.isPresent()) {
				SignUp findSignUp = findById.get();
				return new ResponseEntity<SignUp>(findSignUp, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("No record found with ID " + userId);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
