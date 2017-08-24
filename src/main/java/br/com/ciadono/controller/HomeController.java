package br.com.ciadono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ciadono.entity.Aluno;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
		System.out.println("Teste");
		return "login";
	}
	
	@RequestMapping("/aluno/cadastroaluno")
	public String form(){
		return "aluno/cadastroaluno";
	}
	
	@RequestMapping("/cadastrar")
	public String save(Aluno aluno){
		System.out.println("Cadastro de Aluno" + aluno);
		return "/cadastrar/ok";
	}
	
}
