package com.ivanfs20.demo.Dao;

import com.ivanfs20.demo.Entities.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresDAO extends JpaRepository<Proveedores,Long> {
}
