/*
 * Faça um programa em que permita a entrada de um número qualquer
 *  e exiba se este número é par ou ímpar. Se for par exiba também 
 *  a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao 
 *  quadrado.
 * */

package exerciciosJavaLista2;

import java.util.Scanner;

public class lista2Tarefa04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero;
		double raiz, potencia;
		
		System.out.println("Digite um número qualquer ");
		numero = read.nextInt();
		
		
		if(numero <= 0) {
			System.out.println("O numero é menor ou igual a 0");
		}
		else if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			
			System.out.printf("Seu numero é Par! E a raiz quadrada do numero %d é %f",numero,raiz);
		}
		else {
			potencia = Math.pow(numero, 2);
			
			System.out.printf("Seu numero é impar! E a potencia do numero %d é %f",numero,potencia);
		}
	}

}
