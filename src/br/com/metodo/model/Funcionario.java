package br.com.metodo.model;

public class Funcionario
{
	private int registro;
	private String email;
	private String nome;
	private String sobrenome;
	private String cargo;
	private String login;
	private String senha;
	private int permissao;
	private int telResidencial;
	private int telComercial;
	private int telOutros;
	
	public int getRegistro()
	{
		return registro;
	}
	
	public void setRegistro(int registro)
	{
		this.registro = registro;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getSobrenome()
	{
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	
	public String getCargo()
	{
		return cargo;
	}
	
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public String getSenha()
	{
		return senha;
	}
	
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	
	public int getPermissao()
	{
		return permissao;
	}
	
	public void setPermissao(int permissao)
	{
		this.permissao = permissao;
	}
	
	public int getTelResidencial()
	{
		return telResidencial;
	}
	
	public void setTelResidencial(int telResidencial)
	{
		this.telResidencial = telResidencial;
	}
	
	public int getTelComercial()
	{
		return telComercial;
	}
	
	public void setTelComercial(int telComercial)
	{
		this.telComercial = telComercial;
	}
	
	public int getTelOutros()
	{
		return telOutros;
	}
	
	public void setTelOutros(int telOutros)
	{
		this.telOutros = telOutros;
	}
}
