package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Curso;
import com.gerenciador.escolar.repository.CursoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class CursoService {
    private CursoRepository cursoRepository;

    public void salvar(Curso curso) {
        cursoRepository.save(curso);
    }

    public void deletar(Long id) {
        cursoRepository.deleteById(id);
    }

    public Collection<Curso> buscarTodos() {
        return cursoRepository.findAll();
    }

    public Curso buscarUm(Long id) {
        return cursoRepository.findById(id).get();
    }
}
