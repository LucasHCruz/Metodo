package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Bicicleta;
import br.com.metodo.model.Patinete;

public class PatineteDAO implements DAO<Patinete>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Patinete patinete)
	{
		String sql = "INSERT INTO patinete (codigo,nome,modelo,cor,preco,descricao,tipo,material,peso,roda,material_prancha,material_roda) VALUES(SEQ_PATINETE.nextval,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, patinete.getNome());
			ps.setString(2, patinete.getModelo());
			ps.setString(3, patinete.getCor());
			ps.setDouble(4, patinete.getPreco());
			ps.setString(5, patinete.getDescricao());
			ps.setString(6, patinete.getTipo());
			ps.setString(7, patinete.getMaterial());
			ps.setDouble(8, patinete.getPeso());
			ps.setString(9, patinete.getRoda());
			ps.setString(10, patinete.getMaterialPrancha());
			ps.setString(11, patinete.getMaterialRoda());
			
			ps.execute();
			ps.close();

			conn.commit();
			conn.setAutoCommit(false);
			conn.close();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	@Override
	public List<Patinete> read()
	{
		String sql = "SELECT * FROM patinete";
		try
		{
			List<Patinete> patinetes = new ArrayList<Patinete>();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();			

			while(rs.next())
			{
				Patinete patinete = new Patinete();

				patinete.setCodigo(rs.getString("CODIGO"));
				patinete.setRoda(rs.getString("RODA"));
				patinete.setMaterialPrancha(rs.getString("MATERIAL_PRANCHA"));
				patinete.setMaterialRoda(rs.getString("MATERIAL_RODA"));
				patinete.setCor(rs.getString("COR"));
				patinete.setDescricao(rs.getString("DESCRICAO"));
				patinete.setMaterial(rs.getString("MATERIAL"));
				patinete.setModelo(rs.getString("MODELO"));
				patinete.setNome(rs.getString("NOME"));
				patinete.setPeso(rs.getDouble("PESO"));
				patinete.setPreco(rs.getDouble("PRECO"));
				patinete.setTipo(rs.getString("TIPO"));

				patinetes.add(patinete);				
			}
			conn.close();
			return patinetes;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void update(Patinete patinete)
	{
		String sql = "UPDATE patinete SET nome = ?,modelo = ?,cor = ?,preco = ?,descricao = ?,tipo = ?,material = ?,peso = ?, material_prancha = ?, material_roda = ?, roda = ? WHERE codigo = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, patinete.getNome());
			ps.setString(2, patinete.getModelo());
			ps.setString(3, patinete.getCor());
			ps.setDouble(4, patinete.getPreco());
			ps.setString(5, patinete.getDescricao());
			ps.setString(6, patinete.getTipo());
			ps.setString(7, patinete.getMaterial());
			ps.setDouble(8, patinete.getPeso());
			ps.setString(9, patinete.getMaterialPrancha());
			ps.setString(10, patinete.getMaterialRoda());
			ps.setString(11, patinete.getRoda());
			ps.setString(12, patinete.getCodigo());

			ps.execute();
			ps.close();
			conn.close();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}				
	}

	@Override
	public void delete(Patinete patinete)
	{
		String sql = "DELETE FROM patinete WHERE codigo = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, patinete.getCodigo());
			
			ps.execute();
			ps.close();
			conn.close();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}		
	}

	@Override
	public Patinete read(String codigo)
	{
		String sql = "SELECT * FROM PATINETE WHERE CODIGO = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, codigo);
			
			ResultSet rs = ps.executeQuery();			

			Patinete patinete = new Patinete();

			if(rs.next())
			{
				patinete.setCodigo(rs.getString("CODIGO"));
				patinete.setCor(rs.getString("COR"));
				patinete.setDescricao(rs.getString("DESCRICAO"));
				patinete.setMaterialPrancha(rs.getString("MATERIAL_PRANCHA"));
				patinete.setMaterialRoda(rs.getString("MATERIAL_RODA"));
				patinete.setRoda(rs.getString("RODA"));
				patinete.setMaterial(rs.getString("MATERIAL"));
				patinete.setModelo(rs.getString("MODELO"));
				patinete.setNome(rs.getString("NOME"));
				patinete.setPeso(rs.getDouble("PESO"));
				patinete.setPreco(rs.getDouble("PRECO"));
				patinete.setTipo(rs.getString("TIPO"));			
			}
			conn.close();
			return patinete;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}	
		
	}
}
