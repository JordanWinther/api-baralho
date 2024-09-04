package com.api.baralho.aplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.baralho.aplication.Jogador;
import com.api.baralho.domain.Baralho;

@Repository
public interface BaralhoRepository extends CrudRepository<Baralho, Long> {

}
