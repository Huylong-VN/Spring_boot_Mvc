package com.example.project.Service;

import com.example.project.Business.CustomerBus;
import com.example.project.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements IcommonService<Customer>{
    private CustomerBus customerBus;
    public CustomerService(){customerBus=new CustomerBus();}

    @Override
    public List<Customer> getAll() {
        return customerBus.getAll();
    }

    @Override
    public Customer getByID(String id) {
        return null;
    }

    @Override
    public List<Customer> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(Customer intro) {

    }

    @Override
    public void edit(Customer info) {

    }

    @Override
    public void delete(Customer id) {

    }
}
