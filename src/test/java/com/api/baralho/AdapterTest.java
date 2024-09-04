package com.api.baralho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.api.baralho.adpter.BaralhoApiAdapter;
import com.api.baralho.adpter.BaralhoApiExchange;
import com.api.baralho.aplication.Exception.ConexaoFailException;
import com.api.baralho.domain.Baralho;
import com.api.baralho.domain.CompraCartaResponse;

public class AdapterTest {

	
    @Mock
    private BaralhoApiExchange apiExchange;

    @InjectMocks
    private BaralhoApiAdapter adapter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCriarBaralho_Success() {
        Baralho baralho = new Baralho();
        baralho.setDeck_id("teste-deck-id");
        when(apiExchange.CriarBaralho()).thenReturn(Optional.of(baralho));

        String deckId = adapter.criarBaralho();

        assertEquals("teste-deck-id", deckId);
        verify(apiExchange, times(1)).CriarBaralho();
    }

    @Test
    public void testCriarBaralho_Falha() {
        when(apiExchange.CriarBaralho()).thenReturn(Optional.empty());

        assertThrows(ConexaoFailException.class, () -> {
            adapter.criarBaralho();
        });
        verify(apiExchange, times(1)).CriarBaralho();
    }

    @Test
    public void ComprarCarta_Success() {
        
        CompraCartaResponse response = new CompraCartaResponse();
        when(apiExchange.ComprarCarta("test-deck-id", 5)).thenReturn(Optional.of(response));

        
        CompraCartaResponse result = adapter.ComprarCarta("teste-deck-id", 5);

        
        assertEquals(response, result);
        verify(apiExchange, times(1)).ComprarCarta("teste-deck-id", 5);
    }
}
