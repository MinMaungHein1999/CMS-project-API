package com.example.demo.service;



import java.util.List;
import com.example.demo.entity.PurchaseHistory;
import com.example.demo.form.PurchaseRegisterForm;
public interface PurchaseHistoryService {
	List<PurchaseHistory> getAllPurchaseHistorys();
	
	PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
	
	PurchaseHistory getPurchaseHistoryById(Long id);
	
	PurchaseHistory updatePurchaseHistory(PurchaseHistory purchaseHistory);
	
	void deletePurchaseHistoryById(Long id);
	
	public PurchaseHistory savePurchesHistoryAndCustomer(PurchaseRegisterForm purchaseRegisterForm);
}
