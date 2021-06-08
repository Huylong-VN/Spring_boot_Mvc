package com.example.project.Business;



import com.example.project.model.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienBus extends BaseBus implements IBus<NhanVien>{

    @Override
    public List<NhanVien> getAll(){
        List<NhanVien> nhanVien=new ArrayList<>();
        query="Select * from NhanVien";
        Connection connection= db.getConnection();
        if(connection!=null){
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                ResultSet resultSet=preparedStatement.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    nhanVien.add(initInfo.initNhanVien(resultSet));
                }
                preparedStatement.close();
            }catch (Exception throwables) {
                throwables.printStackTrace();
            }
        }

        return nhanVien;
    }

    @Override
    public NhanVien getSingleByID(String id) {
        return null;
    }

    @Override
    public List<NhanVien> getByKeyword(String keyword) {
        return null;
    }


    @Override
    public void add(NhanVien info) {

    }

    @Override
    public void Update(NhanVien info) {

    }

    @Override
    public void delete(NhanVien id) {

    }
}
