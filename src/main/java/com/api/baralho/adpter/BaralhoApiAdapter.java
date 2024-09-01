package com.api.baralho.adpter;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.api.baralho.aplication.BaralhoUseCase;
import com.api.baralho.aplication.Exception.ConexaoFailException;
import com.api.baralho.domain.Baralho;
import com.api.baralho.domain.CompraCartaResponse;

@Component
public class BaralhoApiAdapter  implements BaralhoUseCase {

	private BaralhoApiExchange apiExchange;

	public BaralhoApiAdapter(BaralhoApiExchange apiExchange) {
		super();
		this.apiExchange = apiExchange;
	}
	
	
	public String criarBaralho() {
		Optional<Baralho> baralho = apiExchange.CriarBaralho();
		return	baralho.orElseThrow(() -> new ConexaoFailException("")).getDeck_id();
	}
	
	public CompraCartaResponse  ComprarCarta(String deck_id, int qtdCartas){
		return apiExchange.ComprarCarta(deck_id, qtdCartas).orElseThrow(() -> new ConexaoFailException("Erro ao conectar com api")) ;
		
		
	}

}
