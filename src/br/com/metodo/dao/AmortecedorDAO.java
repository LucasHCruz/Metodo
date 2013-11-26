package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Amortecedor;

public class AmortecedorDAO implements DAO<Amortecedor>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Amortecedor amortecedor)
	{
		String sql = "INSERT INTO amortecedor (codigo, nome) VALUES (SEQ_AMORTECEDOR.nextval,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, amortecedor.getNome());
			
			ps.execute();
			
			ps.close();
			conn.close();
		}
		catch (SQLException ex)
		{
			System.out.println(ex.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public List<Amortecedor> read()
	{
		String sql = "SELECT codigo,nome FROM amortecedor";
		List<Amortecedor> amortecedores = new ArrayList<Amortecedor>();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Amortecedor amortecedor = new Amortecedor();
				
				amortecedor.setCodigo(rs.getString("CODIGO"));
				amortecedor.setNome(rs.getString("NOME"));
				
				amortecedores.add(amortecedor);
			}
			
			ps.close();
			conn.close();
			
			return amortecedores;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Amortecedor amortecedor)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Amortecedor amortecedor)
	{
		String sql = "DELETE FROM amortecedor WHERE codigo=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, amortecedor.getCodigo());
			
			ps.execute();
			
			ps.close();
			conn.close();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public Amortecedor read(String codigo)
	{
		String sql = "SELECT codigo,nome FROM amortecedor";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Amortecedor amortecedor = new Amortecedor();
			
			if(rs.next())
			{
				amortecedor.setCodigo(rs.getString("CODIGO"));
				amortecedor.setNome(rs.getString("NOME"));
			}
			
			ps.close();
			conn.close();
			
			return amortecedor;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

}
