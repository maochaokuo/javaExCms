package com.dineshkrish.cms.service;

import com.dineshkrish.cms.dao.CustomerDAO;
import com.dineshkrish.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public Customer addCustomer(Customer customer){
        return customerDAO.save(customer);
    }
    public List<Customer> getCustomers(){
        return customerDAO.findAll();
    }
    public Customer getCustomer(int customerId){
        return customerDAO.findById(customerId).orElse(null);
    }
    public Customer updateCustomer(int customerId, Customer customer)
    {
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }
    public void deleteCustomer(int customerId){
        customerDAO.deleteById(customerId);
    }
}
