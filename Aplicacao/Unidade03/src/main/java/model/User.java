package model;

public class User {
	private int Id;
	private String Email;
	private String Nome;
	private String Senha;
	private String Telefone;
	private String TipoSangue;
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}





	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}


	public String getSenha() {
		return Senha;
	}



	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getTelefone() {
		return Telefone;
	}



	public void setTelefone(String telefone) {
		Telefone = telefone;
	}


	public String getTipoSangue() {
		return TipoSangue;
	}



	public void setTipoSangue(String tipoSangue) {
		TipoSangue = tipoSangue;
	}

	
	public User(int Id, String Email, String Nome, String Senha, String Telefone, String TipoSangue) {}
	

	
	public String toString() {
		return "Id: " + Id + "  Email: " + Email + "  Nome:" + Nome + " Senha:" + Senha + "  Telefone:" + Telefone + "  Tipo Sanguineo:" + Senha + "";
	}


}