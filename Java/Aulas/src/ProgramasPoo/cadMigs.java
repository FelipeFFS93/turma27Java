package ProgramasPoo;

import java.util.Scanner;

import objetos.pessoa;

public class cadMigs {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		pessoa amigo1 = new pessoa();
		pessoa amigo2 = new pessoa();
		int idadeTeste=0;
		
		System.out.println("amigo 1: ");
		System.out.println("digite o nome: ");
		amigo1.nome=leia.next();
		System.out.println("digite o sexo (M/F/O): ");
		amigo1.sexo=leia.next().charAt(0);
		System.out.println("digite o ano de nascimento: ");
		amigo1.anoNascimento=leia.nextInt();
		
		
		System.out.println("amigo 2: ");
		System.out.println("digite o nome: ");
		amigo2.nome=leia.next();
		amigo2.anoNascimento=2000;
		idadeTeste = amigo2.calcularIdade(2030);
		
		System.out.println(amigo1.nome+" sua idade �: "+amigo1.calcularIdade());
		System.out.println(amigo1.nome+" sua idade �: "+idadeTeste);
		
		
		}

}
