package com.cg.nutritionapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.nutritionapp.model.SignUp;

@Repository
public interface SignUpRepository extends CrudRepository<SignUp, Long>{

}
