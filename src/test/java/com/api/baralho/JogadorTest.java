package com.api.baralho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.api.baralho.aplication.Jogador;
import com.api.baralho.domain.Carta;

public class JogadorTest {

	
	 	@Mock
	    private Carta cartaMock1;

	    @Mock
	    private Carta cartaMock2;

	    @Mock
	    private Carta cartaMock3;

	    @Mock
	    private Carta cartaMock4;

	    @Mock
	    private Carta cartaMock5;

	    @BeforeEach
	    public void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    public void testSomarTotalPontos() {
	        when(cartaMock1.getValue()).thenReturn("KING");
	        when(cartaMock2.getValue()).thenReturn("K");
	        when(cartaMock3.getValue()).thenReturn("5");
	        when(cartaMock4.getValue()).thenReturn("Q");
	        when(cartaMock5.getValue()).thenReturn("2");

	        List<Carta> cartas = Arrays.asList(cartaMock1, cartaMock2, cartaMock3, cartaMock4, cartaMock5);

	        Jogador jogador = new Jogador(cartas);

	        // Verificar se a soma dos pontos é correta
	        assertEquals(45, jogador.getTotalPontos());
	    }
	    
	    
	    
	    
}
