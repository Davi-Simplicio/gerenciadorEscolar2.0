package com.gerenciador.escolar.repository;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.model.UsuarioIdClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UsuarioIdClass> {
}
