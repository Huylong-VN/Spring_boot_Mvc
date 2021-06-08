package com.example.project.Service;

import com.example.project.Business.NhanVienBus;
import com.example.project.model.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService implements IcommonService<NhanVien>{
    private NhanVienBus nhanVienBus;
    public NhanVienService(){nhanVienBus=new NhanVienBus();}
    @Override
    public List<NhanVien> getAll() {
        return nhanVienBus.getAll();
    }

    @Override
    public NhanVien getByID(String id) {
        return null;
    }

    @Override
    public List<NhanVien> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(NhanVien intro) {

    }

    @Override
    public void edit(NhanVien info) {

    }

    @Override
    public void delete(NhanVien id) {

    }
}
