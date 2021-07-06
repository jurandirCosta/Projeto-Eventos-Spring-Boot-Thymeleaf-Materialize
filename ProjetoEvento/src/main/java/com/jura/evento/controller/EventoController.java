package com.jura.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jura.evento.model.Evento;
import com.jura.evento.repository.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventoController {
	
	private static final String CADASTRO_VIEW = "CadastroEvento";
	
	@Autowired
	private EventoRepository eventoRepository;

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
		mv.addObject(new Evento());
		return mv;   
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(@Validated Evento evento, BindingResult bindingResult, RedirectAttributes attributes ) {
		  if(bindingResult.hasErrors()) {
			  return CADASTRO_VIEW;
		  }

		eventoRepository.save(evento);
		attributes.addFlashAttribute("mensagem", "Evento salvo com sucesso !");
		return "redirect:/eventos/novo";
	}
	
	@RequestMapping
	public ModelAndView pesquisar(){
		List<Evento> todosEventos = eventoRepository.findAll();
		ModelAndView mv = new ModelAndView("listaEventos");
		mv.addObject("eventos", todosEventos);
		return mv;
	}

//  ESTE MÉTODO NÃO FUNCIONOU	
//	@RequestMapping("{codigo}")
//	public ModelAndView edicao(@PathVariable Long codigo) {
//		Optional<Evento> evento = eventoRepository.findById(codigo);
//		ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
//		mv.addObject(evento);
//		return mv;
//	}
	
//		ESTE MÉTODO FUNCIONA COM SPRINGBOOT 2.4.8 JAVA 11	
	  @RequestMapping(value="{codigo}")
	  public ModelAndView editar(@PathVariable("codigo") Evento evento) {
	  ModelAndView modelAndView = new ModelAndView(CADASTRO_VIEW);
	  modelAndView.addObject(evento);
	  return modelAndView;
	  }
	
	
}
