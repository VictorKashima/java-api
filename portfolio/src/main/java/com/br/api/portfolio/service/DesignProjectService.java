package com.br.api.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.br.api.portfolio.model.DesignProject;
import com.br.api.portfolio.repository.DesignProjectRepository;

@Service
public class DesignProjectService {
 
    @Autowired
    private DesignProjectRepository designRepository;

    public ResponseEntity<?> insert(DesignProject designProject) {
        return new ResponseEntity<>(designRepository.save(designProject), HttpStatus.CREATED);
    }

    public ResponseEntity<?> selectAll() {
        return new ResponseEntity<>(designRepository.findAll(), HttpStatus.OK);
    }

}