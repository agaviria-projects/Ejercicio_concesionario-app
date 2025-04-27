package com.miconcesionario.concesionario_app.controller;

import com.miconcesionario.concesionario_app.model.Car;
import com.miconcesionario.concesionario_app.model.Customer;
import com.miconcesionario.concesionario_app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> Listar(){
        return carService.listarVehiculos();
    }
    @PostMapping
    public Car guardar(@RequestBody Car car){
        return carService.guardarVehiculos(car);
    }
    @GetMapping("/{id}")
    public Car buscar(@PathVariable Long id){
        return carService.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        carService.eliminarUnVehiculo(id);
    }
    @PutMapping("/{id}")
    public Car actualizar(@PathVariable Long id, @RequestBody Car carActualizado) {
        Car carroExistente = carService.buscarPorId(id);

        if (carroExistente != null) {
            carroExistente.setPlatenumber(carActualizado.getPlatenumber());
            carroExistente.setBrand(carActualizado.getBrand());
            carroExistente.setModel(carActualizado.getModel());
            return carService.guardarVehiculos(carroExistente);
        } else {
            return null;
        }
    }
}



