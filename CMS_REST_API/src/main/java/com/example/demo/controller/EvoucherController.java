package com.example.demo.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Evoucher;
import com.example.demo.service.EvoucherServic;
@RestController
@RequestMapping("/api/evouchers")
public class EvoucherController {
	
	private EvoucherServic evoucherServic;

	public EvoucherController(EvoucherServic evoucherServic) {
		super();
		this.evoucherServic = evoucherServic;
	}
	
	
	@GetMapping
	public List<Evoucher> listEvouchers() {
		return evoucherServic.getAllEvouchers();
	}
	
	
	@PostMapping
	public Evoucher saveEvoucher(@RequestBody Evoucher evoucher) throws ParseException {
		evoucher.setCreatedDate(new Date());
		Date expDate=new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2023");  
		evoucher.setExpireDate(expDate);
		return evoucherServic.saveEvoucher(evoucher);
	}
	
	@GetMapping("/find/{id}")
	public Evoucher editCustomerForm(@PathVariable Long id, Model model) {
		return evoucherServic.getEvoucherById(id);	 
	}

	@PostMapping("/{id}")
	public Evoucher updateEvoucher(@PathVariable Long id,
			@RequestBody Evoucher evoucher,
			Model model) {
		Evoucher existingEvoucher = evoucherServic.getEvoucherById(id);
		existingEvoucher.setEvoucherId(id);
		existingEvoucher.setTitle(evoucher.getTitle());
		existingEvoucher.setAmount(evoucher.getAmount());
		existingEvoucher.setCreatedDate(new Date());
		existingEvoucher.setDescription(evoucher.getDescription());
		existingEvoucher.setImage(null);
		existingEvoucher.setQty(evoucher.getQty());
		
		return evoucherServic.updateEvoucher(existingEvoucher);	
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteEvoucher(@PathVariable Long id) {
		evoucherServic.deleteEvoucherById(id);
	}
	
}
