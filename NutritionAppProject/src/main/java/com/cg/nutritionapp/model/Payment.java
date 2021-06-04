package com.cg.nutritionapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	/**
	 * This field represent id of payment
	 */
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int paymentId;
	/**
	 * This field represent id of user for which payment is happening 
	 */
	private Long userId;
	/**
	 * This field represent id of plan which user chose
	 */
	private Long planId;
	/**
	 * This field represent amount of payment
	 */
	public Double amount;
	/**
	 * This field represent discount amount for payment
	 * never be negative
	 * In case if user enter negative payment, he should throw with PaymentException
	 */
	private Double discount;
	/**
	 * This field represent Date of payment
	 */
	public Double totalPrice;
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDate paidDate;
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public LocalDate getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}
	
	public Payment() {
		
	}
	public Payment(Long userId, Long planId, Double amount, Double discount, LocalDate paidDate, Double totalPrice) {
		super();

		this.userId = userId;
		this.planId = planId;
		this.amount = amount;
		this.discount = discount;
		this.paidDate = paidDate;
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", userId=" + userId + ", planId=" + planId + ", amount=" + amount
				+ ", discount=" + discount + ", paidDate=" + paidDate + "]";
	}
}