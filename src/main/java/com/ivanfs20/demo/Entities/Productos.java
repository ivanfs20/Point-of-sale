package com.ivanfs20.demo.Entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "PRODUCTOS")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_producto;
    private String descripcion;
    private Float precio;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categorias id_categoria;
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedores id_proveedor;
    @OneToMany(mappedBy = "id_producto")
    private List<Ventas> id_ventas;

    public Productos() {
    }

    public Productos(String descripcion, Float precio, Categorias id_categoria, Proveedores id_proveedor, List<Ventas> id_ventas) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.id_categoria = id_categoria;
        this.id_proveedor = id_proveedor;
        this.id_ventas = id_ventas;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Categorias getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categorias id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Proveedores getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedores id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public List<Ventas> getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(List<Ventas> id_ventas) {
        this.id_ventas = id_ventas;
    }
}
