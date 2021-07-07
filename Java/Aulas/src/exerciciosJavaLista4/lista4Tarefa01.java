/*
 Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
  e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 de uma atividade e o escreva em seguida. Encontre após a maior pontuação e 
 a apresente. 
 */

package exerciciosJavaLista4;

import java.util.Arrays;
import java.util.Scanner;

public class lista4Tarefa01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numDigitado=0;
		int numero[] = new int [5];
		int maiorNumero = 0;
		
		for(int x = 0; x < numero.length; x++) {
		System.out.println("Digite um numero: ");
		numDigitado = read.nextInt();
		
		numero[x] = numDigitado;
		
		if(numero[x] > maiorNumero){
			maiorNumero = numero[x];
			}
		}
		
		System.out.println(Arrays.toString(numero)+"\n");
		System.out.println("O maior numero digitado é: "+maiorNumero);
	}
}
