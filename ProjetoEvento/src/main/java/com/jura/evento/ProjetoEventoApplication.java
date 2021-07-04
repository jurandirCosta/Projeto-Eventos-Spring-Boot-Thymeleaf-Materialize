package com.jura.evento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetoEventoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEventoApplication.class, args);
	}
	
/*	@Bean
	public FixedLocaleContextResolver localeResolver() {
		return new FixedLocaleContextResolver(new Locale("pt", "BR"));
	}*/

}
