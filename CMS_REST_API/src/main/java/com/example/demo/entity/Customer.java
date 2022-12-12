package com.example.demo.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="customers")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", unique = true, nullable = false)
	private Long customerId;

	
	@Column(name="name",nullable=false)
	private String name;

	
	@Column(name="phone_no",nullable=false)
	private String phoneNo;

	
	@Column(name="max_voucher_limit",nullable=false)
	private int maxVoucherLimit;


	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable = false, length = 10)
	private Date createdDate;

	
	public String getName() {
		return name;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getMaxVoucherLimit() {
		return maxVoucherLimit;
	}

	public void setMaxVoucherLimit(Integer maxVoucherLimit) {
		this.maxVoucherLimit = maxVoucherLimit;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	


	
	

}
