/*
 Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
 */

package exerciciosJavaLista4;

import java.util.Random;

public class lista4Tarefa03 {

	public static void main(String[] args) {
		
		int N1 [][] = new int [4][6];
		int N2 [][] = new int [4][6];
		int M1 [][] = new int [4][6];
		int M2 [][] = new int [4][6];
		
		int coluna=0, linha=0;
		
		Random sorteador = new Random();
		
		
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				
					N1[linha][coluna] = sorteador.nextInt(10)+1;
					N2[linha][coluna] = sorteador.nextInt(10)+1;
					M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
					M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		
		System.out.println("Matriz N1\n");
		for(linha=0;linha <4;linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.print(N1[linha][coluna]+" ");
			}
			System.out.print("\n");
		}
		
		
		System.out.println("\nMatriz N2\n");
		for(linha=0;linha <4;linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.print(N2[linha][coluna]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nMatriz M1\n");
		for(linha=0;linha <4;linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.print(M1[linha][coluna]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nMatriz M2\n");
		for(linha=0;linha <4;linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.print(M2[linha][coluna]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
