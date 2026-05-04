package com.aula.demo.model;

import jakarta.persistence.*;
@Entity
@Table(name = "tb_pessoa")
public class PessoaModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;

        public PessoaModel(){
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

