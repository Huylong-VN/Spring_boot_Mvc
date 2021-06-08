package com.example.project.Business;


import com.example.project.model.CT_PN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CT_PNBus extends BaseBus implements IBus<CT_PN>{

    @Override
    public List<CT_PN> getAll() {
        List<CT_PN> ct_pns=new ArrayList<>();
        query="Select * from CT_PN";
        Connection connection=db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                ResultSet resultSet=preparedStatement.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    ct_pns.add(initInfo.initCT_PN(resultSet));
                }
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return ct_pns;
    }

    @Override
    public CT_PN getSingleByID(String id) {
        return null;
    }

    @Override
    public List<CT_PN> getByKeyword(String keyword) {
        return null;
    }


    @Override
    public void add(CT_PN info) {

    }

    @Override
    public void Update(CT_PN info) {

    }

    @Override
    public void delete(CT_PN id) {

    }
}
