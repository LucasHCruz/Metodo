package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Bicicleta;

public class FuncionarioDAO implements DAO<Funcionario>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Funcionario funcionario)
	{
		String sql = "INSERT INTO funcionario (registro,email,nome,sobrenome,cargo,senha,permissao) VALUES(?,?,?,?,?,?,?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, funcionario.getRegistro());
			ps.setString(2, funcionario.getEmail());
			ps.setString(3, funcionario.getNome());
			ps.setString(4, funcionario.getSobrenome());
			ps.setString(5, funcionario.getCargo());
			ps.setString(6, funcionario.getSenha());
			ps.setInt(7, funcionario.getPermissao());

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
	public List<Funcionario> read()
	{
		String sql = "SELECT * FROM funcionario";
		try
		{
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();			

			while(rs.next())
			{
				Funcionario funcionario = new Funcionario();

				funcionario.setRegistro(rs.getInt("REGISTRO"));
				funcionario.setEmail(rs.getString("EMAIL"));
				funcionario.setNome(rs.getString("NOME"));
				funcionario.setSobrenome(rs.getString("SOBRENOME"));
				funcionario.setCargo(rs.getString("CARGO"));
				funcionario.setSenha(rs.getString("SENHA"));
				funcionario.setPermissao(rs.getInt("PERMISSAO"));

				funcionarios.add(funcionario);				
			}
			conn.close();
			return funcionarios;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void update(Funcionario funcionario)
	{
		String sql = "UPDATE INTO funcionario (email,nome,sobrenome,cargo,senha,permissao) VALUES(?,?,?,?,?,?) WHERE registro = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, funcionario.getEmail());
			ps.setString(2, funcionario.getNome());
			ps.setString(3, funcionario.getSobrenome());
			ps.setString(4, funcionario.getCargo());
			ps.setString(5, funcionario.getSenha());
			ps.setInt(6, funcionario.getPermissao());
			ps.setInt(7, funcionario.getRegistro());

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
	public void delete(Funcionario funcionario)
	{
		String sql = "DELETE FROM bicicleta WHERE codigo = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, funcionario.getRegistro());
			
			ps.execute();
			ps.close();
			conn.close();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}	
	}
}