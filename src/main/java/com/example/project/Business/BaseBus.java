package com.example.project.Business;


import java.util.ArrayList;
import java.util.List;

public class BaseBus {
    protected ConnectSql db;
    protected String query;
    List<String> parameters;

    public BaseBus() {
        db = new ConnectSql();
        parameters = new ArrayList<>();
    }

}
