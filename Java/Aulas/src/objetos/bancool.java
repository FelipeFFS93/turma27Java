package objetos;

import objetos.Conta;
import java.util.Scanner;

public class bancool {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Conta cliente1 = new Conta(1);
		Conta cliente2 = new Conta(2);
		Conta cliente3 = new Conta(3,0);
		Conta cliente4 = new Conta(4,1000,5000);
			
	
		cliente1.setNumero(0);
		System.out.println("Numero da conta: "+cliente1.getNumero());
		
		cliente4.imprimeExtrato();
		cliente4.sacar(500.00);
		cliente4.imprimeExtrato();
		cliente4.depositar(700.00);
		cliente4.imprimeExtrato();

	}

}
