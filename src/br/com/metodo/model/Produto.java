package br.com.metodo.model;

public abstract class Produto
{
	private int codigo;
	private String nome;
	private String modelo;
	private String cor;
	private double preco;
	private String descricao;
	private String tipo;
	private String material;
	private String guidao;
	private double peso;

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public double getPeso()
	{
		return peso;
	}

	public void setPeso(double peso)
	{
		this.peso = peso;
	}

	public String getGuidao()
	{
		return guidao;
	}

	public void setGuidao(String guidao)
	{
		this.guidao = guidao;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}	
}
