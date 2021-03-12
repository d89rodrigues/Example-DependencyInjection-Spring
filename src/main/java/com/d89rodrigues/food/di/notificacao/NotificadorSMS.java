package com.d89rodrigues.food.di.notificacao;

import org.springframework.stereotype.Component;

import com.d89rodrigues.food.di.modelo.Cliente;

//@Qualifier("normal")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	/*
	 * Iniciando o @Component NotificadorSMS, instanciado e colocado dentro do container(IoC)
	 */
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
