package br.com.metodo.model;

public class Patinete extends Produto
{
	private String roda;
	private String materialRoda;
	private String materialPrancha;
	
	public String getRoda()
	{
		return roda;
	}
	
	public void setRoda(String roda)
	{
		this.roda = roda;
	}
	
	public String getMaterialRoda()
	{
		return materialRoda;
	}
	
	public void setMaterialRoda(String materialRoda)
	{
		this.materialRoda = materialRoda;
	}
	
	public String getMaterialPrancha()
	{
		return materialPrancha;
	}
	
	public void setMaterialPrancha(String materialPrancha)
	{
		this.materialPrancha = materialPrancha;
	}
}
