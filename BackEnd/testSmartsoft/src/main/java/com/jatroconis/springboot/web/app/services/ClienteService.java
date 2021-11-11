package com.jatroconis.springboot.web.app.services;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.ClienteModel;
import com.jatroconis.springboot.web.app.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> getCliente(){
        return (ArrayList <ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel saveCliente (ClienteModel cliente){
        return clienteRepository.save(cliente);
    }
    
    
}
