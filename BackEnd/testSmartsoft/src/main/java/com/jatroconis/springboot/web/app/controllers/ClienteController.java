package com.jatroconis.springboot.web.app.controllers;

import java.util.ArrayList;

import com.jatroconis.springboot.web.app.models.ClienteModel;
import com.jatroconis.springboot.web.app.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<ClienteModel> getClientes() {
        return clienteService.getCliente();
    }

    @CrossOrigin(origins = "*")
    @PostMapping()
    public ClienteModel saveCliente(@RequestBody ClienteModel cliente){
        return this.clienteService.saveCliente(cliente);
    }


}
