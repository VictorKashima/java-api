package com.br.api.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.portfolio.service.DesignProjectService;

@RestController
@RequestMapping("/design/")
public class DesignProjectController {

    @Autowired
    private DesignProjectService designService;

    @GetMapping("insert")
    public String insertDesign() {
        return "Inserir um projeto de design";
    }

    @GetMapping("list")
    public ResponseEntity<?> selectAllDesign() {
        return designService.selectAll();
    }

}