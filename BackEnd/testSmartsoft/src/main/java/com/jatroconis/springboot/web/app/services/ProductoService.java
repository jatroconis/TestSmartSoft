package com.jatroconis.springboot.web.app.services;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.ProductoModel;
import com.jatroconis.springboot.web.app.repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> getProducto(){
        return (ArrayList <ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel saveProducto (ProductoModel producto){
        return productoRepository.save(producto);
    }

    
}
