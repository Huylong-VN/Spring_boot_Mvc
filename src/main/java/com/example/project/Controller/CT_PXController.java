package com.example.project.Controller;

import com.example.project.Service.CT_PXService;
import com.example.project.model.CT_PX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CT_PXController{
    @Autowired
    private CT_PXService ct_pxService;
    @GetMapping("/CT_PX")
    public List<CT_PX> getAll() {
        return ct_pxService.getAll();
    }
}
