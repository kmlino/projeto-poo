package br.edu.facthus.poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.facthus.exception.CustomException;
import br.edu.facthus.poo.model.Produto;

public class ProdutosDAO {
	
	private Connection connection = null;
	
	private Connection getConnection() {
		try {
			if (connection == null)
				connection = DriverManager
					.getConnection("jdbc:sqlite:produtos.db");
			
			return connection;
		} catch (SQLException e) {
			throw new CustomException("Erro abrindo conexão com o banco de dados."); 
		}
	}
	
	
	public void criaBD() {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(
					"CREATE TABLE IF NOT EXISTS produtos ( "
					+ "id INTEGER, "
					+ "descricao TEXT, "
					+ "preco REAL, "
					+ "quantidade INTEGER, "
					+ "PRIMARY KEY (id))");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao criar o banco de dados.");
		}
	}
	
	public void cadastra(Produto produto) {
 //EXERCÍCIO 09: completar...		
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO produtos (descricao, preco, quantidade) "
					+ "VALUES (?, ?, ?)");
			
			statement.setString(1, produto.getDescricao());
			statement.setFloat(2, produto.getPreco().floatValue());
			statement.setInt(3, produto.getQuantidade());
			
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CustomException("Ocorreu um erro ao inserir o contato.");
		}
	}
	
	public Produto pesquisa(Integer id) {
// EXERCÍCIO 10: completar...		
//		List<Contato> contatos = new ArrayList<>();
//		
//		try {
//			Connection connection = getConnection();
//			Statement statement = connection.createStatement();
//			
//			ResultSet rs = statement.executeQuery(
//					"SELECT id, nome, email FROM contatos ORDER BY nome");
//			
//			while (rs.next()) {
//				Contato contato = new Contato();
//				contato.setId(rs.getInt("id"));
//				contato.setNome(rs.getString("nome"));
//				contato.setEmail(rs.getString("email"));
//				
//				contatos.add(contato);
//			}
//			
//			return contatos; 
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new CustomException("Ocorreu um erro ao pesquisar os contatos.");
//		}
		return null;
	}
		
	public void atualiza(Produto contato) {
// EXERCÍCIO 11: completar...		
//		try {
//			Connection connection = getConnection();
//			PreparedStatement statement = connection.prepareStatement(
//					"UPDATE contatos SET nome = ?, email = ? WHERE id = ?");
//			
//			statement.setString(1, contato.getNome());
//			statement.setString(2, contato.getEmail());
//			statement.setInt(3, contato.getId());
//			
//			statement.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new CustomException("Ocorreu um erro ao atualizar o contato.");
//		}
	}
	
}
