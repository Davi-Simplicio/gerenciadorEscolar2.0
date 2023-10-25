package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {
    private final AlunoService alunoService;

    @GetMapping("/{id}/{cpf}")
    public Aluno buscarUm(@PathVariable Long id, @PathVariable Long cpf) {
        return alunoService.buscarUm(id,cpf);
    }

    @GetMapping
    public Collection<Aluno> buscarTodos() {
        return alunoService.buscarTodos();
    }

    @DeleteMapping("/{id}/{cpf}")
    public void deletar(@PathVariable Long id, @PathVariable Long cpf) {
        alunoService.deletar(id, cpf);
    }

    @PostMapping
    public void inserir(@RequestBody Aluno aluno) {
        alunoService.salvar(aluno);
    }

    @PutMapping
    public void atualizar(@RequestBody  Aluno aluno) {
        alunoService.salvar(aluno);
    }
}
