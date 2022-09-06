package models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/appmvc";
	private static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	private Connection connection;
	
	public Connection getConnection() {
		System.out.println("Conectando ao Banco de Dados...");
		try {
			Class.forName(DRIVER_MYSQL);
			connection = DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return connection;
	}
}
