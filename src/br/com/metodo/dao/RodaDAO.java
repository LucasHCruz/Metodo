package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Amortecedor;
import br.com.metodo.model.Roda;

public class RodaDAO implements DAO<Roda>
{
	private Connection conn = new ConnectionFactory().getConnection();
	
	@Override
	public void create(Roda roda)
	{
		String sql = "INSERT INTO roda (codigo, nome) VALUES (?,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, roda.getCodigo());
			ps.setString(2, roda.getNome());
			
			ps.execute();
			
			ps.close();
			conn.close();
		}
		catch (SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public List<Roda> read()
	{
		String sql = "SELECT codigo,nome FROM roda";
		List<Roda> rodas = new ArrayList<Roda>();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Roda roda = new Roda();
				
				roda.setCodigo(rs.getString("CODIGO"));
				roda.setNome(rs.getString("NOME"));
				
				rodas.add(roda);
			}
			
			ps.close();
			conn.close();
			
			return rodas;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Roda roda)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Roda roda)
	{
		String sql = "DELETE FROM roda WHERE codigo=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, roda.getCodigo());
			
			ps.execute();
			
			ps.close();
			conn.close();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}		
	}

}
