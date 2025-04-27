package com.miconcesionario.concesionario_app.repository;

import com.miconcesionario.concesionario_app.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
