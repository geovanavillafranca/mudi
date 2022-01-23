package br.alura.mvc.mudi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(HttpServletRequest request) {
		// requisicao que vai rodar apenas com o servidor do spring, passando a variavel nome="Mundo"
		request.setAttribute("nome", "Mundo");
		// Retorna o nome da view: templates/hello.html
		return "hello";
	}

}
