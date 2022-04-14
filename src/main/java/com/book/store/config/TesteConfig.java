package com.book.store.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.book.store.service.DbService;

@Configuration
@Profile("teste")
public class TesteConfig {
	@Autowired
	private DbService dbService;
	
	@Bean
	public void instanciaDataBase() {
		this.dbService.instanciaDataBase();
	}
}
