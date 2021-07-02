 // 1-Faça um programa que receba três inteiros e diga qual deles
// é o maior
  

package exerciciosJavaLista2;

import java.util.Scanner;

public class lista2Tarefa01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, maiorNumero=0;
		
		for(int x = 0; x < 3; x++){
			
			System.out.println("Digite um valor inteiro: ");
			numero = read.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			
		}
		System.out.printf("O maior numero entre os numeros digitados é: %d",maiorNumero);
	}

}
