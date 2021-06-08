package com.example.project.Business;


import com.example.project.model.NSX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NSXBus extends BaseBus implements IBus<NSX>{
    @Override
    public List<NSX> getAll() {
        List<NSX> nsxes=new ArrayList<>();
        query="select * from NSX";
        Connection conn=db.getConnection();
        if(conn!=null){
            try{
                PreparedStatement ps=conn.prepareStatement(query);
                ResultSet resultSet=ps.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    nsxes.add(initInfo.initNXS(resultSet));
                }
                ps.close();
            }catch (Exception throwables) {
                throwables.printStackTrace();
            }
        }
        return nsxes;
    }

    @Override
    public NSX getSingleByID(String id) {
        return null;
    }

    @Override
    public List<NSX> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(NSX info) {

    }

    @Override
    public void Update(NSX info) {

    }

    @Override
    public void delete(NSX id) {

    }
}
