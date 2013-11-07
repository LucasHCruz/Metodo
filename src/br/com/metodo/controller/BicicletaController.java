package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.BicicletaDAO;
import br.com.metodo.dao.DAO;
import br.com.metodo.model.Bicicleta;

@Controller
public class BicicletaController
{
	@RequestMapping("/adicionaBicicleta")
	public String create(Bicicleta bicicleta)
	{
		//DAO<Bicicleta> dao = new BicicletaDAO();
		//dao.create(bicicleta);
		return "default";
	}
	
	@RequestMapping("/pesquisaBicicleta")
	public String read()
	{
		DAO<Bicicleta> dao = new BicicletaDAO();
		dao.read();
		return "";
	}
	
	@RequestMapping("/alteraBicicleta")
	public String update(Bicicleta bicicleta)
	{
		DAO<Bicicleta> dao = new BicicletaDAO();
		dao.update(bicicleta);
		return "";
	}
	
	@RequestMapping("/deletaBicicleta")
	public String delete(Bicicleta bicicleta)
	{
		DAO<Bicicleta> dao = new BicicletaDAO();
		dao.delete(bicicleta);
		return "";
	}
}
