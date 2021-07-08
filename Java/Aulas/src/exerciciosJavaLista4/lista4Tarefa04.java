/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 * 
 */
package exerciciosJavaLista4;

import java.util.Random;

public class lista4Tarefa04 {

	public static void main(String[] args) {
		
		int matriz1 [][] = new int [3][3];
		
		int coluna=0, linha=0, soma=0, somaDiagonal=0;
		
		Random sorteador = new Random();
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0;coluna < 3; coluna++) {
				matriz1[linha][coluna] = sorteador.nextInt(10)+1;
				System.out.print(matriz1[linha][coluna]+" ");
				
				soma += matriz1[linha][coluna];
				
				if(linha == coluna) {
					somaDiagonal += matriz1[linha][coluna];
				}
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("A soma da Matriz é: "+soma);
		System.out.println("A soma da diagonal é: "+somaDiagonal);
	}

}
