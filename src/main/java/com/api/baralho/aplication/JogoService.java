package com.api.baralho.aplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.api.baralho.aplication.useCase.BaralhoUseCase;
import com.api.baralho.aplication.useCase.JogoUseCase;
import com.api.baralho.domain.CompraCartaResponse;

@Service
public class JogoService implements JogoUseCase {

	private CompraCartaResponse cartaResponse;
	private BaralhoUseCase useCaseBaralho;
	
	public JogoService(BaralhoUseCase adapter) {
		this.useCaseBaralho = adapter;
	}
	
	
	
	public String criarBaralho() {
		
		return useCaseBaralho.criarBaralho();
	}
	
	
	
	public CompraCartaResponse comprarCartas(String deckId,int quantidadeDeCartas) {
		
		CompraCartaResponse response = useCaseBaralho.ComprarCarta(deckId, quantidadeDeCartas);
		return response;
	}
	
	
	
	public List<Jogador> montarMaos(String deckId,int quantidadeDeCartas) {
		List<Jogador> listaJogador = new ArrayList<>();
		
		for (int i = 1; i < 5; i++) {
			
			CompraCartaResponse response = comprarCartas(deckId, quantidadeDeCartas);
			
			Jogador jogador = new Jogador(response.getCards() );
			listaJogador.add(jogador);
		}
		
		return listaJogador;		
	}
	
	
	
	public Jogador contarPontos(List<Jogador> listaJogador) {
		
		int maiorValor = listaJogador.stream()
									 .mapToInt( j -> j.getTotalPontos())
									 .max()
									 .orElse(0);
		
		List<Jogador> jogadorList = listaJogador.stream()
						  						.filter(j -> j.getTotalPontos() == maiorValor)
						  						.collect(Collectors.toList());
		
		Jogador jogadorGanhador = new Jogador();
		for (Jogador jogador : jogadorList) {
			jogadorGanhador = jogador; 
		}
		return jogadorGanhador;
		
	}

	
	
	public Jogador jogar(String deck_id, int count) {
		
		
		List<Jogador> listaJogador = montarMaos(deck_id, count);
		
		return contarPontos(listaJogador);
		
	}
	
	
	
	

	
}
