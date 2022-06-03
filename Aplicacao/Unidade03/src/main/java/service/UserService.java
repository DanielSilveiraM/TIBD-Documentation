package service;

import model.Produto;

import java.io.File;
import java.util.Scanner;
import spark.Request;
import spark.Response;

import dao.UserDAO;
import model.User;

public class UserService {
	private UserDAO userDAO = new UserDAO();
	
	private String form;
	private final int FORM_INSERT = 1;
	
	private final int FORM_ORDERBY_DESCRICAO = 2;
	
	
	public UserService() {
		makeForm();
	}

	
	public void makeForm() {
		makeForm(FORM_INSERT, new Produto(), FORM_ORDERBY_DESCRICAO);
	}

	
	public void makeForm(int tipo, Produto produto, int orderBy) {

	}
	
	public Object insert(Request request, Response response) {
        String resp = "";

        String email = request.queryParams("email");
        String nome = request.queryParams("nome");
        String senha = request.queryParams("senha");
        String telefone = request.queryParams("telefone");
        String tipoSangue = request.queryParams("tipoSangue");

        User user = new User(0,email,nome,senha,telefone,tipoSangue);

        if(userDAO.insert(user) == true) {
            resp = "Presta atenção Diabo! Usuário cadastrado  (" + email + ") inserido com sucesso!";
            response.status(201); // 201 Created
        } else {
            resp = "Usúario (" + email + ") não inserido na base de dados!";
            response.status(404); // 404 Not found
       }


        String nomeArquivo = "test.html";
        form = "";
        try{
            Scanner entrada = new Scanner(new File(nomeArquivo));
            while(entrada.hasNext()){
                form += (entrada.nextLine() + "\n");
            }
            entrada.close();
        }  catch (Exception e) { System.out.println(e.getMessage()); }

         makeForm();
        return form;

    }


}
	
