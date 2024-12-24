package com.ivanfs20.demo.Services;

import com.ivanfs20.demo.Dao.ProductosDAO;
import com.ivanfs20.demo.Entities.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    @Autowired
    private ProductosDAO productosDAO;

    public void save(Productos productos){
        productosDAO.save(productos);
    }

    public void delete(Long id){
        productosDAO.deleteById(id);
    }

/*
POR EL MOMENTO LA MODIFICACION NO ESTA DISPONIBLE
    public void modific(){

    }
 */

    public Productos findById(Long id){
        List<Productos> productos = productosDAO.findAll();
        Productos producto = new Productos();
        for(Productos p:productos){
            if(p.getId_producto()==id){
                producto=p;
            }
        }
        return producto;
    }

    public List<Productos> finAll(){
        return productosDAO.findAll();
    }
}
