/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer
 *  e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m 
 *  a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao 
 *  quadrado.
 * */

package exerciciosJavaLista2;

import java.util.Scanner;

public class lista2Tarefa04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero;
		double raiz, potencia;
		
		System.out.println("Digite um n�mero qualquer ");
		numero = read.nextInt();
		
		
		if(numero <= 0) {
			System.out.println("O numero � menor ou igual a 0");
		}
		else if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			
			System.out.printf("Seu numero � Par! E a raiz quadrada do numero %d � %f",numero,raiz);
		}
		else {
			potencia = Math.pow(numero, 2);
			
			System.out.printf("Seu numero � impar! E a potencia do numero %d � %f",numero,potencia);
		}
	}

}
