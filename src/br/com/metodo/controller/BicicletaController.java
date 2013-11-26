package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.AmortecedorDAO;
import br.com.metodo.dao.BancoDAO;
import br.com.metodo.dao.BicicletaDAO;
import br.com.metodo.dao.DAO;
import br.com.metodo.dao.FreioDAO;
import br.com.metodo.dao.GuidaoDAO;
import br.com.metodo.dao.MarchaDAO;
import br.com.metodo.dao.PneuDAO;
import br.com.metodo.model.Amortecedor;
import br.com.metodo.model.Banco;
import br.com.metodo.model.Bicicleta;
import br.com.metodo.model.Freio;
import br.com.metodo.model.Guidao;
import br.com.metodo.model.Marcha;
import br.com.metodo.model.Pneu;

@Controller
public class BicicletaController
{
	@RequestMapping("/criaBicicleta")
	public String create(Bicicleta bicicleta)
	{
		DAO<Bicicleta> dao = new BicicletaDAO();
		dao.create(bicicleta);
		return "painel";
	}
	
	@RequestMapping("listaBicicleta")
	public String listaBicicleta(Model model)
	{
		DAO<Bicicleta> daoBicicleta = new BicicletaDAO();
		model.addAttribute("bicicletas", daoBicicleta.read());
		return "panelviews/listaBicicleta";
	}
	
	@RequestMapping("/alteraBicicleta")
	public String update(Bicicleta bicicleta)
	{
		DAO<Bicicleta> dao = new BicicletaDAO();
		dao.update(bicicleta);
		return "painel";
	}
	
	@RequestMapping("/removeBicicleta")
	public String delete(Bicicleta bicicleta)
	{
		DAO<Bicicleta> dao = new BicicletaDAO();
		dao.delete(bicicleta);
		return "painel";
	}
	
	@RequestMapping("/unitBicicleta")
	public String readUnit(Bicicleta bicicleta, String codigo, Model model)
	{
		DAO<Bicicleta> bicicletaDao = new BicicletaDAO();
		Bicicleta bike = bicicletaDao.read(codigo);
		model.addAttribute("bicicleta", bike);
		DAO<Amortecedor> aDAO = new AmortecedorDAO();
		model.addAttribute("a", aDAO.read(bike.getAmortecedor()));
		DAO<Guidao> gDAO = new GuidaoDAO();
		model.addAttribute("g", gDAO.read(bike.getGuidao()));
		DAO<Banco> bDAO = new BancoDAO();
		model.addAttribute("b", bDAO.read(bike.getBanco()));
		DAO<Freio> fDAO = new FreioDAO();
		model.addAttribute("f", fDAO.read(bike.getFreio()));
		DAO<Marcha> mDAO = new MarchaDAO();
		model.addAttribute("m", mDAO.read(bike.getMarcha()));
		DAO<Pneu> pDAO = new PneuDAO();
		model.addAttribute("p", pDAO.read(bike.getPneu()));
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
		return "panelviews/unitBicicleta";
	}
}
