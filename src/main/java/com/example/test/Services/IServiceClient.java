package com.example.test.Services;

import com.example.test.Entities.Client;

import java.util.List;
import java.util.Optional;

public interface IServiceClient {
   public List<Client> retrieveAllClients();
   public   Client addClient(Client c);
   public  void deleteClient(Long id);
   public Client updateClient(Client c);
   public Client retrieveClient(Long id);
   public List<Client> FindbyID(Long idClient);
   public Client getbyID(Long idClient);
}
