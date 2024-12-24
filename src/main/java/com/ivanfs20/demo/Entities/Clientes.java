package com.ivanfs20.demo.Entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "CLIENTES")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cliente;
    private String nombre;
    private String direccion;
    private String telefono;
    @OneToMany(mappedBy = "id_clientes")
    private List<Facturas> id_facturas;

    public Clientes() {
    }

    public Clientes(String nombre, String direccion, String telefono, List<Facturas> id_facturas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_facturas = id_facturas;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
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

    public List<Facturas> getId_facturas() {
        return id_facturas;
    }

    public void setId_facturas(List<Facturas> id_facturas) {
        this.id_facturas = id_facturas;
    }
}
