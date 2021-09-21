package com.obterdiploma.service;

import com.obterdiploma.model.Aluno;
import com.obterdiploma.model.Disciplina;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Setter
public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();


    public boolean cadastra(Aluno aluno) {
        return alunos.add(aluno);
    }

    public List< Aluno> retornaAlunos() {
        return alunos;
    }

    public Aluno getAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public String diploma(String nome) {
       double media;
       double totalNotas = 0;
       Aluno aluno1 = getAluno(nome);
       for (Disciplina disciplina : aluno1.getDisciplinas()) {
           totalNotas += disciplina.getNota();
       }
       media = totalNotas / aluno1.getDisciplinas().size();
       if (media > 9) {
           return "PARABENS!! \n" + aluno1.getNome() + " \n" + aluno1.getDisciplinas();
       }
      return "Tenta novamente";
    }

    public boolean removerAluno(String nome) {
        return alunos.removeIf(aluno -> aluno.getNome().equals(nome));
    }

    public Boolean alterarAluno(Aluno aluno) {
      for (int i = 0; i < alunos.size(); i++) {
          Aluno aluno1 = alunos.get(i);
          if (aluno1.getNome().equals(aluno.getNome())) {
            alunos.set(i, aluno);
            return true;
          }
      }
        return false;

    }




}
