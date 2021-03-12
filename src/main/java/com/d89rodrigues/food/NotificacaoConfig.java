package com.d89rodrigues.food;

import org.springframework.context.annotation.Bean;

import com.d89rodrigues.food.di.notificacao.Notificador;
import com.d89rodrigues.food.di.notificacao.NotificadorEmail;

/**
 * 
 * Você pode ter várias classes de @Configuration.
 *
 */

//@Configuration
public class NotificacaoConfig {
	
	@Bean
	public Notificador notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail();
			
		return notificador;
	}

}
