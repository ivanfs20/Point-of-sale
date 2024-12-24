package com.ivanfs20.demo.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "FACTURAS")
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_factura;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "id_clientes")
    private Clientes id_clientes;
    @OneToMany(mappedBy = "id_factura")
    private List<Ventas> id_ventas;

    public Facturas() {
    }

    public Facturas(Date fecha, Clientes id_clientes, List<Ventas> id_ventas) {
        this.fecha = fecha;
        this.id_clientes = id_clientes;
        this.id_ventas = id_ventas;
    }

    public Long getId_factura() {
        return id_factura;
    }

    public void setId_factura(Long id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Clientes getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(Clientes id_clientes) {
        this.id_clientes = id_clientes;
    }

    public List<Ventas> getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(List<Ventas> id_ventas) {
        this.id_ventas = id_ventas;
    }
}
