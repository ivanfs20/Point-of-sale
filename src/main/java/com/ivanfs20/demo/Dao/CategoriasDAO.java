package com.ivanfs20.demo.Dao;

import com.ivanfs20.demo.Entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasDAO extends JpaRepository<Categorias,Long> {
}
