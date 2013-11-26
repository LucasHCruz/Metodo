package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController 
{
	@RequestMapping("/test")
	public String test()
	{
		System.out.println("oi");
		return "index";
	}
	
	@RequestMapping("/test2")
	public String test2()
	{
		return "painel";
	}
	
	@RequestMapping("/test3")
	public String test3()
	{
		return "formularios/formularioBicicleta";
	}
	
	@RequestMapping("/test4")
	public String test4()
	{
		return "cruds/crudBicicleta";
	}
}
