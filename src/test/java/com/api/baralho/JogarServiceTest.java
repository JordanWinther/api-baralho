package com.api.baralho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.api.baralho.aplication.Jogador;
import com.api.baralho.aplication.JogoService;
import com.api.baralho.aplication.useCase.BaralhoUseCase;
import com.api.baralho.domain.Carta;
import com.api.baralho.domain.CompraCartaResponse;

public class JogarServiceTest {

	@Mock
	private Carta carta1;
	
	@Mock
	private Carta carta2;
	
	@Mock
	private Carta carta3;
	
	@Mock
	private Carta carta4;
	
	@Mock
	private Carta carta5;
	
	@Mock
    private BaralhoUseCase baralhoUseCase;
	
	@InjectMocks
	private JogoService jogoService;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void jogarTeste() {
		
		when(carta1.getValue()).thenReturn("KING");
        when(carta2.getValue()).thenReturn("K");
        when(carta3.getValue()).thenReturn("5");
        when(carta4.getValue()).thenReturn("Q");
        when(carta5.getValue()).thenReturn("2");
		
        List<Carta> listaDeCartas = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
        
        CompraCartaResponse response = new CompraCartaResponse();
        response.setCards(listaDeCartas);
        
        when(baralhoUseCase.ComprarCarta(anyString(), anyInt())).thenReturn(response);
        
		Jogador jogador = jogoService.jogar("String", 5);
		
		assertEquals(45, jogador.getTotalPontos());
	}

	@Test
    public void testContarPontos() {
        //Fiz sem o uso do Mokito
        Carta carta1 = new Carta();
        carta1.setValue("A");
        Carta carta2 = new Carta();
        carta2.setValue("K");

        List<Carta> cartas1 = Arrays.asList(carta1, carta2);
        Jogador jogador1 = new Jogador(cartas1);

        Carta carta3 = new Carta();
        carta3.setValue("5");
        Carta carta4 = new Carta();
        carta4.setValue("Q");

        List<Carta> cartas2 = Arrays.asList(carta3, carta4);
        Jogador jogador2 = new Jogador(cartas2);

        List<Jogador> jogadores = Arrays.asList(jogador1, jogador2);

        Jogador jogadorGanhador = jogoService.contarPontos(jogadores);

        assertEquals(jogador2, jogadorGanhador);
    }
	
	
	
	
}