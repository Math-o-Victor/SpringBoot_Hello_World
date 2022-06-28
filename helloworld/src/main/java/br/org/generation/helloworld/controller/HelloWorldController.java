package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!!";
	}
	
	@GetMapping(value={"/bsms"})
	public String bsms() {
		return "==========================="
				+ "\nBSM's da Generation Brasil"
				+"\n==========================="
				+"\nMentalidades"
				+"\n---------------------------"
				+"\nOrientação ao futuro"
				+"\nResponsabilidade Pessoal"
				+"\nPersistência"
				+"\nMentalidade de Crescimento"
				+"\n==========================="
				+"\nHabilidades"
				+"\n---------------------------"
				+"\nComunicação"
				+"\nProatividade"
				+"\nAtenção aos Detalhes"
				+"\nTrabalho em Equipe"
				+"\n============================";
	}
	
	@RequestMapping(value={"/objetivos"})
	public String objetivos() {
		return "===================================\r\n"
				+ "Objetivos de aprendizagem da Semana\r\n"
				+ "===================================\r\n"
				+ "1. SpringBoot\r\n"
				+ "2. Java (Pratica)\r\n"
				+ "3. SQL \r\n"
				+ "4. Unity3D\r\n"
				+ "5. Francês\r\n"
				+ "===================================";
	}
}
