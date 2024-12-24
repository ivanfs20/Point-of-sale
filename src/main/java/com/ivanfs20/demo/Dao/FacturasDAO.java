package com.ivanfs20.demo.Dao;

import com.ivanfs20.demo.Entities.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturasDAO extends JpaRepository<Facturas,Long> {
}
