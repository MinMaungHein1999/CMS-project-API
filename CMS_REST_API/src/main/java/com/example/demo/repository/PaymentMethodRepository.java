package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PaymentMethod;
@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long>{
	PaymentMethod findByName(String name);
}
