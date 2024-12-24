package com.ivanfs20.demo.Dao;

import com.ivanfs20.demo.Entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesDAO extends JpaRepository<Clientes,Long> {
}
