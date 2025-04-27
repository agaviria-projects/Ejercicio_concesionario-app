package com.miconcesionario.concesionario_app.service;

import com.miconcesionario.concesionario_app.model.Car;
import com.miconcesionario.concesionario_app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> listarVehiculos(){
        return carRepository.findAll();
    }

    public Car guardarVehiculos(Car car) {
        return carRepository.save(car);
    }

    public Car buscarPorId(Long id){
        return carRepository.findById(id).orElse(null);

    }

    public void eliminarUnVehiculo(Long id){
        carRepository.deleteById(id);
    }
}


