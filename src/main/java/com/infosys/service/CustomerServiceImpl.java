package com.infosys.service;

import java.util.List;
import java.util.Optional;

import com.infosys.dto.Customer;
import com.infosys.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepo repo;
	@Override
	public Integer getCustomer(Integer id) {
		Optional<Customer>findByid=repo.findById(id);
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
	List<Customer> list=	repo.findAll();
		return list;
	}

	@Override
	public String upsertCustomer(Customer customer) {
		repo.save(customer);
		return null;
	}

	@Override
	public Customer deleteCustomer(Integer id) {
		repo.deleteById(id);
		
		return null;
	}
	
}