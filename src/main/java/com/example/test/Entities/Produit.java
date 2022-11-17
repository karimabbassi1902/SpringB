package com.example.test.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
    @OneToOne
    public DetailProduit detailProduit;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Stock stock;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Rayon rayon;
    @OneToMany
    private List<Fournisseur> fournisseurs;
}
