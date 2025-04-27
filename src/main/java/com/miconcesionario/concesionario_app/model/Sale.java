package com.miconcesionario.concesionario_app.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate datesale;
    private Double coste;

    //Relaciones
    @ManyToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;

    //Constructor vacio-+
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

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}



