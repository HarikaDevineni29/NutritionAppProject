package com.cg.nutritionapp.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.nutritionapp.dao.SignUpDAO;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService{
	@Autowired
	SignUpDAO signUpDao;
	
	//@Override
	public ResponseEntity<?> createUser(SignUp newSignUp) {
		// TODO Auto-generated method stub
		Optional<SignUp> findUserById = signUpDao.findById(newSignUp.getSignUpId());
		try {
			if (!findUserById.isPresent()) {
				signUpDao.save(newSignUp);
				return new ResponseEntity<SignUp>(newSignUp, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"User with Id: " + newSignUp.getSignUpId() + " already exists!!");
		} catch (RecordAlreadyPresentException e) {

			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	//@Override
	public SignUp updateUser(SignUp updateSignUp) {
		// TODO Auto-generated method stub
		Optional<SignUp> findUserById = signUpDAO.findById(updateSignUp.getSignUpId());
		if (findUserById.isPresent()) {
			userDao.save(updateUser);
		} else
			throw new RecordNotFoundException(
					"User with Id: " + updateUser.getUserId() + " not exists!!");
		return updateUser;
	}

	//@Override
	public String deleteUser(BigInteger UserId) {
		// TODO Auto-generated method stub
		Optional<Users> findBookingById = userDao.findById(UserId);
		if (findBookingById.isPresent()) {
			userDao.deleteById(UserId);
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}

	//@Override
	public Iterable<Users> displayAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	//@Override
	public ResponseEntity<?> findUserById(BigInteger userId) {
		// TODO Auto-generated method stub
		Optional<Users> findById = userDao.findById(userId);
		try {
			if (findById.isPresent()) {
				Users findUser = findById.get();
				return new ResponseEntity<Users>(findUser, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("No record found with ID " + userId);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
