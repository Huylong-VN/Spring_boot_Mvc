package com.example.project.Business;

import com.example.project.model.PhieuXuat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhieuXuatBus extends BaseBus implements IBus<PhieuXuat>{

    @Override
    public List<PhieuXuat> getAll() {
        List<PhieuXuat> phieuXuats=new ArrayList<>();
        query="Select * from PhieuXuat";
        Connection connection= db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                initInfo initInfo=new initInfo();
                ResultSet resultSet=preparedStatement.executeQuery();
                while (resultSet.next()){
                    phieuXuats.add(initInfo.initPhieuXuat(resultSet));
                }
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return phieuXuats;
    }

    @Override
    public PhieuXuat getSingleByID(String id) {
        return null;
    }

    @Override
    public List<PhieuXuat> getByKeyword(String keyword) {
        return null;
    }



    @Override
    public void add(PhieuXuat info) {

    }

    @Override
    public void Update(PhieuXuat info) {

    }

    @Override
    public void delete(PhieuXuat id) {

    }

}
