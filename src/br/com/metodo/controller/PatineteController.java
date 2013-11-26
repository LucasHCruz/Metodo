package br.com.metodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.DAO;
import br.com.metodo.dao.MaterialPranchaDAO;
import br.com.metodo.dao.MaterialRodaDAO;
import br.com.metodo.dao.PatineteDAO;
import br.com.metodo.dao.RodaDAO;
import br.com.metodo.model.Bicicleta;
import br.com.metodo.model.MaterialPrancha;
import br.com.metodo.model.MaterialRoda;
import br.com.metodo.model.Patinete;
import br.com.metodo.model.Roda;

@Controller
public class PatineteController
{
	@RequestMapping("/criaPatinete")
	public String create(Patinete patinete)
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.create(patinete);
		return "painel";
	}
	
	@RequestMapping("listaPatinete")
	public String listaPatinete(Model model)
	{
		DAO<Patinete> daoPatinete = new PatineteDAO();
		model.addAttribute("patinetes", daoPatinete.read());
		return "panelviews/listaPatinete";
	}
	
	@RequestMapping("/alteraPatinete")
	public String update(Patinete patinete)
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.update(patinete);
		return "painel";
	}
	
	@RequestMapping("/removePatinete")
	public String delete(Patinete patinete)
	{
		DAO<Patinete> dao = new PatineteDAO();
		dao.delete(patinete);
		return "painel";
	}
	
	@RequestMapping("/unitPatinete")
	public String readUnit(Bicicleta patinete, String codigo, Model model)
	{
		DAO<Patinete> patineteDao = new PatineteDAO();
		Patinete pati = patineteDao.read(codigo);
		model.addAttribute("patinete", pati);
		DAO<MaterialPrancha> mpDAO = new MaterialPranchaDAO();
		model.addAttribute("mp", mpDAO.read(pati.getMaterialPrancha()));
		DAO<MaterialRoda> mrDAO = new MaterialRodaDAO();
		model.addAttribute("mr", mrDAO.read(pati.getMaterialRoda()));
		DAO<Roda> rDAO = new RodaDAO();
		model.addAttribute("r", rDAO.read(pati.getRoda()));
		DAO<MaterialRoda> materialRodaDAO = new MaterialRodaDAO();
		model.addAttribute("materiaisRoda", materialRodaDAO.read());
		DAO<MaterialPrancha> materialPranchaDAO = new MaterialPranchaDAO();
		model.addAttribute("materiaisPrancha", materialPranchaDAO.read());
		DAO<Roda> rodaDAO = new RodaDAO();
		model.addAttribute("rodas", rodaDAO.read());
		return "panelviews/unitPatinete";
	}
}
