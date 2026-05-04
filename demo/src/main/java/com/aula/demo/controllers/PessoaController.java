package com.aula.demo.controllers;

import com.aula.demo.model.PessoaModel;
import com.aula.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/pessoa")
@RestController
public class PessoaController {
    @Autowired
    private PessoaService service;

    @GetMapping
    public List<PessoaModel>findAll(){
        return service.findAll();
    }

    @PostMapping
    public PessoaModel save(@RequestBody PessoaModel pessoaModel ){
        return  service.save(pessoaModel);
    }
}
