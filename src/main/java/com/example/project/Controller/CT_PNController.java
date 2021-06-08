package com.example.project.Controller;

import com.example.project.Service.CT_PNService;
import com.example.project.model.CT_PN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CT_PNController{
    @Autowired
    private CT_PNService ct_pnService;

    @GetMapping("/CT_PN")
    public List<CT_PN> getAll() {
        return ct_pnService.getAll();
    }
}
