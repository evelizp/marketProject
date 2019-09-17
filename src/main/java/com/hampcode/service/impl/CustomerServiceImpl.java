package com.hampcode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hampcode.model.entity.Customer;
import com.hampcode.model.repository.CustomerRepository;
import com.hampcode.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveOrUpdate(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAll() throws Exception {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getById(Long id) {
		return customerRepository.findById(id);
	}

}
