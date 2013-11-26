package br.com.metodo.model;

import javax.persistence.Entity;

@Entity
public class Bicicleta extends Produto
{
	private int aro;
	private String freio;
	private String pneu;
	private String banco;
	private String marcha;
	private String amortecedor;
	private String guidao;

	public int getAro()
	{
		return aro;
	}

	public void setAro(int aro)
	{
		this.aro = aro;
	}

	public String getFreio()
	{
		return freio;
	}

	public void setFreio(String freio)
	{
		this.freio = freio;
	}

	public String getPneu()
	{
		return pneu;
	}

	public void setPneu(String pneu)
	{
		this.pneu = pneu;
	}

	public String getBanco()
	{
		return banco;
	}

	public void setBanco(String banco)
	{
		this.banco = banco;
	}

	public String getMarcha()
	{
		return marcha;
	}

	public void setMarcha(String marcha)
	{
		this.marcha = marcha;
	}

	public String getAmortecedor()
	{
		return amortecedor;
	}

	public void setAmortecedor(String amortecedor)
	{
		this.amortecedor = amortecedor;
	}	
	
	public String getGuidao()
	{
		return guidao;
	}

	public void setGuidao(String guidao)
	{
		this.guidao = guidao;
	}

}
