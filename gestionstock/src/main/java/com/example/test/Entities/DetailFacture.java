package com.example.test.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture implements Serializable {
 @Id
 private long idDetailFacture;
 private int qte;
 private float prixTotal;
 private int pourcentageRemise;
 private int montantRemise;
 @ManyToOne(cascade = CascadeType.PERSIST)
 private Facture facture;
 @ManyToOne(cascade = CascadeType.PERSIST)
 private Produit produit;
}
