package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.DAO;
import br.com.metodo.dao.FuncionarioDAO;
import br.com.metodo.model.Funcionario;

@Controller
public class FuncionarioController
{
	@RequestMapping("/adicionaFuncionario")
	public String create(Funcionario funcionario)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.create(funcionario);
		return "";
	}
	
	@RequestMapping("/pesquisaFuncionario")
	public String read()
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.read();
		return "";
	}
	
	@RequestMapping("/alteraFuncionario")
	public String update(Funcionario funcionario)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.update(funcionario);
		return "";
	}
	
	@RequestMapping("/deletaFuncionario")
	public String delete(Funcionario funcionario)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.delete(funcionario);
		return "";
	}
}
