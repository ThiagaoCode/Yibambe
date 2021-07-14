package Lucas;

import java.util.Scanner;
		import java.util.List;
		import java.util.ArrayList;
		
		public class ElasPorElas 
		{

			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
		       Scanner leia= new Scanner(System.in);
		       //INSTANCIAMOS AS CLASSES PRODUTOS E  NOTA FISCAL PARA UTILIZARMOS CLASSES E METODOS 
		      produtos produto = new produtos();
		      
		      NotaFiscal nota=new NotaFiscal();
		      
		      //CRIAMOS VARIAVEIS PARA SEGUIR O FLUXO DA APLICAÇÃO
		      int EscolhaDeProdutos;
		      int quantidade;
		      char continuar;
		      double parcela=0;
		      char ProximoCliente;
		    
		      //CRIAMOS A LISTA CARRINHO QUE SERA USADA PARA ADICIONAR OS PRODUTOS QUE FORAM COMPRADOS ELA
		      //COMECA VAZIA
		      List<String>carrinho=new ArrayList<>();
		      //NA LSITA PRODUTOS SERÃO ADICIONADOS OS PRODUTOS QUE ESTARAM DISPONIVEIS,OS ATRIBUTOS QUE
		      //COMPEM OS ATRIBUTOS SÃO OS DO CONSTRUTOR QUE CRIAMOS NA CLASSE PRODUTOS.
		      List<produtos>produtos=new ArrayList<>();
		      //ADD É PARA ADICIONAR PRODUTOS COMOS ATRIBUTOS DA CLASSE
		      produtos.add(new produtos(1,"   Kit sh + cond   "," Kit Shampoo e condicionador                          ",50.00,100));
		      produtos.add(new produtos(2,"   Shampoo          ","produto artesanal para cabelos crespos               ",20.00 ,70));
		      produtos.add(new produtos(3,"   Condicionador    ","produto artesanal para cabelos cacheados             ",20.00 ,70));
		      produtos.add(new produtos(4,"   Mascara          ","produto artesanal de hidrataçao capilar              ",30.00 ,50));
		      produtos.add(new produtos(5,"   Creme de pentear"," produto artesanal para cabelos cacheados             ",30.00 ,50));
		      produtos.add(new produtos(6,"   Leave in         ","produtos artesanais para cabelos ondulados           ",25.00 ,30));
		      produtos.add(new produtos(7,"   Oleo capilar    "," produto artesanal para cabelo crespo                 ",15.00 ,10));
		      produtos.add(new produtos(8,"   Oleo finalisador ","produtos artesanal para cabelo ondulado              ",20.00 ,40));
		      produtos.add(new produtos(9,"   Creme multy      ","produto artesanal para todos os tipos de cabelo      ",20.00 ,35));
		      produtos.add(new produtos(10,"  Creme 2 em 1    "," produto artesanal creme de pentear e cond.           ",25.00 ,60));
				
		     System.out.print("Bem vindo ao Elas por elas!\n");
		     System.out.print("Onde 40% do nosso lucro são destinados\n "
		     		+ "a mulheres pretas e em situação vulneraveis. Para mais informações acesse: www.yibambeelasporelas.com.br\n");
		     System.out.println("Digite seu nome: ");
		     nota.nomeCliente = leia.nextLine();
		     System.out.println("Digite seu cpf:");
		     nota.cpf=leia.next();
		   
		    do {
		    	//FIzEMOS UM FOR PARA O PROGRAMA LISTAR OS PRODUTOS QUE FORAM ADICIONADOS
		    	System.out.print("Cod  ---Produto------------------------ descricao ---------------------------valor----Estoque\n");
		    		 for(produtos prod: produtos) {
		    			 System.out.println(prod.getCodigo()+" "+prod.getNome()+" "+prod.getDescricao()+" "
		    					 +prod.getPreco()+"\t"+prod.getEstoque());
		    		 }
		    		 //AQUI É PARA ESCOLHER ENTRE O CODIGO DO PRODUTO QUE QUEREMOS
		    		 System.out.println("\nDigite o codigo do produto que deseja de 1 a 10");
		    		 EscolhaDeProdutos=leia.nextInt()-1;
		    		 //ESSE IF É PARA CASO DIGITE UM VALOR QUE NÃO EXISTE  ELE INFORME QUE É INVALIDO 
		    	if(produto.getCodigo()<=0 && produto.getCodigo()>=11) {
		    		System.out.println("\ndigite um numero valido");
		    	}
		    	else {
		    		//AQUI VAI MOSTRAR O PRODUTO QUE SELECIONAMOS
		    		System.out.print("---Produto------------------------ descricao ------------------------------valor---Estoque\n");
		    		 System.out.println(produtos.get(EscolhaDeProdutos).getNome()
		    		 +" "+produtos.get(EscolhaDeProdutos).getDescricao()+" "
							 +produtos.get(EscolhaDeProdutos).getPreco(
		)+"\t "+produtos.get(EscolhaDeProdutos).getEstoque());
		    		 //COLOCAMOS A QUATIDADE DE PRODUTOS QUE QUEREMOS
		    		 System.out.println("entre com a quantidade");
		    		 quantidade=leia.nextInt();
		    		 /// ADICIONAMOS NA LISTA CARRINHO APENAS COM NOME E PRECO
		    		 carrinho.add(new String(produtos.get(EscolhaDeProdutos).getNome()+" "
							 +produtos.get(EscolhaDeProdutos).getPreco(
		)+" "+quantidade));
		    		 
		    		 //CALCULAMOS  VALOR TOTAL DO CARRINHO FAZENDO A CONTA 
		    		 nota.valorTotal = nota.valorTotal+(quantidade*produtos.get(EscolhaDeProdutos).getPreco());
		    		 //CRIAMOS A VARIAVEL TAMANHO PARA MOSTRAR NOSSO CARINHO
		    		 int tamanho=carrinho.size();
		    		 
		    		 System.out.println("Carrinho:");
		    		 System.out.println("-------------------");
		    		 //FOR PARA LISTAR NOSSOS PRODUTOS QUE ESTÃO NO CARRINHO
		    		 for (int x=0;x<tamanho;x++) {
		    			 System.out.println(carrinho.get(x));
		    		 }
		    		 
		    		 System.out.println("-------------------");
		    		 
		    		 //PEGAMOS O PRODUTO E APLICAMSOS O METODO DIMINUIR ESTOQUE PARA MOSTRAR QUANDO O ESTOQUE FOR 
		    		 //DIMINUIDO
		    		 	produtos.get(EscolhaDeProdutos).DiminuirEstoque(quantidade);	
		    		 	
		    		 	
				 }
		    	//COLOCAMOS UM WHILE PARA CASO O CLIENTE QUEIRA CONTINUAR COMPRANDO
		    	//ELE DIGITE S E RETORNE LA PRA CIMA E ADICIONAR O NOVO PRODUDO
		    	System.out.println("deseja continuar comprando? (S/N)");
		    	continuar=leia.next().toUpperCase().charAt(0);
		    	
		    	}
		    while(continuar=='S');
		    
		    System.out.printf("\ntotal:R$%.2f",nota.valorTotal);
		    System.out.println("digite a forma de pagamento");
		    System.out.println("digite [1] para compra a vista ou dinheiro com 20% de desconto");
		    System.out.println("digite [2] para compra  a vista no cartão de credito com 15% de desconto");
		    System.out.println("digite [3] para parcelar em 2x sem juros");
		    System.out.println("digite [4] para parcelar em 3x com acrescimo de 10% de juros");
		    System.out.println("digite [5] para doar seu desconto de 10% no valor de suas compras para nossa causa e pagar avista");
		    int resposta=leia.nextInt();
		    
		    if(resposta==1) {
		    	double valor=0.80;
		        nota.valorTotal=(valor*nota.valorTotal)*1.00;
		        parcela=1;
		    }
		    else if (resposta==2) {
		   double valor=0.85;
			nota.valorTotal=(valor*nota.valorTotal)*1.00;
			parcela=1;
		}
			else if(resposta==3) 	{
		   double valor=1.00;
			 nota.valorTotal=(valor*nota.valorTotal)*1.00;
		     parcela=2;
		     }  
		else if(resposta==4) {
			double valor=1.10;
		nota.valorTotal=(valor*nota.valorTotal)*1.00;
		parcela=3;
		}
		else if(resposta==5) {
			double valor=1.0;
		nota.valorTotal=(valor*nota.valorTotal)*1;
		parcela=1;
		}
		    int tamanho= carrinho.size();
		            System.out.println("--------------------------------------");
		    		System.out.println("NOTA FISCAL");
		    	     System.out.println("--------------------------------------");
		    		System.out.println("Produto       Valor  quant.");
		    		for(int x=0; x<tamanho; x++)
		    		{
			      System.out.println(carrinho.get(x));
		    		}
		    		  System.out.println("-------------------------------------------------------------------");
		      System.out.printf("\nVALOR FINAL R$%.2f com %.0f parcela(s) de"
				+ " R$%.2f",nota.valorTotal,parcela,nota.valorTotal/parcela);
		      System.out.println("\tMuito Obrigado! "+nota.nomeCliente+ " Volte sempre e faça parte da causa.");
		      System.out.println("\n-------------------------------------------------------------------");
		}
		}

