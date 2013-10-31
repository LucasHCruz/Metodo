package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.metodo.model.Bicicleta;

public class BicicletaDAO implements DAO<Bicicleta>
{
	private Connection conn = new ConnectionFactory().getConnection();

	@Override
	public void create(Bicicleta bicicleta)
	{
		String sql = "INSERT INTO BICICLETA (codigo,nome,modelo,cor,preco,descricao,tipo,material,guidao,peso,aro,freio,pneu,banco,marcha,amortecedor) VALUES(SEQ_NUMERO.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, bicicleta.getNome());
			ps.setString(2, bicicleta.getModelo());
			ps.setString(3, bicicleta.getCor());
			ps.setDouble(4, bicicleta.getPreco());
			ps.setString(5, bicicleta.getDescricao());
			ps.setString(6, bicicleta.getTipo());
			ps.setString(7, bicicleta.getMaterial());
			ps.setString(8, bicicleta.getGuidao());
			ps.setDouble(9, bicicleta.getPeso());
			ps.setInt(10, bicicleta.getAro());
			ps.setString(11, bicicleta.getFreio());
			ps.setString(12, bicicleta.getPneu());
			ps.setString(13, bicicleta.getBanco());
			ps.setString(14, bicicleta.getMarcha());
			ps.setString(15, bicicleta.getAmortecedor());

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
	public List<Bicicleta> read()
	{
		String sql = "SELECT * FROM BICICLETA";
		try
		{
			List<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();			

			while(rs.next())
			{
				Bicicleta bicicleta = new Bicicleta();

				bicicleta.setCodigo(rs.getInt("CODIGO"));
				bicicleta.setAmortecedor(rs.getString("AMORTECEDOR"));
				bicicleta.setAro(rs.getInt("ARO"));
				bicicleta.setBanco(rs.getString("BANCO"));
				bicicleta.setCor(rs.getString("COR"));
				bicicleta.setDescricao(rs.getString("DESCRICAO"));
				bicicleta.setFreio(rs.getString("FREIO"));
				bicicleta.setGuidao(rs.getString("GUIDAO"));
				bicicleta.setMarcha(rs.getString("MARCHA"));
				bicicleta.setMaterial(rs.getString("MATERIAL"));
				bicicleta.setModelo(rs.getString("MODELO"));
				bicicleta.setNome(rs.getString("NOME"));
				bicicleta.setPeso(rs.getDouble("PESO"));
				bicicleta.setPneu(rs.getString("PNEU"));
				bicicleta.setPreco(rs.getDouble("PRECO"));
				bicicleta.setTipo(rs.getString("TIPO"));

				bicicletas.add(bicicleta);				
			}
			conn.close();
			return bicicletas;
		}
		catch(SQLException ex)
		{
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void update(Bicicleta bicicleta)
	{
		String sql = "UPDATE INTO bicicleta (nome,modelo,cor,preco,descricao,tipo,material,guidao,peso,aro,freio,pneu,banco,marcha,amortecedor) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) WHERE codigo = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, bicicleta.getNome());
			ps.setString(2, bicicleta.getModelo());
			ps.setString(3, bicicleta.getCor());
			ps.setDouble(4, bicicleta.getPreco());
			ps.setString(5, bicicleta.getDescricao());
			ps.setString(6, bicicleta.getTipo());
			ps.setString(7, bicicleta.getMaterial());
			ps.setString(8, bicicleta.getGuidao());
			ps.setDouble(9, bicicleta.getPeso());
			ps.setInt(10, bicicleta.getAro());
			ps.setString(11, bicicleta.getFreio());
			ps.setString(12, bicicleta.getPneu());
			ps.setString(13, bicicleta.getBanco());
			ps.setString(14, bicicleta.getMarcha());
			ps.setString(15, bicicleta.getAmortecedor());
			ps.setInt(16, bicicleta.getCodigo());

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
	public void delete(Bicicleta bicicleta)
	{
		String sql = "DELETE FROM bicicleta WHERE codigo = ?";
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, bicicleta.getCodigo());
			
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

