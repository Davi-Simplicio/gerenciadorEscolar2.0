package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Professor;
import com.gerenciador.escolar.model.UsuarioIdClass;
import com.gerenciador.escolar.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public Professor buscarUm(Long id,Long cpf) {
        Optional<Professor> professorOptional = professorRepository.findById(new UsuarioIdClass(id,cpf));
        return professorOptional.get();
    }

    public Collection<Professor> buscarTodos() {
        return professorRepository.findAll();
    }

    public void deletar(Long id,Long cpf) {
        professorRepository.deleteById(new UsuarioIdClass(id,cpf));
    }

    public void salvar(Professor professor) {
        professorRepository.save(professor);
    }
}
