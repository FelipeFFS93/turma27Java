/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
 * (FOR)
*/
package exerciciosJavaLista3;

import java.util.Arrays;
import java.util.Scanner;

public class lista2Tarefa02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] par = new int [10];
		int[] impar = new int [10];
		int numero;
		int qPar = 0, qImpar = 0;
		
		for(int x = 0; x <= 9; x++) {
			System.out.println("Escreva um numero");
			numero = read.nextInt();
			if (numero < 0 || numero == 0) {
				System.out.println("Digite um valor maior que 0");
				break;
				}
			else {
			if(numero % 2 ==0) {
				par[x] = numero;
				qPar++;
			}else {
				impar[x] = numero;
				qImpar++;
			}
		}
	}
		System.out.println(Arrays.toString(par)+" A quantidade de numeros pares é de: "+qPar);
		System.out.println(Arrays.toString(impar)+" A quantidade de numeros pares é de: "+qImpar);
	}
}
