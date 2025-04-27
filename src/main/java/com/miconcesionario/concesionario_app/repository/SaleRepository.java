package com.miconcesionario.concesionario_app.repository;

import com.miconcesionario.concesionario_app.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
