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
			return DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "lucas", "lh1993");			
		} 
		catch (SQLException e)
		{
			System.out.println(e);
			throw new RuntimeException();
		}
	}
}
