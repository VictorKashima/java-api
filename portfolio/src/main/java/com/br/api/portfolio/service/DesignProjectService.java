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

    public ResponseEntity<?> updateById(DesignProject designProject) {
        if(designRepository.countById(designProject.getId()) == 0) {
            return new ResponseEntity<>("Projeto não encontrado", HttpStatus.NOT_FOUND);
        } else if(designProject.getName().equals("")) {
            return new ResponseEntity<>("Informe um nome", HttpStatus.BAD_REQUEST);
        } else if(designProject.getDescription().equals("")) {
            return new ResponseEntity<>("Adicione uma descrição", HttpStatus.BAD_REQUEST);
        } else if(designProject.getLink().equals("")) {
            return new ResponseEntity<>("Adicione um link", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(designRepository.save(designProject), HttpStatus.OK);
        }
    }   

}