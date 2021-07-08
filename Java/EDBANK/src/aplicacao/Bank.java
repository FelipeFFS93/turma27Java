package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Bank {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double valor;
		String nome;
		int numero;
		
		/*System.out.println("Digite o nome do cliente: ");
		nome = read.next();
		System.out.println("Digite o numero da conta: ");
		numero = read.nextInt();
		
		Conta cli1= new Conta(numero,nome);*/
		
		
		ContaPoupanca cp1 = new ContaPoupanca(5,"Jaqueline",15);
		ContaEspecial ce1 = new ContaEspecial(113,"Barbara",5000);
		
		System.out.println("Cliente :" + cp1.getNomeCliente());
		System.out.println("Saldo :" + cp1.getSaldo());
		
		
		System.out.println("Digite o valor do credito: ");
		valor = read.nextDouble();
		cp1.credito(valor);
		
		clearScreen(15);
		System.out.println("Digite o valor do debito: ");
		valor = read.nextDouble();
		clearScreen(15);
		cp1.debito(valor);
		
		System.out.println("Saldo : R$ "+cp1.getSaldo());
	}
	
	
	
	public static void clearScreen(int rodadas) {  
	    for(int x = 0;x < rodadas;x++) {
	    	System.out.println();
	    }
	} 

}
