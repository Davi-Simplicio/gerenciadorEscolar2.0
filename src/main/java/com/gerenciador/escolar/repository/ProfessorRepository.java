package com.gerenciador.escolar.repository;

import com.gerenciador.escolar.model.Professor;
import com.gerenciador.escolar.model.UsuarioIdClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, UsuarioIdClass> {
}
