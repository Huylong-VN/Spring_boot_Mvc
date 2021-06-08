package com.example.project.Service;

import com.example.project.Business.CT_PXBus;
import com.example.project.model.CT_PX;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CT_PXService implements IcommonService<CT_PX> {
    private CT_PXBus ct_pxBus;
    public CT_PXService(){ct_pxBus=new CT_PXBus();}

    @Override
    public List<CT_PX> getAll() {
        return ct_pxBus.getAll();
    }

    @Override
    public CT_PX getByID(String id) {
        return null;
    }

    @Override
    public List<CT_PX> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(CT_PX intro) {

    }

    @Override
    public void edit(CT_PX info) {

    }

    @Override
    public void delete(CT_PX id) {

    }
}
