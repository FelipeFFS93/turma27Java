/*
 Crie um programa que leia um n�mero do teclado at� que encontre um
  n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
  (DO...WHILE) 
 */

package exerciciosJavaLista3;

import java.util.Scanner;

public class lista2Tarefa05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero = 0;
		int soma= 0;
		
		do {
			System.out.println("Escreva um n�mero para soma");
			numero = read.nextInt();
			soma += numero;
			
		}while(numero != 0);
		
		System.out.printf("A soma de todos os numeros digitados � de: %d",soma);
	}

}
