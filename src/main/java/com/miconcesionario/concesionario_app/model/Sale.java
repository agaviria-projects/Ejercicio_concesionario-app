package com.miconcesionario.concesionario_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate datesale;
    private Double coste;

    public Sale(){

    }

    //Getter y Setter


    public Long getId() {
        return id;
    }

    public LocalDate getDatesale() {
        return datesale;
    }

    public Double getCoste() {
        return coste;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDatesale(LocalDate datesale) {
        this.datesale = datesale;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }
}



