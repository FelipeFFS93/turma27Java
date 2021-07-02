//2 - Faça um programa que entre com três números e coloque em 
// ordem crescente.

package exerciciosJavaLista2;

import java.util.Scanner;
import java.util.Arrays;



public class lista2Tarefa02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		long[] numero = new long [3];
		
		
		for(int x = 0; x < numero.length; x++) {
			
			System.out.println("Digite um valor qualquer: ");
			numero[x] = read.nextInt();		
		}
		 Arrays.sort(numero);
		 System.out.println(Arrays.toString(numero));
	}
	
}
