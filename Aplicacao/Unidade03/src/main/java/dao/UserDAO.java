package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class UserDAO extends DAO {	
	public UserDAO() {
		super();
		conectar();
	}
	
	public void finalize() {
		close();
	}
	
	public boolean insert(User user) {
		boolean status = false;
		try {
			String sql = "INSERT INTO cadastro (email, nome, senha, telefone, tipoSangue) VALUES ('" + user.getEmail() + "', '" + user.getNome() + "', '" + user.getSenha() + "', '" + user.getTelefone() + "', '" + user.getTipoSangue() + "')";	
	
			PreparedStatement st = conexao.prepareStatement(sql);
		    st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
}
	
	
