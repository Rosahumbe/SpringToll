package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/lista-bsm")

public class bsnController {
	@GetMapping
	public String listabsm () {
				return "norientação ao futuro"
						+ "\ntrabalho em equipe"
						+ "\nresponsabilidade pessoal"
						+ "\natenção ao detalhes"
						+ "\nmentalidade de crescimento"
						+ "\nproatividade"
						+ "\npersistencia"
						+ "\ncomunicação";
		
	
	}
	

}
