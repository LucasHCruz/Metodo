package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.MaterialRoda;
import br.com.metodo.model.MaterialRoda;
import br.com.metodo.model.MaterialRoda;

public class MaterialRodaDAO implements DAO<MaterialRoda>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(MaterialRoda materialRoda)
	{
		String sql = "INSERT INTO material_roda (codigo, nome) VALUES (SEQ_MRODA.nextval,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, materialRoda.getNome());

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
	public List<MaterialRoda> read()
	{
		String sql = "SELECT codigo,nome FROM material_roda";
		List<MaterialRoda> materiaisRoda = new ArrayList<MaterialRoda>();

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				MaterialRoda materialRoda = new MaterialRoda();

				materialRoda.setCodigo(rs.getString("CODIGO"));
				materialRoda.setNome(rs.getString("NOME"));

				materiaisRoda.add(materialRoda);
			}

			ps.close();
			conn.close();

			return materiaisRoda;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(MaterialRoda materialRoda)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(MaterialRoda materialRoda)
	{
		String sql = "DELETE FROM material_roda WHERE codigo=?";

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, materialRoda.getCodigo());

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
	public MaterialRoda read(String codigo)
	{
		String sql = "SELECT codigo,nome FROM material_roda";

		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			MaterialRoda materialRoda = new MaterialRoda();

			if(rs.next())
			{
				materialRoda.setCodigo(rs.getString("CODIGO"));
				materialRoda.setNome(rs.getString("NOME"));
			}

			ps.close();
			conn.close();

			return materialRoda;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

}
