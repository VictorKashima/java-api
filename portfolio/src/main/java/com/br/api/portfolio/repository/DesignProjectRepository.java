package com.br.api.portfolio.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.api.portfolio.model.DesignProject;

public interface DesignProjectRepository extends CrudRepository<DesignProject, Integer>{

    DesignProject findById(int id);

    int countById(int id);

}