package com.example.sistemapos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SistemaposApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaposApplication.class, args);
	}

}
