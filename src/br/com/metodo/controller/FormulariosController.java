package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormulariosController
{
	@RequestMapping("formularioBicicleta")
	public String formularioBicicleta()
	{
		return "formularios/formularioBicicleta";
	}
	
	@RequestMapping("formularioPatinete")
	public String formularioPatinete()
	{
		return "formularios/formularioPatinete";
	}
	
	@RequestMapping("formularioFuncionario")
	public String formularioFuncionario()
	{
		return "formularios/formularioFuncionario";
	}
}
