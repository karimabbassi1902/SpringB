package com.example.test.Service;
import com.example.test.Entities.DetailProduit;
import com.example.test.Repository.DetailProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailProduitServiceImp implements ICrudService<DetailProduit, Long> ,IDetailProduitService{

    @Autowired
    DetailProduitRepository detailProduitRepository ;




    @Override
    public List<DetailProduit> getAll() {
        return detailProduitRepository.findAll();
    }

    @Override
    public DetailProduit add(DetailProduit detailProduit) {
        return detailProduitRepository.save(detailProduit);
    }

    @Override
    public DetailProduit update(DetailProduit detailProduit, Long idDetailProduit) {
        if(detailProduitRepository.findById(idDetailProduit).isPresent()) {

            DetailProduit detailProduit1 = detailProduitRepository.findById(idDetailProduit).get();
            detailProduit1.setProduit(detailProduit.getProduit());
            detailProduit1.setCategorieProduit(detailProduit.getCategorieProduit());
            return detailProduitRepository.save(detailProduit1);
        }
        return null;
    }

    @Override
    public void delete(Long idDetailProduit) {
        detailProduitRepository.deleteById(idDetailProduit);


    }
}
