package ProjetoJavaModulo1;

public class redeSocial {
	
	private String nome;
	private int idade;
	private String email;
	private String telefone;
	private String cep;
	private String login;
	private String senha;
	
	public redeSocial(String nome, int idade, String email, String telefone, String cep, String login, String senha) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.login = login;
		this.senha = senha;		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
