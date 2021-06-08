package com.example.project.Business;

import com.example.project.model.PhieuNhap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhapBus extends BaseBus implements IBus<PhieuNhap>{

    @Override
    public List<PhieuNhap> getAll() {
        List<PhieuNhap> phieuNhaps=new ArrayList<>();
        query="Select * from PhieuNhap";
        Connection connection= db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                ResultSet resultSet=preparedStatement.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    phieuNhaps.add(initInfo.initPhieuNhap(resultSet));
                }
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return phieuNhaps;
    }

    @Override
    public PhieuNhap getSingleByID(String id) {
        return null;
    }

    @Override
    public List<PhieuNhap> getByKeyword(String keyword) {
        return null;
    }


    @Override
    public void add(PhieuNhap info) {

    }

    @Override
    public void Update(PhieuNhap info) {

    }

    @Override
    public void delete(PhieuNhap id) {

    }
}
