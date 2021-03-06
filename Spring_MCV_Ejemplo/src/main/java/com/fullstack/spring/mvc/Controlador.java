package com.fullstack.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPagina() {
	// /WEB-INF/vista/paginaEjemplo.jsp
	return "paginaEjemplo";
	}
	
	// http://localhost:8080/mostrarFormulario
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() {
		//WEB-INF/vista/formulario-hola.jsp
		return "formulario-hola";
	}
	// http://localhost:8080/procesarFormulario
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		//WEB-INF/vista/hola.jsp
		return "hola";
	}
	}
