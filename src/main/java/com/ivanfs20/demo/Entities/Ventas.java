package com.ivanfs20.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "VENTAS")
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ventas;
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Productos id_producto;
    @ManyToOne
    @JoinColumn(name = "id_factura")
    private Facturas id_factura;

    public Ventas() {
    }

    public Ventas(Integer cantidad, Productos id_producto, Facturas id_factura) {
        this.cantidad = cantidad;
        this.id_producto = id_producto;
        this.id_factura = id_factura;
    }

    public Long getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(Long id_ventas) {
        this.id_ventas = id_ventas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getId_producto() {
        return id_producto;
    }

    public void setId_producto(Productos id_producto) {
        this.id_producto = id_producto;
    }

    public Facturas getId_factura() {
        return id_factura;
    }

    public void setId_factura(Facturas id_factura) {
        this.id_factura = id_factura;
    }
}
