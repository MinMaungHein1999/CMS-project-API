package com.example.demo.service.impl;


import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Evoucher;
import com.example.demo.repository.EvoucherRepository;
import com.example.demo.service.EvoucherServic;


@Service
public class EvoucherServiceImpl implements EvoucherServic{

	private EvoucherRepository evoucherRepository;
	
	public EvoucherServiceImpl(EvoucherRepository evoucherRepository) {
		super();
		this.evoucherRepository = evoucherRepository;
	}

	@Override
	public List<Evoucher> getAllEvouchers() {
		return evoucherRepository.findAll();
	}

	@Override
	public Evoucher saveEvoucher(Evoucher evoucher) {
		return evoucherRepository.save(evoucher);
	}

	@Override
	public Evoucher getEvoucherById(Long id) {
		return evoucherRepository.findById(id).get();
	}

	@Override
	public Evoucher updateEvoucher(Evoucher evoucher) {
		return evoucherRepository.save(evoucher);
	}

	@Override
	public void deleteEvoucherById(Long id) {
		evoucherRepository.deleteById(id);	
	}
	
}
