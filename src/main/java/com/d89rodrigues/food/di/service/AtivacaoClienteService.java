package com.d89rodrigues.food.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.d89rodrigues.food.di.modelo.Cliente;
import com.d89rodrigues.food.di.notificacao.NivelUrgencia;
import com.d89rodrigues.food.di.notificacao.Notificador;
import com.d89rodrigues.food.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	
	
	//@Qualifier("urgente") // @Qualifier("sms")
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	//private List<Notificador> notificadores;
    
    /**
     * Uma dos formas de injeção de dependencia é criando um construtor e 
     * como parametro um objeto de um tipo que é gerenciado pelo Spring. 
     * O objeto precisa ser um @Component, um bean gerenciavel.
     * Iniciando o @Component AtivacaoClienteService, instanciado e colocado  dentro do container(Ioc).
     * 
     * Pontos de injeção: Ideal é ser usado no construtor pq deixa claro quando for instanciar quais são as dependencias da classe.
     *                    Na maioria dos casos é usado no construtor e no atributo.
     * 
     * @Autowired no construtor: Define qual construtor será injetado e usado, quando existe mais de 1 construtor e o construtor padrão
     * não está implementado. Ponto de injeção do construtor.
     * 
     * @Autowired no método set é um ponto de injeção via método.
     * 
     * @Autowired no atributo é um ponto de injeção mesmo ele sendo privado, dificulta os testes pelo fato do atributo ser privado.
     * 
     * @Autowired(required = false): Não possui dependencia obrigatoria, dependencia opcional em algumas vezes pode ser interessante,
     * como no caso se não haver um @Component para a classe notificador.
     * 
     * Ambiguidade de @Beans: Spring não tem a inteligencia para escolher entre 2 @Beans que implementam a mesma interface.
     * Desambiguação de @Beans: 
     * 		1º: Criando uma lista de @Beans: Executa todas as implementações disponiveis.
     *      2º: Dentro da definição do @Bean dar maior prioridade @Primary para o escolhido.
     *      3º: @Qualifier: Annotations para qualificar o componente usando algum identificador, exemplo @Qualifier("ligacaoEntreOs@Beans"), 
     *      				tomando cuidado com o nome de ligação para não deixar o acoplamento alto.
     *      				Problemas: Identificador é uma String e não é checada em tempo de compilação e sim em tempo de execução.
//     *      4º: Annotations customizadas: Criando uma annotation e um enum para definir os niveis de urgência, a annotation precisa ser um @Qualifier.
 * 											Solução mais elegante.
     * 
     */
   
   	/*@Autowired
   	public AtivacaoClienteService(Notificador notificador) {
    	this.notificador = notificador;
	} 
    
    public AtivacaoClienteService(String qualquer) {
    	
    }*/

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cliente está ativo!");
		
		/* Executando uma lista de @Beans, desambiguação.
		for(Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cliente está ativo!");
		}*/
		
		/* Exemplo de @Autowired(required = false)
		if(notificador != null) {
			this.notificador.notificar(cliente, "Seu cliente está ativo!");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado!");
		}
		*/
			
		
	}

	/*@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}*/
	
}
