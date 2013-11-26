package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Pneu;
import br.com.metodo.model.Pneu;
import br.com.metodo.model.Pneu;

public class PneuDAO implements DAO<Pneu>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Pneu pneu)
	{
		String sql = "INSERT INTO pneu (codigo, nome) VALUES (SEQ_PNEU.nextval,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, pneu.getNome());

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
	public List<Pneu> read()
	{
		String sql = "SELECT codigo,nome FROM pneu";
		List<Pneu> pneus = new ArrayList<Pneu>();

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				Pneu pneu = new Pneu();

				pneu.setCodigo(rs.getString("CODIGO"));
				pneu.setNome(rs.getString("NOME"));

				pneus.add(pneu);
			}

			ps.close();
			conn.close();

			return pneus;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Pneu pneu)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Pneu pneu)
	{
		String sql = "DELETE FROM pneu WHERE codigo=?";

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, pneu.getCodigo());

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
	public Pneu read(String codigo)
	{
		String sql = "SELECT codigo,nome FROM pneu";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Pneu pneu = new Pneu();
			
			if(rs.next())
			{
				pneu.setCodigo(rs.getString("CODIGO"));
				pneu.setNome(rs.getString("NOME"));
			}
			
			ps.close();
			conn.close();
			
			return pneu;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

}
