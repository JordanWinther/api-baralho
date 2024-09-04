package com.api.baralho.aplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.api.baralho.domain.Carta;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Jogador {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Carta> cartas;
	private Integer totalPontos = 0;
	
	public Jogador(List<Carta> cartas) {
		
		this.cartas = cartas;
		somarTotalPontos();
	}

	public Jogador() {
		
	}
	
	private void somarTotalPontos() {
	
		Map<String, Integer> mapValores = new HashMap<>();
		
		List<String> chaves = Arrays.asList("A","ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J","JACK", "Q","QUEEN", "K","REI","KING");
		List<Integer> valores = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 12, 13, 13, 13);
		
		for (int i = 0; i < chaves.size(); i++) {
			mapValores.put(chaves.get(i), valores.get(i));
		}
		
		//Pesquisa a Chave String no Map, pega o valor inteiro e soma no totalPontos
		for (Carta carta : cartas) {
						
			totalPontos = totalPontos + mapValores.get(carta.getValue());
		}
	}

	
	
	
	public List<Carta> getCartas() {
		return cartas;
	}

	
	
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public int getTotalPontos() {
		return totalPontos;
	}

	
	
	
	
}
