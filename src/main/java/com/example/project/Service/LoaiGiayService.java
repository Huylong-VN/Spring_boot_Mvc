package com.example.project.Service;

import com.example.project.Business.LoaiGiayBus;
import com.example.project.model.LoaiGiay;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiGiayService implements IcommonService<LoaiGiay> {
    private LoaiGiayBus bus;
    public LoaiGiayService(){
        bus=new LoaiGiayBus();
    }
    @Override
    public List<LoaiGiay> getAll() {
        return bus.getAll();
    }

    @Override
    public LoaiGiay getByID(String id) {
        return bus.getSingleByID(id);
    }

    @Override
    public List<LoaiGiay> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(LoaiGiay intro) { }
    @Override
    public void edit(LoaiGiay info) { }

    @Override
    public void delete(LoaiGiay id) { }

}
