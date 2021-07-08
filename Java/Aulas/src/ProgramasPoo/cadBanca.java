package ProgramasPoo;

import java.util.Scanner;

import objetos.frontMaquiagem;
import objetos.pessoa;

public class cadBanca {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		pessoa cliente1 = new pessoa();
		frontMaquiagem linhas = new frontMaquiagem();
		
		System.out.println("Digite o nome: ");
		cliente1.nome = read.next();
		System.out.println("Digite seu ano de nascimento:");
		cliente1.anoNascimento = read.nextInt();
		
		if(cliente1.calcularIdade(2021)>=18) {
			linhas.linha(50);
			System.out.println("          Pode entrar na Desmanche!!");
			linhas.linha(50);
		}
		else {
			linhas.linha(50);
			System.out.println("      Proibida a entrada na Desmanche!!");
			linhas.linha(50);
		}
		
	}

}
