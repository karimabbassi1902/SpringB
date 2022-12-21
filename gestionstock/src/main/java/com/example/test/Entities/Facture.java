package com.example.test.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable {
@Id
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(value = TemporalType.DATE)
    private Date dateFacture;
    private Boolean active;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Client client;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;

}
