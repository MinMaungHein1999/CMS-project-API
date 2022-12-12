package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PurchaseHistory;
import com.example.demo.form.PurchaseRegisterForm;
import com.example.demo.service.PurchaseHistoryService;

@RestController
@RequestMapping("/api/purchaseHistories")
public class PurchaseController {
	
	private PurchaseHistoryService purchaseHistoryService;

	public PurchaseController(PurchaseHistoryService purchaseHistoryService) {
		super();
		this.purchaseHistoryService=purchaseHistoryService;
	}
	
	@GetMapping
	public List<PurchaseHistory> listPurchaseHistorys() {
		return purchaseHistoryService.getAllPurchaseHistorys();
	}
	
	@PostMapping
	public PurchaseHistory savePurchaseHistory(@RequestBody PurchaseRegisterForm purchaseRegisterForm) {
		return purchaseHistoryService.savePurchesHistoryAndCustomer(purchaseRegisterForm);
	}
	

	@PutMapping("/{id}") 
	public PurchaseHistory updatePurchaseHistory(@PathVariable Long id,
			@RequestBody PurchaseHistory purchaseHistory) {
	
		PurchaseHistory existingpurchaseHistory=purchaseHistoryService.getPurchaseHistoryById(id);
		existingpurchaseHistory.setOrderAmount(purchaseHistory.getOrderAmount());
		existingpurchaseHistory.setPromoCode(purchaseHistory.getPromoCode());

		return purchaseHistoryService.updatePurchaseHistory(existingpurchaseHistory);		
	}
	
	
}
