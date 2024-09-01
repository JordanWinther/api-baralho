package com.api.baralho.aplication;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.api.baralho.domain.CompraCartaResponse;

public interface BaralhoUseCase {

	String criarBaralho();
	
	 CompraCartaResponse ComprarCarta( String deck_id, int count);
	
	
}
