package com.example.test.Repository;

import com.example.test.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Date;



public interface ProduitRepository extends JpaRepository<Produit, Long> {

    @Query("SELECT sum(df.prixTotal) FROM DetailFacture df where df.produit=:produit and df.facture.dateFacture between :startDate"                        + " and :endDate and df.facture.active=true")
    public float getRevenuBrutProduit(@Param("produit") Produit produit, @Param("startDate") Date startDate,
                                      @Param("endDate") Date endDate);

   /* @Query ("SELECT s.produits FROM Stock s where s.qteStock < s.qteMin ")
    public List<Produit> getStockProduits(); */
}
