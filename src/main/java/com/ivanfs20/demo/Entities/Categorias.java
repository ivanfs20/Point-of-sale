package com.ivanfs20.demo.Entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "CATEGORIAS")
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categorias;
    private String descripcion;
    @OneToMany(mappedBy = "id_categoria")
    private List<Productos> id_productos;

    public Categorias() {
    }

    public Categorias(String descripcion, List<Productos> id_productos) {
        this.descripcion = descripcion;
        this.id_productos = id_productos;
    }

    public Long getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Long id_categorias) {
        this.id_categorias = id_categorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Productos> getId_productos() {
        return id_productos;
    }

    public void setId_productos(List<Productos> id_productos) {
        this.id_productos = id_productos;
    }
}
