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
	
	// declaração dos métodos específicos (o que as pessoas farão?)
	
	public void venderProdutos()
	
	{
		// cadastrar, quantidade estoque, descrições 
	}
	
	public void doar()
	{
		// doar: qualquer quantia em dinheiro (cpf/cnpj)
	}
	
	public void descricaoDoacoes()
	{
		// doar: bolsas de estudos, cesta básicas, vestuários etc...(cpf / cnpj)
	}
	
	// gerir os recursos recebidos, como faremos ? alguma relação com essa classe ?

}
