package com.hampcode.service;

import java.util.List;
import java.util.Optional;

import com.hampcode.model.entity.Customer;

public interface CustomerService {

	Customer saveOrUpdate(Customer customer);

	List<Customer> getAll() throws Exception;

	Optional<Customer> getById(Long id);

}
