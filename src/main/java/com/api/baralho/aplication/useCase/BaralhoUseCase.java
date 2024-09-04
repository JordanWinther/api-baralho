package com.api.baralho.aplication.useCase;



import com.api.baralho.domain.Baralho;
import com.api.baralho.domain.CompraCartaResponse;

public interface BaralhoUseCase {

	Baralho criarBaralho();
	
	 CompraCartaResponse ComprarCarta( String deck_id, int count);
	 
	
	
	
}
