package br.com.metodo.dao;

import java.util.List;

import br.com.metodo.model.Bicicleta;

public class TesteBICICLETA
{
	public static void main(String[] args)
	{
		//criar
	/* 
	
		for(int i = 1; i <= 10; i++)
		{
		BicicletaDAO bDAO = new BicicletaDAO();
		
		Bicicleta bicicleta = new Bicicleta();
		
		bicicleta.setNome("Nome " + i);
		bicicleta.setModelo("Modelo " + i);
		bicicleta.setCor("cor" + i);
		bicicleta.setPreco(i);
		bicicleta.setDescricao("Descricao " + i);
		bicicleta.setTipo("Tipo " + i);
		bicicleta.setMaterial("Material " + i);
		bicicleta.setGuidao("Guidao " + i);
		bicicleta.setPeso(i);
		bicicleta.setAro(i);
		bicicleta.setFreio("Freio " + i);
		bicicleta.setPneu("Pneu " + i);
		bicicleta.setBanco("Banco " + i);
		bicicleta.setMarcha("Marcha " + i);
		bicicleta.setAmortecedor("Amortecedor " + i);
		
		bDAO.create(bicicleta);
		}
		*/
		
		//deletar 
		/*
		
		BicicletaDAO bDAO = new BicicletaDAO();
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.setCodigo(10);
		bDAO.delete(bicicleta);
		*/
		
		//procurar
		/*
		BicicletaDAO bDAO = new BicicletaDAO();
		List<Bicicleta> bicicletas = bDAO.read();
		for(Bicicleta b : bicicletas)
		{
			System.out.println(b.getNome());
			System.out.println(b.getModelo());
			System.out.println(b.getCor());
			System.out.println(b.getPreco());
			System.out.println(b.getDescricao());
			System.out.println(b.getTipo());
			System.out.println(b.getMaterial());
			System.out.println(b.getGuidao());
			System.out.println(b.getPeso());
			System.out.println(b.getAro());
			System.out.println(b.getFreio());
			System.out.println(b.getPneu());
			System.out.println(b.getBanco());
			System.out.println(b.getMarcha());
			System.out.println(b.getAmortecedor());			
		}
		*/
	}
}
