package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivosSemana() {
		return "Aprendizado para semana: "
				+ "\n\n Para essa semana pretendo focar em:\n"
				+ "\n\n - Expressões lambda e stream em Java\n"
				+ "\n\n - Tabelas relacionais em SQL e Diagrama DER\n"
				+ "\n\n - Conceito de API Rest utilizando Spring boot\n";	
	}
}
