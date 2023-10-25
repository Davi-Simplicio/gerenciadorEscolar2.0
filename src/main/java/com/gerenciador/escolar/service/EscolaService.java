package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Curso;
import com.gerenciador.escolar.model.Escola;
import com.gerenciador.escolar.repository.CursoRepository;
import com.gerenciador.escolar.repository.EscolaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EscolaService {
    private EscolaRepository escolaRepository;

    public void salvar(Escola escola){
        escolaRepository.save(escola);
    }
    public void deletar(Long id){
        escolaRepository.deleteById(id);
    }
    public Collection<Escola> buscarTodos(){
        return escolaRepository.findAll();
    }
    public Escola buscarUm(Long id){
        return escolaRepository.findById(id).get();
    }
}
