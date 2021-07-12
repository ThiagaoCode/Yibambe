package projejoPooGeneration;
//estender a classe
public class Acolhimento extends social {

	private String ajudaFinanceira;
	private String ajudaProfissional;
	private String abrigo;
	private String auxilioAcademico;
//pra criar o construtor com as informaçoes da classe mae + as variaveis que criei na subclasse
	//botao direito,souce, constructor using fields
	public Acolhimento(String nome, String cpf, String email, String telefone, String cep, String ajudaFinanceira,
			String ajudaProfissional, String abrigo, String auxilioAcademico) {
		super(nome, cpf, email, telefone, cep);
		this.ajudaFinanceira = ajudaFinanceira;
		this.ajudaProfissional = ajudaProfissional;
		this.abrigo = abrigo;
		this.auxilioAcademico = auxilioAcademico;
		
		//criar um getter e setter com os atributos da classe que criei por quee ja tem getter e setter na 
				//setter na classe mae com as informacoes que vem de la
	}
	public String getAjudaFinanceira() {
		return ajudaFinanceira;
	}
	public void setAjudaFinanceira(String ajudaFinanceira) {
		this.ajudaFinanceira = ajudaFinanceira;
	}
	public String getAjudaProfissional() {
		return ajudaProfissional;
	}
	public void setAjudaProfissional(String ajudaProfissional) {
		this.ajudaProfissional = ajudaProfissional;
	}
	public String getAbrigo() {
		return abrigo;
	}
	public void setAbrigo(String abrigo) {
		this.abrigo = abrigo;
	}
	public String getAuxilioAcademico() {
		return auxilioAcademico;
	}
	public void setAuxilioAcademico(String auxilioAcademico) {
		this.auxilioAcademico = auxilioAcademico;
	}
	
		
		
		
		
	
	


	
		
}





