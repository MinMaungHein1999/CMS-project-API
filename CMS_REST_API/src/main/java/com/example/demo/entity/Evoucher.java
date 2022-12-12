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
@Table(name="evouchers")
public class Evoucher implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "evoucher_id", unique = true, nullable = false)
	private Long evoucherId;
	
	@Column(name="title",nullable=false)
	private String title;
	
	@Column(name="expire_date",nullable=false)
	private Date expireDate;
	
	@Column(name="image",nullable=true)
	private String image;
	
	@Column(name="amount",nullable=false)
	private Double amount;
	
	@Column(name="qty",nullable=false)
	private Integer qty;
	
	@Column(name="return_amount",nullable=false)
	private Double returnAmount;
	
	@Column(name="description",nullable=true)
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable = false, length = 10)
	private Date createdDate;
	
	
	public void setEvoucherId(Long evoucherId) {
		this.evoucherId = evoucherId;
	}
	public Long getEvoucherId() {
		return this.evoucherId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage() {
		return this.image;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getAmount() {
		return this.amount;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getQty() {
		return this.qty;
	}
	public void setReturnAmount(Double returnAmount) {
		this.returnAmount = returnAmount;
	}
	public Double getReturnAmount() {
		return this.returnAmount;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCreatedDate() {
		return this.createdDate;
	}
	
	

}
