package com.example.project.Service;

import com.example.project.Business.CT_PNBus;
import com.example.project.model.CT_PN;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CT_PNService implements IcommonService<CT_PN>{
    private CT_PNBus ct_pnBus;
    public CT_PNService(){ct_pnBus=new CT_PNBus();}

    @Override
    public List<CT_PN> getAll() {
        return ct_pnBus.getAll();
    }

    @Override
    public CT_PN getByID(String id) {
        return null;
    }

    @Override
    public List<CT_PN> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(CT_PN intro) {

    }

    @Override
    public void edit(CT_PN info) {

    }

    @Override
    public void delete(CT_PN id) {

    }
}
