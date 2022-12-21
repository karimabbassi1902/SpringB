package com.example.test.Controllers;

import com.example.test.Entities.DetailFacture;
import com.example.test.Service.DetailFactureServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("detailFacture")
public class DetailFactureController {
    @Autowired
    DetailFactureServiceImp detailFactureService;

    @GetMapping("/all")
    List<DetailFacture> getAllDetailFactures () {
        return   detailFactureService.getAll();
    }

    @PostMapping("/add")
    DetailFacture addDetailFacture(@RequestBody DetailFacture detailFacture){
        return detailFactureService.add(detailFacture);
    }

    @PutMapping("/update/{idDetailFacture}")
    DetailFacture updateDetailFacture(@RequestBody DetailFacture detailFacture , @PathVariable Long idDetailFacture) {
        return detailFactureService.update(detailFacture,idDetailFacture) ;
    }

    @DeleteMapping("/delete/{idDetailFacture}")
    void deleteDetailFacture(@PathVariable Long idDetailFacture) {
        detailFactureService.delete(idDetailFacture);
    }
}
