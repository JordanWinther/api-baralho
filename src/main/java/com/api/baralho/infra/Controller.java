package com.api.baralho.infra;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.baralho.adpter.BaralhoApiAdapter;
import com.api.baralho.aplication.Jogador;
import com.api.baralho.aplication.useCase.BaralhoUseCase;
import com.api.baralho.aplication.useCase.JogoUseCase;
import com.api.baralho.domain.Baralho;
import com.api.baralho.domain.CompraCartaResponse;



@RequestMapping("/api")
@RestController
public class Controller {

	private BaralhoUseCase baralhoUseCase;
	private JogoUseCase jogoUseCase;
	
	 public Controller( BaralhoUseCase baralhoUseCase, JogoUseCase jogoUseCase) {
		
		this.baralhoUseCase = baralhoUseCase;
		this.jogoUseCase = jogoUseCase;
	}
	 
	 

	@PostMapping("/embaralhar")
	    public ResponseEntity<Object> embaralhar(@RequestBody Baralho sender, @RequestParam BigDecimal value) {
		 	return ResponseEntity.status(HttpStatus.OK).build();
	      //return ResponseEntity.status(HttpStatus.OK).body(userService.validation(sender, value)) ; 
	        
	    }
	 
	 	@GetMapping("/criarBaralho")
	    public String criarBaralho() {
	 		return baralhoUseCase.criarBaralho();
		   
	    }
	 
	 	@GetMapping("/comprarCartas")
	    public ResponseEntity<CompraCartaResponse>  comprarCartas(@RequestParam String id, @RequestParam int quantidade) {
	 		CompraCartaResponse cartasResponse = baralhoUseCase.ComprarCarta(id, quantidade);
			return ResponseEntity.status(HttpStatus.OK).body(cartasResponse);
		 	
	     
	        
	    }
	 	
	 	@GetMapping("/jogar")
	    public ResponseEntity<Jogador>  jogar(@RequestParam String id, @RequestParam int quantidade) {
	 		 
			return ResponseEntity.ok(jogoUseCase.jogar(id, quantidade));
		 	
	     
	        
	    }
	 
	 
	 
	 
	 
}
