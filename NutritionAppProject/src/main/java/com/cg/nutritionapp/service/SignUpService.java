package com.cg.nutritionapp.service;

import org.springframework.http.ResponseEntity;

import com.cg.nutritionapp.model.SignUp;

public interface SignUpService {
	public ResponseEntity<?> createUser(SignUp newUser);

	public SignUp updateUser(SignUp newUser);

	public String deleteUser(Long userId);

	public Iterable<SignUp> displayAllUser();

	public ResponseEntity<?> findUserById(Long userId);
}
