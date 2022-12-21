package com.example.test.Controllers;

import com.example.test.Entities.CategorieClient;
import com.example.test.Entities.Client;
import com.example.test.Service.ClientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Client")
public class ClientController {
    @Autowired
    ClientServiceImp clientService;

    @GetMapping("/All")
    public List<Client> getAllClients () {
        return   clientService.getAll();
    }

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client){
        return clientService.add(client);
    }

    @PutMapping("/update/{idClient}")
   Client updateClient(@RequestBody Client client , @PathVariable Long idClient) {
        return clientService.update(client,idClient) ;
    }

    @DeleteMapping("/delete/{idClient}")
    void deleteClient(@PathVariable Long idClient) {
       clientService.delete(idClient);
    }

    @GetMapping( "/getChiffreAffaireParCategorieClient/{categorieClient}/{startDate}/{endDate}")
    public float getChiffreAffaireParCategorieClient(@PathVariable("categorieClient") CategorieClient categorieClient,
                                                     @PathVariable(name = "startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                     @PathVariable(name = "endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

        return clientService.getChiffreAffaireParCategorieClient(categorieClient, startDate, endDate);
    }
}
