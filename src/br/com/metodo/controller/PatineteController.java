package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.DAO;
import br.com.metodo.dao.PatineteDAO;
import br.com.metodo.model.Patinete;

@Controller
public class PatineteController
{
	@RequestMapping("/adicionaPatinete")
	public String create(Patinete patinete)
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.create(patinete);
		return "";
	}
	
	@RequestMapping("/pesquisaPatinete")
	public String read()
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.read();
		return "";
	}
	
	@RequestMapping("/alteraPatinete")
	public String update(Patinete patinete)
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.update(patinete);
		return "";
	}
	
	@RequestMapping("/deletaPatinete")
	public String delete(Patinete patinete)
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.delete(patinete);
		return "";
	}
}
