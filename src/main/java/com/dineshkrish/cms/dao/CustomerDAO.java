package com.dineshkrish.cms.dao;

import com.dineshkrish.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
}
