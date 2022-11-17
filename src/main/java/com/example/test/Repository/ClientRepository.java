package com.example.test.Repository;

import com.example.test.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientRepository extends JpaRepository<Client,Long> {

  //public Client findById(Long idClient);
}
