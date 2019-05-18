package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDAO {

	private static final String USER = "postgres";
	private static final String PASSWORD = "abc123";
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost/aula4";
		
		Properties properties = new Properties();
		properties.setProperty("user", USER);
		properties.setProperty("password", PASSWORD);
		
		return DriverManager.getConnection(url, properties);
	}
	
}
