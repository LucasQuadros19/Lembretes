package com.example.lembrete.lembrete.repository;

import com.example.lembrete.lembrete.entity.Lembrete;
import com.example.lembrete.lembrete.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface LembreteRepository extends JpaRepository<Lembrete,Long> {

    List<Lembrete> findByPessoaNome(String nome);


}


