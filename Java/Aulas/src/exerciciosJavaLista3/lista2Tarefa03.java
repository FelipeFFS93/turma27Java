/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com 
 * menos de 21 anos. Total de pessoas com mais de 50 anos. O programa 
 * termina quando idade for =-99. (WHILE)
 */

package exerciciosJavaLista3;

import java.util.Scanner;

public class lista2Tarefa03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade = 0;
		int cinquenta = 0, vinteUm = 0;
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			if(idade <=0 && idade != -99) {
				System.out.println("Digite uma idade acima de 0");
			}
			else if(idade < 21) {
				vinteUm++;
			}
			else if(idade > 50){
				cinquenta++;
			}
			
		}
			System.out.printf("%d pessoas tem menos de 21 anos",vinteUm);
			System.out.printf("\n%d pessoas tem mais de 50 anos",cinquenta);
	}

}
