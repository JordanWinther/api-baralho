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
import com.api.baralho.aplication.BaralhoUseCase;
import com.api.baralho.domain.Baralho;



@RequestMapping("/api")
@RestController
public class Controller {

	private BaralhoUseCase baralhoUseCase;
	
	 public Controller( BaralhoUseCase baralhoUseCase) {
		
		this.baralhoUseCase = baralhoUseCase;
	}
	 
	 

	@PostMapping("/embaralhar")
	    public ResponseEntity<Object> embaralhar(@RequestBody Baralho sender, @RequestParam BigDecimal value) {
		 	return ResponseEntity.status(HttpStatus.OK).build();
	      //return ResponseEntity.status(HttpStatus.OK).body(userService.validation(sender, value)) ; 
	        
	    }
	 
	 	@GetMapping("/criarBaralho")
	    public void criarBaralho() {
	 		baralhoUseCase.criarBaralho();
		 	
	     
	        
	    }
	 
	 
	 
	 
	 
	 
	 
}
