package com.br.api.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.portfolio.model.DesignProject;
import com.br.api.portfolio.service.DesignProjectService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/design/")
public class DesignProjectController {

    @Autowired
    private DesignProjectService designService;

    @GetMapping("insert")
    public String insertDesign() {
        return "Inserir um projeto de design";
    }

    @PostMapping("insert")
    public ResponseEntity<?> insert(@RequestBody DesignProject designProject) {
        return designService.insert(designProject);
    }

    @GetMapping("list")
    public ResponseEntity<?> selectAllDesign() {
        return designService.selectAll();
    }

    @PutMapping("update")
    public ResponseEntity<?> updateById(@RequestBody DesignProject designProject) {
        return designService.updateById(designProject);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return designService.deleteById(id);
    }

}