package com.ivanfs20.demo.Entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "PROVEEDORES")
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_proveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    @OneToMany(mappedBy = "id_proveedor")
    private List<Productos> id_productos;

    public Proveedores() {
    }

    public Proveedores(String nombre, String direccion, String telefono, List<Productos> id_productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_productos = id_productos;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Productos> getId_productos() {
        return id_productos;
    }

    public void setId_productos(List<Productos> id_productos) {
        this.id_productos = id_productos;
    }
}
