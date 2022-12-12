package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Evoucher;

public interface EvoucherRepository extends JpaRepository<Evoucher, Long>{

}
