package com.example.demo.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Model class of purchase_history.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table(name = "purchase_histories", catalog = "sms")
public class PurchaseHistory implements Serializable {

	/** purchase_id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purchase_id", unique = true, nullable = false)
	private Long purchaseId;

	/** promo_code. */
	@Column(name="promo_code",nullable=true)
	private String promoCode;

	/** order_amount. */
	@Column(name="order_amount",nullable=false)
	private Double orderAmount;

	/** created_date. */
	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable = false, length = 10)
	private Date createdDate;

	/** Customer. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	/** evoucher. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "evoucher_id", nullable = false)
	private Evoucher evoucher;

	/** payment_method. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "payment_method_id", nullable = false)
	private PaymentMethod paymentMethod;

	/**
	 * Constructor.
	 */
	public PurchaseHistory() {
	}


	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Long getPurchaseId() {
		return this.purchaseId;
	}


	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}


	public String getPromoCode() {
		return this.promoCode;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}


	public Double getOrderAmount() {
		return this.orderAmount;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Customer getCustomer() {
		return this.customer;
	}

	public void setEvoucher(Evoucher evoucher) {
		this.evoucher = evoucher;
	}


	public Evoucher getEvoucher() {
		return this.evoucher;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	

}