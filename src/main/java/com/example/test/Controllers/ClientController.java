package com.example.test.Controllers;

import com.example.test.Entities.Client;
import com.example.test.Services.IServiceClientImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("Client")
public class ClientController {
    @Autowired
    IServiceClientImp iServiceClientImp;

    @PostMapping("/add")
    public Client addStudent(@RequestBody  Client c){
        return iServiceClientImp.addClient(c);
    }

    @PutMapping("/update_clients")
    public Client updateClient(@RequestBody Client c){
        return iServiceClientImp.updateClient(c);
    }

    @GetMapping("/get_all_clients")
    public Client retrieveClient(@PathParam("id") Long idClient){
        return iServiceClientImp.retrieveClient(idClient);
    }
    @DeleteMapping("/delete_clients")
    public void deleteClient(@PathParam("id") Long idClient){
        iServiceClientImp.deleteClient(idClient);
    }



}

