package com.example.project.Controller;

import com.example.project.Service.PhieuNhapService;
import com.example.project.Service.PhieuXuatService;
import com.example.project.model.PhieuXuat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhieuXuatController{
    @Autowired
    private PhieuXuatService phieuXuatService;

    @GetMapping("/PhieuXuat")
    public List<PhieuXuat> getAll() {
        return phieuXuatService.getAll();
    }
}
