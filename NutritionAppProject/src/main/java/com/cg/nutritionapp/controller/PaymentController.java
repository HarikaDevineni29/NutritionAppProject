package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nutritionapp.exceptions.PaymentException;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.model.Payment;
import com.cg.nutritionapp.model.SignUp;
import com.cg.nutritionapp.service.PaymentService;
import com.cg.nutritionapp.serviceimpl.PaymentServiceImpl;


@RestController
public class PaymentController {
	
	
		@Autowired
		PaymentServiceImpl paymentService;

		@PostMapping("/createPayment")
		public Payment addPayment(@RequestBody Payment payment) throws PaymentException {
			return paymentService.addPayment(payment);
		}
		
	
		@GetMapping("/findAllPayments")
		public List<Payment> displayAllPayments() {
			return paymentService.displayAllPayments();
		}

		@PutMapping("/updatePayment")
		public Payment updatePayment(@RequestBody Payment payment) throws RecordNotFoundException{
			return paymentService.updatePayment(payment);
		}

		@GetMapping("/searchPayment/{paymentId}")
		public Payment searchPaymentByID(@PathVariable("paymentId") Payment payment) throws RecordNotFoundException{
			return paymentService.searchPaymentById(payment);
		}
		@GetMapping("/showAllPayments")  
		private List<Payment> getAllPayments()   
		{  
		return paymentService.getAllPayments();  
		}  

		
	}