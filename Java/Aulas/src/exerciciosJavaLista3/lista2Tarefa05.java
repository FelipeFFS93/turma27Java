/*
 Crie um programa que leia um número do teclado até que encontre um
  número igual a zero. No final, mostre a soma dos números digitados.
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
			System.out.println("Escreva um número para soma");
			numero = read.nextInt();
			soma += numero;
			
		}while(numero != 0);
		
		System.out.printf("A soma de todos os numeros digitados é de: %d",soma);
	}

}
