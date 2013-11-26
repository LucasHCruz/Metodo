package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Freio;

public class FreioDAO implements DAO<Freio>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Freio freio)
	{
		String sql = "INSERT INTO freio (codigo, nome) VALUES (SEQ_FREIO.nextval,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, freio.getNome());

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
	public List<Freio> read()
	{
		String sql = "SELECT codigo,nome FROM freio";
		List<Freio> freios = new ArrayList<Freio>();

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				Freio freio = new Freio();

				freio.setCodigo(rs.getString("CODIGO"));
				freio.setNome(rs.getString("NOME"));

				freios.add(freio);
			}

			ps.close();
			conn.close();

			return freios;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Freio freio)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Freio freio)
	{
		String sql = "DELETE FROM freio WHERE codigo=?";

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, freio.getCodigo());

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
	public Freio read(String codigo)
	{
		String sql = "SELECT codigo,nome FROM freio";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Freio freio = new Freio();
			
			if(rs.next())
			{
				freio.setCodigo(rs.getString("CODIGO"));
				freio.setNome(rs.getString("NOME"));
			}
			
			ps.close();
			conn.close();
			
			return freio;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

}
