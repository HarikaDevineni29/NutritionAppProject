package com.cg.nutritionapp.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cg.nutritionapp.controller.Weight;
import com.cg.nutritionapp.exceptions.RecordAlreadyPresentException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.exceptions.WeightLogException;
import com.cg.nutritionapp.model.Payment;
import com.cg.nutritionapp.model.WeightLog;

import com.cg.nutritionapp.repository.WeightLogRepository;
import com.cg.nutritionapp.service.WeightLogService;
@Service
public class WeightLogServiceImpl implements WeightLogService{
	@Autowired
	WeightLogRepository weightLogRepository;
	
	@Override
	public WeightLog addWeightLog(WeightLog weightLog) throws WeightLogException{
		// TODO Auto-generated method stub
		setDetails(weightLog);
		Optional<WeightLog> findWeightById = weightLogRepository.findById(weightLog.getId());
			if (!findWeightById.isPresent()) {
				return weightLogRepository.save(weightLog);
			} else
				throw new WeightLogException("Payment with Id: " +weightLog.getId() + " already exists!!");
		
	}

	@Override
	public WeightLog updateWeightLog(WeightLog weightLog) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		setDetails(weightLog);
		Optional<WeightLog> findWeightById = weightLogRepository.findById(weightLog.getId());
		if (findWeightById.isPresent()) {
			weightLogRepository.save(weightLog);
		} else
			throw new RecordNotFoundException("Payment with Id: " + weightLog.getId() + " not exists!!");
		return weightLog;
	}

	

	@Override
	public List<WeightLog> displayAllWeightLog() {
		// TODO Auto-generated method stub
		
		for (WeightLog weightLog:(List<WeightLog>) weightLogRepository.findAll()) {
			System.out.println(weightLog);
		}
		
		return (List<WeightLog>) weightLogRepository.findAll();
	}
	
	@Override
	public WeightLog deleteWeightLog(WeightLog weightLog) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		WeightLog weight = weightLog;
		Optional<WeightLog> findWeightById = weightLogRepository.findById(weightLog.getId());
		if (findWeightById.isPresent()) {
			weightLogRepository.deleteById(weightLog.getId());
			
		} else {
			throw new RecordNotFoundException("Weight with Id"+weightLog.getId()+"doesn't delete");
	}
		return weight;
	}

	@Override
	public WeightLog searchWeightLogById(WeightLog weightLog) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		Optional<WeightLog> findWeightById = weightLogRepository.findById(weightLog.getId());
		
			if (findWeightById.isPresent()) {
				return findWeightById.get();
				
			} else
				throw new RecordNotFoundException("No record found with ID " + weightLog);
		}

	public List<WeightLog> getAllWeights() {
		List<WeightLog>  weightLog = new ArrayList<WeightLog>();  
		weightLogRepository.findAll().forEach( weightLog1 ->  weightLog.add( weightLog1));  
		return weightLog;
	} 
	public void setDetails(WeightLog weightLog){
	 LocalDate localdate =java.time.LocalDate.now();
	 weightLog.setUpdated_At(localdate);

	}

}