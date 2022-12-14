package com.example.test.Service;
import com.example.test.Entities.Fournisseur;
import com.example.test.Entities.Produit;
import com.example.test.Repository.FournisseurRepository;
import com.example.test.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FournisseurServiceImp implements ICrudService<Fournisseur, Long > , IFournisseurService  {
    @Autowired
    FournisseurRepository fournisseurRepository ;
    @Autowired
    ProduitRepository produitRepository ;
    @Override
    public List<Fournisseur> getAll() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur add(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur update(Fournisseur fournisseur  , Long idFournisseur) {
        if(fournisseurRepository.findById(idFournisseur).isPresent()) {

            Fournisseur fournisseur1 = fournisseurRepository.findById(idFournisseur).get();
            fournisseur1.setCodeFournisseur(fournisseur.getCodeFournisseur());
            fournisseur1.setLibelleFournisseur(fournisseur.getLibelleFournisseur());

            return fournisseurRepository.save(fournisseur1);
        }
        return null;
    }

    @Override
    public void delete(Long idFournisseur) {
        fournisseurRepository.deleteById(idFournisseur);

    }

    @Override
    public void assignFournisseurToProduit(Long idFournisseur, Long idProduit) {
        Fournisseur  fournisseur = fournisseurRepository.findById(idFournisseur).get();
        //System.out.println(stock.getQteStock());
        Produit produit = produitRepository.findById(idProduit).get();
        produit.getFournisseurs().add(fournisseur);
        System.out.println(produit.getFournisseurs());
        produitRepository.save(produit);
        fournisseurRepository.save(fournisseur);



    }
}
