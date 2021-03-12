package com.d89rodrigues.food.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME) //Indica quanto tempo a annotation deve ficar disponivel, RUNTIME indica que a annotation pode ser lida em tempo de execução
@Qualifier
public @interface TipoDoNotificador {
	
	//value() é o valor padrão quando não é especificado em uma annotation
	NivelUrgencia value();

}
