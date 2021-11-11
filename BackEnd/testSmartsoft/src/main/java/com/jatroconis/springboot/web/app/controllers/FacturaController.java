package com.jatroconis.springboot.web.app.controllers;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.data.FacturaData;
import com.jatroconis.springboot.web.app.models.FacturaModel;
import com.jatroconis.springboot.web.app.services.ClienteService;
import com.jatroconis.springboot.web.app.services.DetalleService;
import com.jatroconis.springboot.web.app.services.FacturaService;
import com.jatroconis.springboot.web.app.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    FacturaService facturaService;
    
    @Autowired
    ClienteService clienteService;
    
    @Autowired
    ProductoService productoService;
    
    @Autowired
    DetalleService detalleService;
    

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<FacturaModel> getFactura() {
        return facturaService.getFactura();
    }
    

    @CrossOrigin(origins = "*")
    @PostMapping()
    public FacturaData saveFactura(@RequestBody FacturaData factura){
    	
    	System.out.println(factura.getFactura().getFecha());
    	
    	productoService.saveProducto(factura.getProducto());
    	
    	
    	detalleService.saveDetalle(factura.getDetalle()); 
    	
    	//clienteService.saveCliente(factura.getCliente());	
    	facturaService.saveFactura(new FacturaModel(clienteService.getCliente().get(factura.getIdClient()), factura.getFactura().getFecha() ));
    	
        return factura ;
    }

    
}
