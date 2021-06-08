package com.example.project.Business;
import com.example.project.model.LoaiGiay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiGiayBus extends BaseBus implements IBus<LoaiGiay>{

    @Override
    public List<LoaiGiay> getAll() {
        List<LoaiGiay> loaiGiays=new ArrayList<>();
        query="select * from LoaiGiay";
        Connection conn=db.getConnection();
        if(conn!=null){
            try {
                PreparedStatement ps=conn.prepareStatement(query);
                ResultSet resultSet=ps.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    loaiGiays.add(initInfo.initLoaiGiay(resultSet));
                }
                System.out.println(resultSet);
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return loaiGiays;
    }

    @Override
    public LoaiGiay getSingleByID(String id) {
        return null;
    }

    @Override
    public List<LoaiGiay> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(LoaiGiay info) {

    }

    @Override
    public void Update(LoaiGiay info) {

    }

    @Override
    public void delete(LoaiGiay id) {

    }
}
