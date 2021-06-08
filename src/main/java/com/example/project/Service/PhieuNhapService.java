package com.example.project.Service;

import com.example.project.Business.PhieuNhapBus;
import com.example.project.model.PhieuNhap;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuNhapService implements IcommonService<PhieuNhap> {
    private PhieuNhapBus phieuNhapBus;
    public PhieuNhapService(){phieuNhapBus=new PhieuNhapBus();}

    @Override
    public List<PhieuNhap> getAll() {
        return phieuNhapBus.getAll();
    }

    @Override
    public PhieuNhap getByID(String id) {
        return null;
    }

    @Override
    public List<PhieuNhap> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(PhieuNhap intro) {

    }

    @Override
    public void edit(PhieuNhap info) {

    }

    @Override
    public void delete(PhieuNhap id) {

    }
}
