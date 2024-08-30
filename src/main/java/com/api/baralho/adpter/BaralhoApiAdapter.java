package com.api.baralho.adpter;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.api.baralho.aplication.BaralhoUseCase;
import com.api.baralho.domain.Baralho;

@Component
public class BaralhoApiAdapter  implements BaralhoUseCase {

	private BaralhoApiExchange apiExchange;

	public BaralhoApiAdapter(BaralhoApiExchange apiExchange) {
		super();
		this.apiExchange = apiExchange;
	}
	
	
	public void criarBaralho() {
		Optional<Baralho> baralho = apiExchange.CriarBaralho();
		String id =	baralho.get().getDeck_id();
	}
	

}
