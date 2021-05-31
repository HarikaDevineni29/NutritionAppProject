package com.cg.nutritionapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.nutritionapp.model")
@ComponentScan("com.cg.nutritionapp.repository")
@ComponentScan("com.cg.nutritionapp.service")
@ComponentScan("com.cg.nutritionapp.controller")
public class NutritionAppProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutritionAppProjectApplication.class, args);
	}

}
