package com.miconcesionario.concesionario_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String platenumber;
    private String brand;
    private String model;

    public Car(){

    }

    //Getter y Setter


    public Long getId() {
        return id;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
