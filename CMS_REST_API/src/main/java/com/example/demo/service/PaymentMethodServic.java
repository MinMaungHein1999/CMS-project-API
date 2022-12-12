package com.example.demo.service;



import java.util.List;
import com.example.demo.entity.PaymentMethod;
import com.example.demo.entity.PurchaseHistory;

public interface PaymentMethodServic {
	List<PaymentMethod> getAllCustomers();
	
	PaymentMethod savePaymentMethod(PaymentMethod paymentMethod);
	
	PaymentMethod getPaymentMethodById(Long id);
	
	PaymentMethod updatePaymentMethod(PaymentMethod paymentMethod);
	
	void deletePaymentMethodById(Long id);
	
    void savePurchesHistoryAndPaymentMethod(PaymentMethod paymentMethod,PurchaseHistory purchaseHistory);
}
