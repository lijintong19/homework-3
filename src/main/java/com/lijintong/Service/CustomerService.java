package com.lijintong.Service;

import com.lijintong.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> queryCustomerList();

    int addCustomer(Customer customer);

    Customer queryCustomerById(int id);

    int updateCustomer(Customer customer);

    int deleteCustomer(int id);
}
