package com.cg.nutritionapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.nutritionapp.model.WeightLog;

public interface WeightLogRepository extends JpaRepository<WeightLog, Integer>{

}