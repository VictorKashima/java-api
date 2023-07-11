package com.br.api.portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.api.portfolio.model.DesignProject;

public interface DesignProjectRepository extends CrudRepository<DesignProject, Integer>{

    

}