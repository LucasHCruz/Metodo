package br.com.metodo.model;

public class Patinete extends Produto
{
	private int roda;
	private String materialRoda;
	private String materialPrancha;
	
	public int getRoda()
	{
		return roda;
	}
	
	public void setRoda(int roda)
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
