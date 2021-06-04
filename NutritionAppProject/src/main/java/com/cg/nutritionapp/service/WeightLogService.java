package com.cg.nutritionapp.service;

import java.util.List;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.exceptions.WeightLogException;
import com.cg.nutritionapp.model.WeightLog;

public interface WeightLogService {

	public WeightLog addWeightLog(WeightLog weightLog) throws WeightLogException;

	public WeightLog updateWeightLog(WeightLog weightLog) throws RecordNotFoundException;

	public List<WeightLog> displayAllWeightLog();

	public WeightLog searchWeightLogById(WeightLog weightLog) throws RecordNotFoundException;
	public WeightLog deleteWeightLog(WeightLog weightLog) throws RecordNotFoundException;
 public void setDetails(WeightLog weightLog);
}