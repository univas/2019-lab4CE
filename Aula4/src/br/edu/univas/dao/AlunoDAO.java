package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.univas.vo.Aluno;

public class AlunoDAO {

	private Connection connection;
	
	public AlunoDAO() throws SQLException {
		this.connection = ConnectionDAO.getConnection();
	}
	
	public void insert(Aluno aluno) throws SQLException {
		String sql = "insert into aluno(name, email)"
				+ " values(?, ?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, aluno.getName());
		statement.setString(2, aluno.getEmail());
		
		statement.execute();
	}
	
}
