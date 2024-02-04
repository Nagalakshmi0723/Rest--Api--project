package com.infosys.service;

import java.util.List;


import com.infosys.dto.Customer;

public interface CustomerService {
	
	public Integer getCustomer(Integer id);
	public List<Customer> getAllCustomers();
	public String upsertCustomer(Customer customer);
	public Customer deleteCustomer(Integer id);

}
