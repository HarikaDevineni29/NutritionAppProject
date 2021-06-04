package com.cg.nutritionapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Dietician {
	@Id
	//@NotNull
	@Column(name="") @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="", nullable = true)
	private String highestdegree;
	@Column(name="", nullable = true)
	private Integer experience;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHighestdegree() {
		return highestdegree;
	}
	public void setHighestdegree(String highestdegree) {
		this.highestdegree = highestdegree;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Dietician(int id, String highestdegree, Integer experience) {
		super();
		this.id = id;
		this.highestdegree = highestdegree;
		this.experience = experience;
	}
    public Dietician(){
    	
    }
}
