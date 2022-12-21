package com.example.test.Repository;

import com.example.test.Entities.Produit;
import com.example.test.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Long> {
    @Query("SELECT s.produits FROM Stock s where s.qteStock < s.qteMin ")
    public List<Produit> getStockProduits();
}
