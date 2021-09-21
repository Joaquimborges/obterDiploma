package com.obterdiploma.controller;

import com.obterdiploma.model.Aluno;
import com.obterdiploma.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("aluno/")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastra")
    public ResponseEntity<Boolean> cadastrar(@RequestBody Aluno aluno) {
        return new ResponseEntity<>(alunoService.cadastra(aluno), HttpStatus.CREATED) ;
    }

    @GetMapping("/listarAlunos")
    public List<Aluno> listarAlunos() {
        return alunoService.retornaAlunos();
    }

    @GetMapping("/getAluno/{nome}")
    public Aluno getAluno(@PathVariable String nome){
        return alunoService.getAluno(nome);
    }

    @GetMapping("/remover/{nome}")
    public Boolean deleteAluno(@PathVariable String nome) {
        return alunoService.removerAluno(nome);
    }

    @PutMapping("/edit")
    public Boolean editAluno (@RequestBody Aluno aluno) {
        return alunoService.alterarAluno(aluno);
    }

    @GetMapping("/obterMedia/{nome}")
    public String obterMedia(@PathVariable String nome) {
        return alunoService.diploma(nome);
    }
}
