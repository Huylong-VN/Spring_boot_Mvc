package com.example.project.Service;

import com.example.project.Business.PhieuXuatBus;
import com.example.project.model.PhieuXuat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuXuatService implements IcommonService<PhieuXuat> {
    private PhieuXuatBus phieuXuatBus;
    public PhieuXuatService(){phieuXuatBus=new PhieuXuatBus();}

    @Override
    public List<PhieuXuat> getAll() {
        return phieuXuatBus.getAll();
    }

    @Override
    public PhieuXuat getByID(String id) {
        return null;
    }

    @Override
    public List<PhieuXuat> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(PhieuXuat intro) {

    }

    @Override
    public void edit(PhieuXuat info) {

    }

    @Override
    public void delete(PhieuXuat id) {

    }
}
