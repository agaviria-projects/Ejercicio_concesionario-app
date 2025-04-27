package com.miconcesionario.concesionario_app.service;

import com.miconcesionario.concesionario_app.model.Sale;
import com.miconcesionario.concesionario_app.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale>listarVentas(){
        return saleRepository.findAll();
    }

    public Sale guardarVentas(Sale sale){
        return saleRepository.save(sale);
    }

    public Sale buscarPorId(Long id){
        return saleRepository.findById(id).orElse(null);
    }
    public void eliminarUnaVenta(Long id){
        saleRepository.deleteById(id);
    }
}
