package introducao;

import java.util.Scanner;

public class lojaJava {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String produtos[] = {"Banana ","Maça   ","Abacaxi","Maracuja","Melão  ","Melancia","Laranja","Morango","Pera   ","Acerola"};
		double precos[] = {7,5,10,8,9,12,5,8,8,6};
		int codigo [] = {1,2,3,4,5,6,7,8,9,10};
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		double carrinho[] = new double[10];
		String nome = ""; 
		int opc,opc2=0, somaCarrinho=0, quantidade=0;
		
		
		System.out.println("Digite o seu nome: ");
		nome = read.next();
		System.out.println(nome + "!! Bem vindes a HORTIFRUTE-G2!!");
		System.out.println("\nDigite a opção do Menu!!");
		
		do {
			System.out.println("\nDigite:\n 1- Listar Itens\n 2- Comprar\n 3- Ver Carrinho\n 4- Finalizar Compra\n 5- Sair");
			opc = read.nextInt();
			if(opc==1) {
				System.out.println("Produtos:");
				System.out.println("Codigo:          Produto:         Preço          Estoque");
				for(int x = 0; x < produtos.length; x++) {
					if(x <= 8) {
					System.out.println("G2 - 0"+codigo[x]+" \t "+produtos[x]+"\t  R$: "+precos[x]+" KG \t :"+estoque[x]);
				}
					if(x == 9) {
						System.out.println("G2 - "+codigo[x]+" \t "+produtos[x]+"\t  R$: "+precos[x]+" KG \t :"+estoque[x]);
					}
					
				}
			}else if(opc == 2) {
				System.out.println("Escolha o codigo do produto:");
				opc2 = read.nextInt();
				for(int x = 0; x < carrinho.length; x++) {
				if(opc2 ==1) {
					for(int y = 0; y < 10; y++) {
					System.out.println("\nDigite a quantidade:");
					quantidade = read.nextInt();
					carrinho[opc2] = quantidade * precos[opc2]; 
					System.out.printf("$d - %d[s] foram adicionados no seu carrinho",quantidade,produtos[opc2]);
					}
				}
				if(opc2 ==2) {
				}
				if(opc2 ==3) {
				}
				if(opc2 ==4) {
				}
				if(opc2 ==5) {
				}
				if(opc2 ==6) {
				}
				if(opc2 ==7) {
				}
				if(opc2 ==8) {
				}
				if(opc2 ==9) {
				}
				if(opc2 ==10) {
				}
			}
				
			}else if(opc == 3) {
				System.out.println("funciona 03");
			}else if(opc == 4) {
				
			}
			
		}while(opc != 5);
		System.out.println("Obrigado por escolher a HORTIFRUTE-G2!!!");
		System.out.println(carrinho[1]);
		}	
	}


