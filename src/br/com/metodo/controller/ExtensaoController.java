package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.AmortecedorDAO;
import br.com.metodo.dao.BancoDAO;
import br.com.metodo.dao.DAO;
import br.com.metodo.dao.FreioDAO;
import br.com.metodo.dao.GuidaoDAO;
import br.com.metodo.dao.MarchaDAO;
import br.com.metodo.dao.PneuDAO;
import br.com.metodo.model.Amortecedor;
import br.com.metodo.model.Banco;
import br.com.metodo.model.Freio;
import br.com.metodo.model.Guidao;
import br.com.metodo.model.Marcha;
import br.com.metodo.model.Pneu;
@Controller
public class ExtensaoController
{
	@RequestMapping("listaExtensao")
	public String listaExtensao(Model model)
	{
		//DAO<Extensao> daoExtensao = new BicicletaDAO();
		//model.addAttribute("bicicletas", daoBicicleta.read());
		return "painel";
	}
	
	@RequestMapping("criaAmortecedor")
	public String criaAmortecedor(Amortecedor amortecedor)
	{
		DAO<Amortecedor> daoAmortecedor = new AmortecedorDAO();
		daoAmortecedor.create(amortecedor);
		return "painel";
	}
	
	@RequestMapping("criaBanco")
	public String criaBanco(Banco banco)
	{
		DAO<Banco> daoBanco = new BancoDAO();
		daoBanco.create(banco);
		return "painel";
	}
	
	@RequestMapping("criaFreio")
	public String criaFreio(Freio freio)
	{
		DAO<Freio> daoFreio = new FreioDAO();
		daoFreio.create(freio);
		return "painel";
	}
	
	@RequestMapping("criaGuidao")
	public String criaGuidao(Guidao guidao)
	{
		DAO<Guidao> daoGuidao = new GuidaoDAO();
		daoGuidao.create(guidao);
		return "painel";
	}
	
	@RequestMapping("criaMarcha")
	public String criaMarcha(Marcha marcha)
	{
		DAO<Marcha> daoMarcha = new MarchaDAO();
		daoMarcha.create(marcha);
		return "painel";
	}
	
	@RequestMapping("criaPneu")
	public String criaPneu(Pneu pneu)
	{
		DAO<Pneu> daoPneu = new PneuDAO();
		daoPneu.create(pneu);
		return "painel";
	}
}
