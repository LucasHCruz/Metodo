package br.com.metodo.dao;

import java.util.List;

public interface DAO <MODEL>
{
	public void create(MODEL object);
	
	public List<MODEL> read();
	
	public void update(MODEL object);
	
	public void delete(MODEL object);
}
