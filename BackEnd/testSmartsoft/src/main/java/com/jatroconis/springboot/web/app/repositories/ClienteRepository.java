package com.jatroconis.springboot.web.app.repositories;

import com.jatroconis.springboot.web.app.models.ClienteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {

}
