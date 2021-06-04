package com.cg.nutritionapp.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nutritionapp.exceptions.PaymentException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.Payment;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.model.WeightLog;
import com.cg.nutritionapp.repository.PaymentRepository;
import com.cg.nutritionapp.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public Payment addPayment(Payment payment) throws PaymentException{
		// TODO Auto-generated method stub
		setPaymentDetails(payment);
		
		Optional<Payment> findPaymentById = paymentRepository.findById(payment.getPaymentId());
			if (!findPaymentById.isPresent()) {
				return paymentRepository.save(payment);
			} else
				throw new PaymentException("Payment with Id: " + payment.getPaymentId() + " already exists!!");
		
	}

	@Override
	public Payment updatePayment(Payment payment) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		setPaymentDetails(payment);
		Optional<Payment> findPaymentById = paymentRepository.findById(payment.getPaymentId());
		if (findPaymentById.isPresent()) {
			paymentRepository.save(payment);
		} else
			throw new RecordNotFoundException("Payment with Id: " + payment.getPaymentId() + " not exists!!");
		return payment;
	}

	

	@Override
	public List<Payment> displayAllPayments() {
		// TODO Auto-generated method stub
		for (Payment payment:(List<Payment>) paymentRepository.findAll()) {
			System.out.println(payment);
		}
		
		return (List<Payment>) paymentRepository.findAll();
	}

	@Override
	public Payment searchPaymentById(Payment payment) throws RecordNotFoundException{
		// TODO Auto-generated method stub
		Optional<Payment> findPaymentById = paymentRepository.findById(payment.getPaymentId());
		
			if (findPaymentById.isPresent()) {
				return findPaymentById.get();
				
			} else
				throw new RecordNotFoundException("No record found with ID " + payment);
		}

	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		List<Payment>  payment = new ArrayList<Payment>();  
		paymentRepository.findAll().forEach( payment1 ->  payment.add( payment1));  
		return payment;
	} 
	public void setPaymentDetails(Payment payment){
	 LocalDate localdate =java.time.LocalDate.now();
		 payment.setPaidDate(localdate);
		 Double paidAmount = payment.getAmount()*(1-payment.getDiscount()) ;
		 payment.setTotalPrice( paidAmount);
		 

	}

	}