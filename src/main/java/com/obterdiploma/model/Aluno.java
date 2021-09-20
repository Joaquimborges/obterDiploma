package com.obterdiploma.model;

import lombok.Setter;

import java.util.List;

@Setter
public class Aluno {

    private String nome;
    private String endereco;
    private int idade;
    private List<Disciplina> disciplinas;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Aluno() {
    }

    public Aluno(String nome, String endereco, int idade, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno {" + '\n' +
                "nome: '" + nome + '\n' +
                ", endereco: '" + endereco + '\n' +
                ", idade: " + idade + '\n' +
                ", disciplinas: " + disciplinas +
                '}';
    }
}
