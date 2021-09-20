package com.obterdiploma.model;

import lombok.Setter;

@Setter
public class Disciplina {

    private String nome;
    private Double nota;

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    public Disciplina() {
    }

    public Disciplina(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" + '\n' +
                "nome: '" + nome + '\n' +
                ", nota: " + nota +
                '}';
    }
}
