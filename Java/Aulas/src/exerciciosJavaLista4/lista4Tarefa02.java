/*
 Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um 
 programa que gere um vetor com os lançamentos, escreva esse vetor.
  A seguir determine e imprima a média aritmética dos lançamentos, 
  contabilize e apresente também quantas foram as ocorrências da maior 
  pontuação.
  
 */

package exerciciosJavaLista4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class lista4Tarefa02 {

	public static void main(String[] args) {
		
		
		int dado[] = new int [10];
		Random gerador = new Random();
		int soma=0, media=0, maiorNumero=0, contador = 0;
		
		for(int x = 0; x < dado.length;x++) {
			int numero = gerador.nextInt(6)+1;
			dado[x] = numero;
			
		
			soma += dado[x];
			
			if(dado[x] > maiorNumero) {
				maiorNumero = dado[x];
			}
			
			
			}
			for(int y = 0; y < dado.length; y++) {
			if (dado[y] == maiorNumero) {
				contador++;
			}
			
			}
		media = soma/10;
		System.out.println(Arrays.toString(dado)+"\n");
		System.out.println("A média é de : "+media);
		System.out.println("O maior numero foi: "+maiorNumero);
		System.out.println("O maior numero repetiu: "+contador);
		
	}

}
