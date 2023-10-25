package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Curso;
import com.gerenciador.escolar.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/curso")
public class CursoController {
    private final CursoService cursoService;

    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Long id) {
        return cursoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Curso> buscarTodos() {
        return cursoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        cursoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Curso curso) {
        cursoService.salvar(curso);
    }

    @PutMapping
    public void atualizar(@RequestBody Curso curso) {
        cursoService.salvar(curso);
    }
}
