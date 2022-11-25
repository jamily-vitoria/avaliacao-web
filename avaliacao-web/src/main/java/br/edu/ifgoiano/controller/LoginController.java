package br.edu.ifgoiano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping(value = "/login")
	public String abrirLogin()
	{
		return "login";
	}

}
