package br.com.metodo.dao;

public interface DAO <MODEL>
{
	public void create(MODEL object);
	
	public MODEL read(MODEL object);
	
	public void update(MODEL object);
	
	public void delete(MODEL object);
}
