package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")
public class BsmController {
	
	@GetMapping
	public String listaBsm() {
		return  "Lista das BSM's: "
				+ "\n\n - Persistência\n"
				+ "\n\n - Proatividade\n"
				+ "\n\n - Comunicação\n"
				+ "\n\n - Trabalho em equipe\n"
				+ "\n\n - Mentalidade de Crescimento\n"
				+ "\n\n - Orientação ao detalhe\n"
				+ "\n\n - Orientação ao futuro\n"
				+ "\n\n - Responsabilidade pessoal\n";
	}
}
