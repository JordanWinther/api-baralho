package com.api.baralho.aplication.Exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;



@RestControllerAdvice()
public class HandlerException {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiErrorRecord> genericException(Exception e){
		
		HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		if (e instanceof ResponseStatusException) {
			httpStatus =  (HttpStatus) ((ResponseStatusException) e).getStatusCode();
		}
		 ApiErrorRecord record = new ApiErrorRecord(LocalDateTime.now(), 
													httpStatus.value(),
													httpStatus.name() ,
													List.of(e.getMessage()) );
		 
		 return ResponseEntity.ok(record);
	}
	
}
