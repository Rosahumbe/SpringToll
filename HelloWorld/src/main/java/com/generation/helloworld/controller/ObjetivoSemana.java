package com.generation.helloworld.controller;
	
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.GetMapping;

	@RestController
	@RequestMapping("/objetivo")


	public class ObjetivoSemana {
		@GetMapping
		public String objetivoSemana() {
			return "Objetivo da semana"
					+ " \n - Fazer o blog pessoal e o marktplace em equipe"
					+ "\n - Usar o spring tool e o Insomnia"
					+ "\n - Fazer tabelas no sql";
		}

}
