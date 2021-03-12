package com.d89rodrigues.food;

import org.springframework.context.annotation.Bean;

import com.d89rodrigues.food.di.notificacao.Notificador;
import com.d89rodrigues.food.di.notificacao.NotificadorEmail;
import com.d89rodrigues.food.di.service.AtivacaoClienteService;

/**
 * @Configuration é uma classe de configuração. É um @Component Spring com o objetivo servir para a definição de outros beans.
 * @Bean indica que o método instancia, configura e inicializa um novo objeto que será gerenciado pelo container Spring.
 * 
 * Vantagem: Usando uma classe de configuração você tira da classe que injetaria @Component a 
 * dependencia com o Spring framework e a classe passa a ser pura. Mais simples quando tem uma configuração
 * extra na instanciação da classe.
 */
//@Configuration
public class FoodConfig {
	
	@Bean
	public Notificador notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail();
				
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		//return new AtivacaoClienteService(notificadorEmail());
		return new AtivacaoClienteService();
		
	}

}
