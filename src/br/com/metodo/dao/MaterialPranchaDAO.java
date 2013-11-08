package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.MaterialPrancha;
import br.com.metodo.model.MaterialPrancha;

public class MaterialPranchaDAO implements DAO<MaterialPrancha>
{
	private Connection conn = new ConnectionFactory().getConnection();
	
	@Override
	public void create(MaterialPrancha materialPrancha)
	{
		String sql = "INSERT INTO material_prancha (codigo, nome) VALUES (?,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, materialPrancha.getCodigo());
			ps.setString(2, materialPrancha.getNome());
			
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
	public List<MaterialPrancha> read()
	{
		String sql = "SELECT codigo,nome FROM material_prancha";
		List<MaterialPrancha> materiaisPrancha = new ArrayList<MaterialPrancha>();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				MaterialPrancha materialPrancha = new MaterialPrancha();
				
				materialPrancha.setCodigo(rs.getString("CODIGO"));
				materialPrancha.setNome(rs.getString("NOME"));
				
				materiaisPrancha.add(materialPrancha);
			}
			
			ps.close();
			conn.close();
			
			return materiaisPrancha;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(MaterialPrancha materialPrancha)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MaterialPrancha materialPrancha)
	{
		String sql = "DELETE FROM material_prancha WHERE codigo=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, materialPrancha.getCodigo());
			
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
