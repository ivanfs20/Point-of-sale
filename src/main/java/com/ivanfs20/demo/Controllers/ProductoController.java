package com.ivanfs20.demo.Controllers;

import com.ivanfs20.demo.Entities.Productos;
import com.ivanfs20.demo.Services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    private ProductosService productosService;

    @PostMapping
    public String crearProducto(Productos p){
        productosService.save(p);
        return "listaProductos";
    }

}
