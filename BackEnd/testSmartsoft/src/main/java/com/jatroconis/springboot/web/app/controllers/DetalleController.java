package com.jatroconis.springboot.web.app.controllers;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.DetalleModel;
import com.jatroconis.springboot.web.app.services.DetalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalle")
public class DetalleController {
    
    @Autowired
    DetalleService detalleService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<DetalleModel> getDetalle() {
        return detalleService.getDetalle();
    }

    @CrossOrigin(origins = "*")
    @PostMapping()
    public DetalleModel saveDetalle(@RequestBody DetalleModel detalle){
        return this.detalleService.saveDetalle(detalle);
    }

}
