package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Professor;
import com.gerenciador.escolar.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    @GetMapping("/{id}/{cpf}")
    public Professor buscarUm(@PathVariable Long id, @PathVariable Long cpf) {
        return professorService.buscarUm(id,cpf);
    }

    @GetMapping
    public Collection<Professor> buscarTodos() {
        return professorService.buscarTodos();
    }

    @DeleteMapping("/{id}/{cpf}")
    public void deletar(@PathVariable Long id, @PathVariable Long cpf) {
        professorService.deletar(id,cpf);
    }

    @PostMapping
    public void inserir(@RequestBody Professor professor) {
        professorService.salvar(professor);
    }

    @PutMapping
    public void atualizar(@RequestBody  Professor professor) {
        professorService.salvar(professor);
    }
}
