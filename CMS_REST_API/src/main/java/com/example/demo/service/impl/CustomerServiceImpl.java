package com.example.demo.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EvoucherRepository;
import com.example.demo.repository.PaymentMethodRepository;
import com.example.demo.repository.PurchaseHistoryRepository;
import com.example.demo.service.CustomerServic;

@Service
public class CustomerServiceImpl implements CustomerServic{
    private PaymentMethodRepository paymentMethodRepository;
	private CustomerRepository customerRepository;
	private EvoucherRepository evoucherRepository;
	private PurchaseHistoryRepository purchaseHistoryRepository;
	public CustomerServiceImpl(CustomerRepository customerRepository,
			                   PaymentMethodRepository paymentMethodRepository,
			                   EvoucherRepository evoucherRepository,
			                   PurchaseHistoryRepository purchaseHistoryRepository) {
		super();
		this.paymentMethodRepository=paymentMethodRepository;
		this.customerRepository = customerRepository;
		this.evoucherRepository=evoucherRepository;
		this.purchaseHistoryRepository=purchaseHistoryRepository;
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long id) {
		customerRepository.deleteById(id);	
	}


}
