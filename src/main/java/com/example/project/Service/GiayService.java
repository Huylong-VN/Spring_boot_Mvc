package com.example.project.Service;


import com.example.project.Business.Giaybus;
import com.example.project.ViewModel.GiayViewModel;
import com.example.project.model.Giay;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GiayService implements IcommonService<Giay> {
    // tang bus: thao tac voi db
    // tang service: dung tang bus, thang controller se goi den thang service chu khong goi thang bus
    private Giaybus bus;
    public GiayService(){bus=new Giaybus();}
    public List<GiayViewModel> getAll2() {
        return bus.getAll2();
    }
    @Override
    public List<Giay> getAll() {
        return bus.getAll();
    }
    @Override
    public Giay getByID(String id) { return bus.getSingleByID(id); }

    @Override
    public List<Giay> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void delete(Giay id) {bus.delete(id); }
    @Override
    public void edit(Giay info) {bus.Update(info); }
    @Override
    public void add(Giay intro) { bus.add(intro);}
}
