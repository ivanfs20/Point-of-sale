package com.ivanfs20.demo.Services;

import com.ivanfs20.demo.Dao.VentasDAO;
import com.ivanfs20.demo.Entities.Productos;
import com.ivanfs20.demo.Entities.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasService {
    @Autowired
    private VentasDAO ventasDAO;

    public void save(Ventas ventas){
        ventasDAO.save(ventas);
    }

    public void delete(Long id){
        ventasDAO.deleteById(id);
    }

/*
POR EL MOMENTO LA MODIFICACION NO ESTA DISPONIBLE
    public void modific(Ventas ventasM){
        List<Ventas> ventas = ventasDAO.findAll();
        Ventas venta = null;
        for(Ventas v:ventas){
            if(v.getId_ventas()==ventasM.getId_ventas()){
                v.setCantidad(ventasM.getCantidad());
            }
        }
    }
 */

    public Ventas findById(Long id){
        List<Ventas> ventas=ventasDAO.findAll();
        Ventas venta=new Ventas();
        for(Ventas v:ventas){
            if(v.getId_ventas()==id){
                venta = v;
            }
        }
        return venta;
    }

    public List<Ventas> finAll(){
        return ventasDAO.findAll();
    }
}

