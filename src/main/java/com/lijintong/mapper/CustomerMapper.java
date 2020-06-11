package com.lijintong.mapper;

import com.lijintong.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerMapper {

    List<Customer> queryCustomerList();

    Customer queryCustomerById(int id);

    int addCustomer(Customer customer);

    int updateCustomer(Customer customer);

    int deleteCustomer(int id);
}
