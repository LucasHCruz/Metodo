package br.com.metodo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.metodo.dao.BicicletaDAO;
import br.com.metodo.dao.DAO;
import br.com.metodo.dao.FuncionarioDAO;
import br.com.metodo.dao.PatineteDAO;
import br.com.metodo.model.Bicicleta;
import br.com.metodo.model.Funcionario;
import br.com.metodo.model.Patinete;

@Controller
public class PanelController
{	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping("painel")
	public String painel()
	{
		return "painel";
	}

	@RequestMapping("crudFuncionario")
	public String crudFuncionario()
	{
		return "panelviews/crudFuncionario";
	}

	@RequestMapping("crudExtensao")
	public String crudExtensao()
	{
		return "panelviews/crudExtensao";
	}

	@RequestMapping("crudPatinete")
	public String crudPatinete()
	{
		return "panelviews/crudPatinete";
	}	

	@RequestMapping("crudBicicleta")
	public String crudBicicleta()
	{
		return "panelviews/crudBicicleta";
	}

	@RequestMapping("login")
	public String login(Funcionario funcionario, HttpSession session)
	{
		if(new FuncionarioDAO().existeLogin(funcionario)) 
		{
			session.setAttribute("usuarioLogado", funcionario);
			return "painel";
		}

		return "index";
	}

}
