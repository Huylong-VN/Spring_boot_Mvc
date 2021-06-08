package com.example.project.Controller;

import com.example.project.Service.NhanVienService;
import com.example.project.model.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NhanVienController{
    @Autowired
    private NhanVienService nhanVienService;
    @GetMapping(value = "/NhanVien")
    public List<NhanVien> getAll(){ return nhanVienService.getAll();}
}
