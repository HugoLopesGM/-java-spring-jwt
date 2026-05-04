package com.aula.demo.service;

import com.aula.demo.model.PessoaModel;
import com.aula.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public List<PessoaModel> findAll(){
        return repository.findAll();
    }

    public PessoaModel save(PessoaModel pessoaModel){
        return repository.save(pessoaModel);
    }
}
