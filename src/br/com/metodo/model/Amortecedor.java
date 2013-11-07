package br.com.metodo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Amortecedor
{
	@Id
	@GeneratedValue
	private String codigo;
	private String modelo;

	public String getCodigo()
	{
		return codigo;
	}
	
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	
	public String getModelo()
	{
		return modelo;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
}