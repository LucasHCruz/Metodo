package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Funcionario;

public class FuncionarioDAO implements DAO<Funcionario>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Funcionario funcionario)
	{
		String sql = "INSERT INTO FUNCIONARIO (REGISTRO, E_MAIL, NOME, SOBRENOME, CARGO, SENHA, PERMISSAO) VALUES (SEQ_FUNCIONARIO.nextval, ?, ?, ?, ?, ?, ?)";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, funcionario.getEmail().toLowerCase());
			ps.setString(2, funcionario.getNome());
			ps.setString(3, funcionario.getSobrenome());
			ps.setString(4, funcionario.getCargo());
			ps.setString(5, funcionario.getSenha());
			ps.setInt(6, funcionario.getPermissao());

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
				funcionario.setEmail(rs.getString("E_MAIL"));
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
		String sql = "UPDATE FUNCIONARIO SET E_MAIL = ?, NOME = ?, SOBRENOME = ?, CARGO = ?, SENHA = ?, PERMISSAO = ? WHERE REGISTRO =  ?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, funcionario.getEmail().toLowerCase());
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
		String sql = "DELETE FROM funcionario WHERE registro = ?";
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

	@Override
	public Funcionario read(String codigo)
	{
		String sql = "SELECT * FROM funcionario where registro = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, codigo);
			
			ResultSet rs = ps.executeQuery();
			
			Funcionario funcionario = new Funcionario();
			
			if(rs.next())
			{
				funcionario.setRegistro(rs.getInt("REGISTRO"));
				funcionario.setEmail(rs.getString("E_MAIL"));
				funcionario.setNome(rs.getString("NOME"));
				funcionario.setSobrenome(rs.getString("SOBRENOME"));
				funcionario.setCargo(rs.getString("CARGO"));
				funcionario.setSenha(rs.getString("SENHA"));
				funcionario.setPermissao(rs.getInt("PERMISSAO"));
			}
			
			ps.close();
			conn.close();			
			return funcionario;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public boolean existeLogin(Funcionario funcionario)
	{
		String sql = "SELECT e_mail, senha FROM funcionario where e_mail = ? AND senha = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, funcionario.getEmail().toLowerCase());
			ps.setString(2, funcionario.getSenha());
			
			ResultSet rs = ps.executeQuery();
			
			ps.close();
			conn.close();
			return rs.next();
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}
	}
}
