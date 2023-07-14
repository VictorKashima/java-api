package com.br.api.portfolio.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.api.portfolio.model.DesignProject;

public interface DesignProjectRepository extends CrudRepository<DesignProject, Integer>{

    int countById(int id);

}