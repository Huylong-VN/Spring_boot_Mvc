package com.example.project.Controller;

import com.example.project.Service.NSXService;
import com.example.project.model.NSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NSXControler{
    @Autowired
    private NSXService nsxService;
    @GetMapping("/NSX")
    public List<NSX> getAll(){
        return nsxService.getAll();
    }

}
