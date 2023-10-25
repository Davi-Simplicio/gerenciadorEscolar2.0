package com.gerenciador.escolar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(UsuarioIdClass.class)

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Id
    private Long cpf;
    @Column(unique = true)
    private String nome;
    private String email;
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

}
