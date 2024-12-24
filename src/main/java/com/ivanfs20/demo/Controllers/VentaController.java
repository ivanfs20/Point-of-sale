package com.ivanfs20.demo.Controllers;

import com.ivanfs20.demo.Services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Venta")
public class VentaController {
    @Autowired
    private VentasService ventasService;

    @GetMapping("/registrar")
    public String crearVenta(){
        return "vender";
    }

    @GetMapping("/inicio")
    public String irInicio(){
        return "index";
    }
}
