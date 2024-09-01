package com.api.baralho.adpter;



import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.baralho.domain.Baralho;
import com.api.baralho.domain.CompraCartaResponse;


@FeignClient(name = "conexaoApi", url = "https://deckofcardsapi.com/")
public interface BaralhoApiExchange {

	
	@GetMapping("api/deck/new/shuffle/?deck_count=1 ")
	public Optional<Baralho>  CriarBaralho();
	
	
	@GetMapping("api/deck/{deck_id}/draw/?count={count} ")
	public Optional<CompraCartaResponse>  ComprarCarta(@PathVariable("deck_id") String deck_id,
										   			   @PathVariable("count") int count);
	
	
	
	
}
