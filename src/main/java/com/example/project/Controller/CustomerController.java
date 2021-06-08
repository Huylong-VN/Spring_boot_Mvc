package com.example.project.Controller;

import com.example.project.Service.CustomerService;
import com.example.project.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController{
    @Autowired
    private CustomerService customerService;
    @GetMapping(value = "/Customer")
    public List<Customer> getAll(){
       return customerService.getAll();
    }
}
