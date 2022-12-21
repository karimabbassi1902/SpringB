package com.example.test.Repository;

import com.example.test.Entities.CategorieClient;
import com.example.test.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Date;


public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query
            ("SELECT sum(f.montantFacture) FROM Facture f where f.client.categorieClient=:categorieClient and f.dateFacture between :startDate"
                    + " and :endDate and f.active=true")
    public float getChiffreAffaireParCategorieClient(@Param("categorieClient") CategorieClient categorieClient,
                                                     @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
