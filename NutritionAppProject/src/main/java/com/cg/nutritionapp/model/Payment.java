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
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name="payment_id")
	private Long paymentId;
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
	private Double amount;
	/**
	 * This field represent discount amount for payment
	 * never be negative
	 * In case if user enter negative payment, he should throw with PaymentException
	 */
	private Double discount;
	/**
	 * This field represent Date of payment
	 */
	private LocalDate paidDate;
	private Long getPaymentId() {
		return paymentId;
	}
	private void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	private Long getUserId() {
		return userId;
	}
	private void setUserId(Long userId) {
		this.userId = userId;
	}
	private Long getPlanId() {
		return planId;
	}
	private void setPlanId(Long planId) {
		this.planId = planId;
	}
	private Double getAmount() {
		return amount;
	}
	private void setAmount(Double amount) {
		this.amount = amount;
	}
	private Double getDiscount() {
		return discount;
	}
	private void setDiscount(Double discount) {
		this.discount = discount;
	}
	private LocalDate getPaidDate() {
		return paidDate;
	}
	private void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}
	
	public Payment() {
		
	}
	public Payment(Long paymentId, Long userId, Long planId, Double amount, Double discount, LocalDate paidDate) {
		super();
		this.paymentId = paymentId;
		this.userId = userId;
		this.planId = planId;
		this.amount = amount;
		this.discount = discount;
		this.paidDate = paidDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", userId=" + userId + ", planId=" + planId + ", amount=" + amount
				+ ", discount=" + discount + ", paidDate=" + paidDate + "]";
	}
}