package com.cg.nutritionapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.nutritionapp.exceptions.PaymentException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.Payment;
import com.cg.nutritionapp.model.WeightLog;


public interface PaymentService {
	public Payment addPayment(Payment payment) throws PaymentException;

	public Payment updatePayment(Payment payment) throws RecordNotFoundException;

	public List<Payment> displayAllPayments();

	public Payment searchPaymentById(Payment payment) throws RecordNotFoundException;
	public void setPaymentDetails(Payment payment);

}