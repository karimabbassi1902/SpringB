package com.example.test.Repository;


import com.example.test.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FactureRepository extends JpaRepository<Facture,Long  > {



}
