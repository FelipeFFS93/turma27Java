/*
  1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto
   no console.
 */

package exerciciosPooJavaLista1;

import java.util.Scanner;

public class Cliente {
	
	public int codigo;
	public String nome;
	public String telefone;
	public int saldo;
	
	public void cadastrar() {
		
			Scanner read = new Scanner(System.in);
			
			System.out.println("Digite o codigo do cliente");
			codigo = read.nextInt();
			System.out.println("Digite o nome do cliente");
			nome = read.next();
			System.out.println("Digite saldo do cliente");
			saldo = read.nextInt();
			System.out.println("Digite o telefone do cliente");
			telefone = read.next();
			System.out.println();
	}
	
	
	public void verificarCliente() {
		System.out.printf("Codigo do cliente %d - Nome %s - saldo: R$ %d - telefone: %s",codigo,nome,saldo,telefone);
	}
	
	public void ligar() {
		if(saldo < 0) {
			System.out.printf("Ligando para %s para cobrar pendencias.....",telefone);
		}
		else if(saldo == 0) {
			System.out.printf("Ligando para %s para oferecer emprestimo.....",telefone);
		}
		
	}
	
}
