package com.example.project.Controller;

import com.example.project.Service.LoaiGiayService;
import com.example.project.model.LoaiGiay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoaiGiayController{
    @Autowired
    private LoaiGiayService loaiGiayService;
    @GetMapping("/LoaiGiay")
    public List<LoaiGiay> getAll(){
        return loaiGiayService.getAll();
    }
}
