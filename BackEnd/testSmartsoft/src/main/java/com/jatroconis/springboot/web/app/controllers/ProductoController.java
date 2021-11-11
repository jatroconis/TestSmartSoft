package com.jatroconis.springboot.web.app.controllers;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.ProductoModel;
import com.jatroconis.springboot.web.app.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<ProductoModel> getProducto() {
        return productoService.getProducto();
    }

    @CrossOrigin(origins = "*")
    @PostMapping()
    public ProductoModel saveCliente(@RequestBody ProductoModel producto){
        return this.productoService.saveProducto(producto);
    }

}
