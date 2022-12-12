package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.PurchaseHistory;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long>{
	PurchaseHistory findByPromoCode(String promoCode);
}
