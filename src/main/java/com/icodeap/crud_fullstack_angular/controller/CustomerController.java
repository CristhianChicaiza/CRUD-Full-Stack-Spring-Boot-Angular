package com.icodeap.crud_fullstack_angular.controller;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import com.icodeap.crud_fullstack_angular.entity.Nuevo;
import com.icodeap.crud_fullstack_angular.service.CustomerService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//http://localhost:8080/api/customers
@RequestMapping ("/api/customers")
public class CustomerController {

    private  final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //localhost:8080/create
    @PostMapping ("/create")
    public Customer save(@RequestBody Customer customer){

        return customerService.save(customer);
    }

    //localhost:8080
    @GetMapping
    public List<Customer> findAll (){
        return customerService.findAll();
    }

    @GetMapping ("/{id}")
    public Customer findById(@PathVariable("id") Integer id){
        return customerService.findById(id);
    }

    @DeleteMapping ("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    @PutMapping ("/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());
        Customer customer1=new Customer(customerDb.getId(),customerDb.getFirstname(),
                customer.getLastname(),customer.getEmail());

        /*customer1.setId(customerDb.getId());
        customer1.setFirstname(customerDb.getFirstname());

        customer1.setLastname(customer.getLastname());
        customer1.setEmail(customer.getEmail());*/
        /*customerDb.setFirstname(customer.getFirstname());
        customerDb.setLastname(customer.getLastname());
        customerDb.setEmail(customer.getEmail());*/
        return customerService.update(customer1);
    }

}




















