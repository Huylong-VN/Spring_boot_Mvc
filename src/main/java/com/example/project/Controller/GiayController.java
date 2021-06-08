package com.example.project.Controller;

import com.example.project.Service.GiayService;
import com.example.project.ViewModel.GiayViewModel;
import com.example.project.model.Giay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@RestController
public class GiayController {
    @Autowired
    private final GiayService giayService;
    public GiayController(){ giayService = new GiayService(); }

    @GetMapping(value = "/Giay")
    public List<Giay> getAll(){ return giayService.getAll();}

    @GetMapping("/GiayFull")
    public List<GiayViewModel> getAll2(){ return giayService.getAll2();}
    @RequestMapping(value = "/detail/id={id}", method = RequestMethod.GET)
    public ModelAndView details(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("detail");
        mav.addObject("id",id);
        return mav;
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public Giay getDetails(@PathVariable("id") String id) { return giayService.getByID(id); }

    // Get By ID
    @PostMapping(value = "/Giay/getByKeyWord")
    public List<Giay> getByKeyWord(@RequestBody String giay){ return giayService.getByKeyWord(giay); }





    //CRUD Giay
    @PostMapping(value = "/Giay")
    public void create(@RequestBody Giay giay){
        giayService.add(giay);
    }


    @PutMapping(value = "/Giay")
    public void edit(@RequestBody Giay giay){
        System.out.println(giay);;giayService.edit(giay);
    }
    @DeleteMapping(value = "/Giay")
    public void delete(@RequestBody Giay giay){
        System.out.println(giay.getMaGiay());
        giayService.delete(giay);
    }
    // End CRUD Giay

}
