package com.miconcesionario.concesionario_app.repository;

import com.miconcesionario.concesionario_app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
