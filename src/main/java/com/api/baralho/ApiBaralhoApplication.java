package com.api.baralho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiBaralhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBaralhoApplication.class, args);
	}

}
