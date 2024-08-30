package com.api.baralho.adpter;



import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.api.baralho.domain.Baralho;


@FeignClient(name = "conexaoApi", url = "https://deckofcardsapi.com/")
public interface BaralhoApiExchange {

	
	@GetMapping("api/deck/new/shuffle/?deck_count=1 ")
	public Optional<Baralho>  CriarBaralho();
}
