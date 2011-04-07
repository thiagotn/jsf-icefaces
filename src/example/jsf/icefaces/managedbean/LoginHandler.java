package example.jsf.icefaces.managedbean;

public class LoginHandler {

	private String login;
	
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		System.out.println("mudando o login para: " + login);
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
