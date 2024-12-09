package com.icodeap.crud_fullstack_angular.service;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface CustomerService {

    Customer save (Customer customer);
    List<Customer> findAll();
    Customer findById (Integer id);
    void deleteById(Integer id);
    Customer update(Customer customer);

}












