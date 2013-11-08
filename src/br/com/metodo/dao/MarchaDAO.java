package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Marcha;
import br.com.metodo.model.Marcha;

public class MarchaDAO implements DAO<Marcha>
{
	private Connection conn = new ConnectionFactory().getConnection();
	
	@Override
	public void create(Marcha marcha)
	{
		String sql = "INSERT INTO marcha (codigo, nome) VALUES (?,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, marcha.getCodigo());
			ps.setString(2, marcha.getNome());
			
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
	public List<Marcha> read()
	{
		String sql = "SELECT codigo,nome FROM marcha";
		List<Marcha> marchas = new ArrayList<Marcha>();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Marcha marcha = new Marcha();
				
				marcha.setCodigo(rs.getString("CODIGO"));
				marcha.setNome(rs.getString("NOME"));
				
				marchas.add(marcha);
			}
			
			ps.close();
			conn.close();
			
			return marchas;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Marcha marcha)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Marcha marcha)
	{
		String sql = "DELETE FROM marcha WHERE codigo=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, marcha.getCodigo());
			
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
