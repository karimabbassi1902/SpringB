package com.example.test.Services;

import com.example.test.Entities.Client;
import com.example.test.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IServiceClientImp implements IServiceClient{
@Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {

        return clientRepository.save(c);
    }

    @Override
    public Client updateClient(Client e) {

        return clientRepository.save(e);
    }




   @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public List<Client> FindbyID(Long idClient) {
        return null;
    }

    @Override
    public Client getbyID(Long idClient) {
        return null;
    }


    @Override
    public void deleteClient(Long idClient) {

        clientRepository.deleteById((long) idClient.intValue());
    }





}
