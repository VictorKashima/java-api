package com.br.api.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/design/")
public class DesignProjectController {

    @GetMapping("insert")
    public String insertDesign() {
        return "Inserir um projeto de design";
    }

}