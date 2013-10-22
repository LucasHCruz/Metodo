package br.com.metodo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory
{
	public Connection getConnection()
	{
		try
		{
			return DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "lh1993");			
		} 
		catch (SQLException e)
		{
			throw new RuntimeException();
		}
	}
}
