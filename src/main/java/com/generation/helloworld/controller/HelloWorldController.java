package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//determinando que essa classe será uma classe controladora através da anotação
@RestController

//determinando que essa classe irá receber requisições e protocolos http
//determinando o endereço(endpoint) para ser mapeado
@RequestMapping("/hello-world")

public class HelloWorldController {
	
	@GetMapping //determinando que esse método faz parte de uma requisição GET(Buscando a informação)
	public String helloWorld() {
		return "Hello World!";
	}
}
