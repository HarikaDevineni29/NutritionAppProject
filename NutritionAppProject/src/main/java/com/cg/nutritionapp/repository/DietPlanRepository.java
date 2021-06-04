package com.cg.nutritionapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.nutritionapp.model.DietPlan;

public interface DietPlanRepository  extends CrudRepository<DietPlan,Integer> {

}
