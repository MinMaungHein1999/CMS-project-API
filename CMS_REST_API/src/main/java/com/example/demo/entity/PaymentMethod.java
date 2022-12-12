package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="payment_methods")
public class PaymentMethod implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_method_id", unique = true, nullable = false)
	private Long paymentMethodId;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable = false, length = 10)
	private Date createdDate;
	
	public void setPaymentMethodId(Long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public Long getPaymentMethodId() {
		return this.paymentMethodId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCreatedDate() {
		return this.createdDate;
	}

}
