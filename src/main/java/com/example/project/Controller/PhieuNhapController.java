package com.example.project.Controller;

import com.example.project.Service.PhieuNhapService;
import com.example.project.model.PhieuNhap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhieuNhapController{
    @Autowired
    private PhieuNhapService phieuNhapService;
    @GetMapping("/PhieuNhap")
    public List<PhieuNhap> getAll(){
        return phieuNhapService.getAll();
    }
}
