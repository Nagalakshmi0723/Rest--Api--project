package com.infosys.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Serializable>{
	
	
	

}
