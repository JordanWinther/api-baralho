package com.api.baralho.aplication;



import com.api.baralho.domain.CompraCartaResponse;

public interface BaralhoUseCase {

	String criarBaralho();
	
	 CompraCartaResponse ComprarCarta( String deck_id, int count);
	 
	
	
	
}
