package com.antunesicaro.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antunesicaro.springboot.entities.User;

//aqui ficam os controladores rest,essa é a camada de recursos.
//mapeia endpoints de API para métodos específicos que serão executados quando uma requisição HTTP correspondente for recebida
//dependem da camada de serviço, e a camada de serviço depende da camada de acesso à dados(data repositories).

// indica que se trata de um controlador REST e para facilitar o mapeamento dos endpoints
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//método de endpoint para acessar os usuarios
	
	//ResponseEntity retorna respostas de requisições web , ai no caso uso o generics pra garantir q essa resposta será do tipo User, Isso significa que o método findAll() retornará um ResponseEntity que encapsula um objeto User.
	// o ResponseEntity é um generics, ai vai ser do tipo classe User
	//@GetMapping:indica que esse método será executado quando houver uma requisição HTTP GET para a rota especificada. No caso, a rota é /, o que significa que esse método será executado quando o endpoint raiz do controlador for acessado.
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","Maria@gmail.com","9999999","12345");
		
		return ResponseEntity.ok().body(u);
	}
}
