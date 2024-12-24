package com.ivanfs20.demo.Dao;

import com.ivanfs20.demo.Entities.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasDAO extends JpaRepository<Ventas,Long> {
}
