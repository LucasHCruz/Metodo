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
<<<<<<< HEAD
			return DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "lucas", "lh1993");			
		} 
		catch (SQLException e)
		{
			System.out.println(e);
=======
			return DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "lh1993");			
		} 
		catch (SQLException e)
		{
>>>>>>> 3ff4b988a7f4fc1b00ee31d663306f66ed21519d
			throw new RuntimeException();
		}
	}
}
