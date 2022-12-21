package com.example.test.Service;
import com.example.test.Entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> getFacturesByClient(Long idClient);


}
