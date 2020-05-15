package com.mvcdemo.mvcprova;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//aggiungo requestmapping per aggiungere una percorso di base che fa da prefisso a tutti gli end point definiti da questo controller
@RequestMapping("/base")
public class MyController {
	
	// indichiamo che andremo a utilizzare il metodo httpget
	@GetMapping("/saluta")
	public String saluta() {
		return "ciao";
	}
	
	@GetMapping("/saluta2/{nome}")
	public Utente saluta2(@PathVariable("nome") String nome) {
		
		Utente u = new Utente();
		u.setNome(nome);
		return u;
		
	}
}
