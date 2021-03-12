package com.d89rodrigues.food.di.notificacao;

import com.d89rodrigues.food.di.modelo.Cliente;

/**
 * Implementando baseado em interfaces, diminuindo o acoplamento.
 * Alterando a implementação de forma mais rapida e segura, baseada em contratos.
 */
public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}