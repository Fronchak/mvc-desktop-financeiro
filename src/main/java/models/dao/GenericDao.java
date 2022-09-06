package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericDao<T> {
	private Connection connection;
	
	protected GenericDao() {
		this.connection = new Conexao().getConnection();
	}
	
	protected Connection getConnection() {
		return connection;
	}
	
	public void save(String insertSql, Object... parametros) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
			int posicao = 1;
			for(Object parametro : parametros) {
				preparedStatement.setObject(posicao, parametros);
				posicao++;
			}
			preparedStatement.executeUpdate();
			preparedStatement.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	protected void close() {
		try {
			if (connection != null) {
				connection.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
