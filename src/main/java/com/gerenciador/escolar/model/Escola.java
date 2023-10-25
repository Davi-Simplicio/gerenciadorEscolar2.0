package com.gerenciador.escolar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    private String email;
    @OneToMany(mappedBy = "escola")
    private Set<Professor> professores;
    @OneToMany
    private Set<Curso> cursos;
    @OneToOne(mappedBy = "escola")
    private Diretor diretor;

}
