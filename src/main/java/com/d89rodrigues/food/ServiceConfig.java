package com.d89rodrigues.food;

import org.springframework.context.annotation.Bean;

import com.d89rodrigues.food.di.notificacao.Notificador;
import com.d89rodrigues.food.di.service.AtivacaoClienteService;

/**
 * Para instanciar um bean que foram definidos em outras classes de configuração, basta injetar o parametro @Bean
 * que o Spring tem a inteligencia que um médoto de definição de @Bean recebe como parametro alguma coisa
 * esse parametro pode ser injetado. O container vai identificar que o @Bean já está instanciado.
 */

//@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		//return new AtivacaoClienteService(notificador);
		return new AtivacaoClienteService();
		
	}

}
