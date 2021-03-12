package com.d89rodrigues.food.di.notificacao;

import org.springframework.stereotype.Component;

import com.d89rodrigues.food.di.modelo.Cliente;

//@Primary Desambiguação do @Bean
//@Qualifier("urgente")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
	
	/*
	 * Iniciando o @Component NotificadorEmail, instanciado e colocado dentro do container(IoC)
	 */
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
