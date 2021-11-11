package com.jatroconis.springboot.web.app.services;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.FacturaModel;
import com.jatroconis.springboot.web.app.repositories.FacturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    public ArrayList<FacturaModel> getFactura(){
        return (ArrayList <FacturaModel>) facturaRepository.findAll();
    }

    public FacturaModel saveFactura (FacturaModel factura){
        return facturaRepository.save(factura);
    }
    
}
