package com.example.demo.controller;







import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerServic;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	private CustomerServic customerServic;

	public CustomerController(CustomerServic customerServic) {
		super();
		this.customerServic = customerServic;
	}
	
	@GetMapping
	public List<Customer> listCustomers() {
		return customerServic.getAllCustomers();
	}
	
	
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		customer.setCreatedDate(new Date());
		return customerServic.saveCustomer(customer);
	}
	
	@GetMapping("/find/{id}")
	public Customer getCustomerForm(@PathVariable Long id) {
		return customerServic.getCustomerById(id);
	}

	@PostMapping("/{id}")
	public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer customer) {
		
		Customer existingCustomer = customerServic.getCustomerById(id);
		existingCustomer.setCustomerId(id);
		existingCustomer.setName(customer.getName());
		existingCustomer.setPhoneNo(customer.getPhoneNo());
	
		return customerServic.updateCustomer(existingCustomer);		
	}
	

	
}
