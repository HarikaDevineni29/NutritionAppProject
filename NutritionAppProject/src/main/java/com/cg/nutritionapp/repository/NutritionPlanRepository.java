
	package com.cg.nutritionapp.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.cg.nutritionapp.model.NutritionPlan;


	@Repository
	public interface NutritionPlanRepository extends JpaRepository<NutritionPlan, Integer>{

	}


