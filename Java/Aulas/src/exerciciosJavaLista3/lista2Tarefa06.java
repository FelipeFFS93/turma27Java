/*
 Escrever um programa que receba vários números inteiros no teclado.
 E no final imprimir a média dos números múltiplos de 3.
 Para sair digitar 0(zero).(DO...WHILE) 
 */


package exerciciosJavaLista3;

import java.util.Scanner;

public class lista2Tarefa06 {

	public static void main(String[] args) {
			
		Scanner read = new Scanner(System.in);

		int numero = 0, soma=0;
		int media = 0, contador=-1;
		
		do {
			System.out.println("Digite um numero:");
			numero = read.nextInt();
			if (numero < 0) {
				System.out.println("\nDigite um numero inteiro e positivo:\n");
			}else if (numero % 3 == 0){
				soma += numero;
				contador++;
			}
			
		}while(numero !=0);
		
		media = (soma / contador);
		
		System.out.printf("\nA média da soma dos números é: %d ",media);
		System.out.println("\nPrograma Finalizado");
	}

}
