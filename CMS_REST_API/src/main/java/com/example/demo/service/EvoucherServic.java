package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Evoucher;



public interface EvoucherServic {
	List<Evoucher> getAllEvouchers();
	
	Evoucher saveEvoucher(Evoucher customer);
	
	Evoucher getEvoucherById(Long id);
	
	Evoucher updateEvoucher(Evoucher customer);
	
	void deleteEvoucherById(Long id);
}
