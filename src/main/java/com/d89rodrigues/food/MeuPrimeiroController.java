package com.d89rodrigues.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d89rodrigues.food.di.modelo.Cliente;
import com.d89rodrigues.food.di.service.AtivacaoClienteService;

/**
 * Anotação @Controller
 * identifica que a classe é responsavel por
 * receber e responder requisições web. 
 * Anotação do Spring
 */

@Controller //Meta annotation, tabém é um bean. 
public class MeuPrimeiroController {
	
	//Injetando a dependencia no controller
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
	}



	@GetMapping("/hello") //Identifica o caminho
	@ResponseBody  //Indica que o retorno é devolvido como resposta da requisição
	public String hello() {
		Cliente joao = new Cliente("João", "joao@xyz.com", "34999999999");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello";
	}
}
