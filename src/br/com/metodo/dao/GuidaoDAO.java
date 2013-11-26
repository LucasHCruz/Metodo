package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Guidao;
import br.com.metodo.model.Guidao;
import br.com.metodo.model.Guidao;

public class GuidaoDAO implements DAO<Guidao>
{
	private Connection conn = new ConnectionFactory().getConnection();
	
	@Override
	public void create(Guidao guidao)
	{
		String sql = "INSERT INTO guidao (codigo, nome) VALUES (SEQ_GUIDAO.nextval,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, guidao.getNome());
			
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
	public List<Guidao> read()
	{
		String sql = "SELECT codigo,nome FROM guidao";
		List<Guidao> guidoes = new ArrayList<Guidao>();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Guidao guidao = new Guidao();
				
				guidao.setCodigo(rs.getString("CODIGO"));
				guidao.setNome(rs.getString("NOME"));
				
				guidoes.add(guidao);
			}
			
			ps.close();
			conn.close();
			
			return guidoes;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Guidao guidao)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Guidao guidao)
	{
		String sql = "DELETE FROM guidao WHERE codigo=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, guidao.getCodigo());
			
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
	public Guidao read(String codigo)
	{
		String sql = "SELECT codigo,nome FROM guidao";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Guidao guidao = new Guidao();
			
			if(rs.next())
			{
				guidao.setCodigo(rs.getString("CODIGO"));
				guidao.setNome(rs.getString("NOME"));
			}
			
			ps.close();
			conn.close();
			
			return guidao;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

}
