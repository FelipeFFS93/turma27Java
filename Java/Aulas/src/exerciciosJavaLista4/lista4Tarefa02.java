/*
 Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um 
 programa que gere um vetor com os lan�amentos, escreva esse vetor.
  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
  contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior 
  pontua��o.
  
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
		System.out.println("A m�dia � de : "+media);
		System.out.println("O maior numero foi: "+maiorNumero);
		System.out.println("O maior numero repetiu: "+contador);
		
	}

}
