package com.api.baralho.aplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.baralho.aplication.Jogador;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Long> {

}
