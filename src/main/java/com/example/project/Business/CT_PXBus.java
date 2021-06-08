package com.example.project.Business;



import com.example.project.model.CT_PX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CT_PXBus extends BaseBus implements IBus<CT_PX>{

    @Override
    public List<CT_PX> getAll() {
        List<CT_PX> ct_pxes=new ArrayList<>();
        query="Select * from CT_PX";
        Connection connection= db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                initInfo initInfo=new initInfo();
                ResultSet resultSet=preparedStatement.executeQuery();
                while (resultSet.next()){
                    ct_pxes.add(initInfo.initCT_PX(resultSet));
                }
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return ct_pxes;
    }

    @Override
    public CT_PX getSingleByID(String id) {
        return null;
    }

    @Override
    public List<CT_PX> getByKeyword(String keyword) {
        return null;
    }


    @Override
    public void add(CT_PX info) {

    }

    @Override
    public void Update(CT_PX info) {

    }

    @Override
    public void delete(CT_PX id) {

    }
}
