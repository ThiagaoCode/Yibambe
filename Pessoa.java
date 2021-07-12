package Yibambe;

public class Pessoa {
	private String nome;
	private int idade;
	private String documento;
	private double saldo;
	private String produtos;
	
	public Pessoa(String nome,int idade,String documento,double saldo,String produtos)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.documento = documento;
		this.saldo = saldo;
		this.produtos = produtos;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	
	// declara��o dos m�todos espec�ficos (o que as pessoas far�o?)
	
	public void venderProdutos()
	
	{
		// cadastrar, quantidade estoque, descri��es 
	}
	
	public void doar()
	{
		// doar: qualquer quantia em dinheiro (cpf/cnpj)
	}
	
	public void descricaoDoacoes()
	{
		// doar: bolsas de estudos, cesta b�sicas, vestu�rios etc...(cpf / cnpj)
	}
	
	// gerir os recursos recebidos, como faremos ? alguma rela��o com essa classe ?

}
