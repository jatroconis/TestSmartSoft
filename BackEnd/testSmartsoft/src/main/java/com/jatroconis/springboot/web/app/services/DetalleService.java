package com.jatroconis.springboot.web.app.services;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.DetalleModel;
import com.jatroconis.springboot.web.app.repositories.DetalleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DetalleService {

    @Autowired
    DetalleRepository detalleRepository;

    public ArrayList<DetalleModel> getDetalle(){
        return (ArrayList <DetalleModel>) detalleRepository.findAll();
    }

    public DetalleModel saveDetalle (DetalleModel detalle){
        return detalleRepository.save(detalle);
    }

    
}
