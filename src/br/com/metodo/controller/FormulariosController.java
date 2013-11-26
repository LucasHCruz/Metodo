package br.com.metodo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.AmortecedorDAO;
import br.com.metodo.dao.BancoDAO;
import br.com.metodo.dao.DAO;
import br.com.metodo.dao.FreioDAO;
import br.com.metodo.dao.GuidaoDAO;
import br.com.metodo.dao.MarchaDAO;
import br.com.metodo.dao.MaterialPranchaDAO;
import br.com.metodo.dao.MaterialRodaDAO;
import br.com.metodo.dao.PneuDAO;
import br.com.metodo.dao.RodaDAO;
import br.com.metodo.model.Amortecedor;
import br.com.metodo.model.Banco;
import br.com.metodo.model.Freio;
import br.com.metodo.model.Guidao;
import br.com.metodo.model.Marcha;
import br.com.metodo.model.MaterialPrancha;
import br.com.metodo.model.MaterialRoda;
import br.com.metodo.model.Pneu;
import br.com.metodo.model.Roda;

@Controller
public class FormulariosController
{
	@RequestMapping("formularioBicicleta")
	public String formularioBicicleta(Model model)
	{
		DAO<Amortecedor> amortecedorDAO = new AmortecedorDAO();
		model.addAttribute("amortecedores", amortecedorDAO.read());
		DAO<Guidao> guidaoDAO = new GuidaoDAO();
		model.addAttribute("guidoes", guidaoDAO.read());
		DAO<Banco> bancoDAO = new BancoDAO();
		model.addAttribute("bancos", bancoDAO.read());
		DAO<Freio> freioDAO = new FreioDAO();
		model.addAttribute("freios", freioDAO.read());
		DAO<Marcha> marchaDAO = new MarchaDAO();
		model.addAttribute("marchas", marchaDAO.read());
		DAO<Pneu> pneuDAO = new PneuDAO();
		model.addAttribute("pneus", pneuDAO.read());
		return "formularios/formularioBicicleta";
	}
	
	@RequestMapping("formularioPatinete")
	public String formularioPatinete(Model model)
	{
		DAO<MaterialRoda> materialRodaDAO = new MaterialRodaDAO();
		model.addAttribute("materiaisRoda", materialRodaDAO.read());
		DAO<MaterialPrancha> materialPranchaDAO = new MaterialPranchaDAO();
		model.addAttribute("materiaisPrancha", materialPranchaDAO.read());
		DAO<Roda> rodaDAO = new RodaDAO();
		model.addAttribute("rodas", rodaDAO.read());
		return "formularios/formularioPatinete";
	}
	
	@RequestMapping("formularioFuncionario")
	public String formularioFuncionario()
	{
		return "formularios/formularioFuncionario";
	}
	
	@RequestMapping("formularioExtensao")
	public String formularioExtensao()
	{
		return "formularios/formularioExtensao";
	}
}
