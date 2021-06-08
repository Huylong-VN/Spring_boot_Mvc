package com.example.project.Service;

import com.example.project.Business.NSXBus;
import com.example.project.model.NSX;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NSXService implements IcommonService<NSX> {
    private NSXBus nsxBus;
    public NSXService(){nsxBus=new NSXBus();}

    @Override
    public List<NSX> getAll() {
        return nsxBus.getAll();
    }

    @Override
    public NSX getByID(String id) {
        return null;
    }

    @Override
    public List<NSX> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(NSX intro) {

    }

    @Override
    public void edit(NSX info) {

    }

    @Override
    public void delete(NSX id) {

    }
}
