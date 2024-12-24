package com.ivanfs20.demo.Dao;

import com.ivanfs20.demo.Entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosDAO extends JpaRepository<Productos,Long> {
}
