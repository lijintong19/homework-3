package com.lijintong.Service;

import com.lijintong.mapper.CustomerMapper;
import com.lijintong.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> queryCustomerList() {
        List<Customer> customers = customerMapper.queryCustomerList();
        return customers;
    }

    @Override
    public int addCustomer(Customer customer) {
         return customerMapper.addCustomer(new Customer());
    }

    @Override
    public Customer queryCustomerById(int id) {
            return null;
    }

    @Override
    public int updateCustomer(Customer customer) {
        return 0;
    }

    @Override
    public int deleteCustomer(int id) {
        return 0;
    }
}
