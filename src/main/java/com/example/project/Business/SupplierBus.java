package com.example.project.Business;

import com.example.project.model.Supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierBus extends BaseBus implements IBus<Supplier>{

    @Override
    public List<Supplier> getAll() {
        List<Supplier> suppliers=new ArrayList<>();
        query="Select * from Supplier";
        Connection connection=db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                ResultSet resultSet=preparedStatement.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    suppliers.add(initInfo.initSupplier(resultSet));
                }
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return suppliers;
    }

    @Override
    public Supplier getSingleByID(String id) {
        return null;
    }

    @Override
    public List<Supplier> getByKeyword(String keyword) {
        return null;
    }



    @Override
    public void add(Supplier info) {

    }

    @Override
    public void Update(Supplier info) {

    }

    @Override
    public void delete(Supplier id) {

    }

}
