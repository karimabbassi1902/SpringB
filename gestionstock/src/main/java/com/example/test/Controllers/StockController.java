package com.example.test.Controllers;

import com.example.test.Entities.Stock;
import com.example.test.Service.StockServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stock")
public class StockController {
    @Autowired
    StockServiceImp stockService;

    @GetMapping("/All")
    List<Stock> getAllStocks () {
        return   stockService.getAll();
    }

    @PostMapping("/add")
    Stock addStock(@RequestBody Stock stock){
        return stockService.add(stock);
    }

    @PutMapping("/update/{idStock}")
    Stock updateStock(@RequestBody Stock stock , @PathVariable Long idStock) {
        return stockService.update(stock,idStock) ;
    }

    @DeleteMapping("/delete/{idStock}")
    void deleteStock(@PathVariable Long idStock) {
        stockService.delete(idStock);
    }
    @PostMapping("/addProduitToStock")

    void assignProduitToStock(@RequestParam Long idProduit, @RequestParam Long idStock) {
        stockService.assignProduitToStock(idProduit,idStock);


    }

    @GetMapping ("/ListProduits")
    public String retrieveStatusStock() {
        return stockService.retrieveStatusStock() ;

    }
}
