package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.AmortecedorDAO;
import br.com.metodo.dao.BancoDAO;
import br.com.metodo.dao.BicicletaDAO;
import br.com.metodo.dao.DAO;
import br.com.metodo.dao.FreioDAO;
import br.com.metodo.dao.FuncionarioDAO;
import br.com.metodo.dao.GuidaoDAO;
import br.com.metodo.dao.MarchaDAO;
import br.com.metodo.dao.PneuDAO;
import br.com.metodo.model.Amortecedor;
import br.com.metodo.model.Banco;
import br.com.metodo.model.Bicicleta;
import br.com.metodo.model.Freio;
import br.com.metodo.model.Funcionario;
import br.com.metodo.model.Guidao;
import br.com.metodo.model.Marcha;
import br.com.metodo.model.Pneu;

@Controller
public class FuncionarioController
{
	@RequestMapping("/criaFuncionario")
	public String create(Funcionario funcionario)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.create(funcionario);
		return "painel";
	}
	
	@RequestMapping("listaFuncionario")
	public String listaFuncionario(Model model)
	{
		DAO<Funcionario> daoFuncionario = new FuncionarioDAO();
		model.addAttribute("funcionarios", daoFuncionario.read());
		return "panelviews/listaFuncionario";
	}
	
	@RequestMapping("/alteraFuncionario")
	public String update(Funcionario funcionario)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.update(funcionario);
		return "painel";
	}
	
	@RequestMapping("/removeFuncionario")
	public String delete(Funcionario funcionario)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		dao.delete(funcionario);
		return "painel";
	}
	
	@RequestMapping("/unitFuncionario")
	public String readUnit(Bicicleta bicicleta, String codigo, Model model)
	{
		DAO<Funcionario> dao = new FuncionarioDAO();
		model.addAttribute("funcionario", dao.read(codigo));
		return "panelviews/unitFuncionario";
	}
}
