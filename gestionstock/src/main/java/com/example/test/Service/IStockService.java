package com.example.test.Service;
public interface IStockService {
    void assignProduitToStock(Long idProduit, Long idStock);
    String retrieveStatusStock();
}
