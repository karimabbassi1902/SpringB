package com.example.test.Service;



import com.example.test.Entities.CategorieClient;

import java.util.Date;

public interface IClientService {
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);
}
