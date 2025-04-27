package com.miconcesionario.concesionario_app.controller;


import com.miconcesionario.concesionario_app.model.Sale;
import com.miconcesionario.concesionario_app.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Sale")
public class SaleController {

    @Autowired
    private SaleService saleService;

    //Listar todas las ventas
    @GetMapping
    public List<Sale> Listar() {
        return saleService.listarVentas();
    }

    //Guarda una nueva venta
    @PostMapping
    public Sale guardar(@RequestBody Sale sale) {
        return saleService.guardarVentas(sale);
    }

    //Buscar una venta por ID
    @GetMapping("/{id}")
    public Sale buscar(@PathVariable Long id) {
        return saleService.buscarPorId(id);
    }

    //Eliminar una venta por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        saleService.eliminarUnaVenta(id);
    }

    //Actualizar una venta existente
    @PutMapping("/{id}")
    public Sale actualizar(@PathVariable Long id, @RequestBody Sale saleActualizada) {
        Sale ventaExistente = saleService.buscarPorId(id);
        if (ventaExistente != null) {
            ventaExistente.setDatesale(saleActualizada.getDatesale());
            ventaExistente.setCoste(saleActualizada.getCoste());
            ventaExistente.setCustomer(saleActualizada.getCustomer());
            ventaExistente.setCar(saleActualizada.getCar());
            return saleService.guardarVentas(ventaExistente);
        } else {
            return null;
        }
    }
}