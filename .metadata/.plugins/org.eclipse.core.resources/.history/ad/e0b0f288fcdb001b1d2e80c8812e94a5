package com.jura.evento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jura.evento.model.Evento;

@Controller
@RequestMapping("/eventos")
public class EventoController {

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroEvento";   
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Evento evento) {
		System.out.println(">>>> "  +  evento.getDescricao());
		
		return "CadastroEvento";
	}
	
}
