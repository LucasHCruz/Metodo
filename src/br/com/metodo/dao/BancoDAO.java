package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Amortecedor;
import br.com.metodo.model.Banco;
import br.com.metodo.model.Banco;

public class BancoDAO implements DAO<Banco>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Banco banco)
	{
		String sql = "INSERT INTO banco (codigo, nome) VALUES (SEQ_BANCO.nextval,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, banco.getNome());
			
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
	public List<Banco> read()
	{
		String sql = "SELECT codigo,nome FROM banco";
		List<Banco> bancos = new ArrayList<Banco>();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Banco banco = new Banco();
				
				banco.setCodigo(rs.getString("CODIGO"));
				banco.setNome(rs.getString("NOME"));
				
				bancos.add(banco);
			}
			
			ps.close();
			conn.close();
			
			return bancos;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Banco banco)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Banco banco)
	{
String sql = "DELETE FROM banco WHERE codigo=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, banco.getCodigo());
			
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
	public Banco read(String codigo)
	{
		String sql = "SELECT codigo,nome FROM banco";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Banco banco = new Banco();
			
			if(rs.next())
			{
				banco.setCodigo(rs.getString("CODIGO"));
				banco.setNome(rs.getString("NOME"));
			}
			
			ps.close();
			conn.close();
			
			return banco;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException();
		}
	}

}
