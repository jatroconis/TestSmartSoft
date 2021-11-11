package com.jatroconis.springboot.web.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jatroconis.springboot.web.app.models.FacturaModel;

@Repository
public interface FacturaRepository extends CrudRepository <FacturaModel, Long> {
    
}
