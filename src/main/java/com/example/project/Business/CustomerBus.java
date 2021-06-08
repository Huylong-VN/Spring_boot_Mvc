package com.example.project.Business;


import com.example.project.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerBus extends BaseBus implements IBus<Customer>{


    @Override
    public List<Customer> getAll() {
        List<Customer> customers=new ArrayList<>();
        query="Select * from Customer";
        Connection connection=db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                ResultSet resultSet=preparedStatement.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    customers.add(initInfo.initCustomer(resultSet));
                }
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return customers;
    }

    @Override
    public Customer getSingleByID(String id) {
        return null;
    }

    @Override
    public List<Customer> getByKeyword(String keyword) {
        return null;
    }



    @Override
    public void add(Customer info) {

    }

    @Override
    public void Update(Customer info) {

    }

    @Override
    public void delete(Customer id) {

    }
}
