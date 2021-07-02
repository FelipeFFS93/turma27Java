/*3- Faça um programa que receba a idade de uma pessoa e mostre
 *  na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 * */


package exerciciosJavaLista2;

import java.util.Scanner;

public class lista2Tarefa03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = read.nextInt();
		
		if(idade < 10) {
			System.out.println("Não se enquadra em nenhuma categoria ");
		}
		else if(idade >= 10 && idade <= 14) {
			System.out.println("Se enquadra na categoria 'Infantil' ");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Se enquadra na categoria 'Juvenil' ");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Se enquadra na categoria 'Adulto' ");
		}
		else {
			System.out.println("Não se enquadra em nenhuma categoria ");
		}
	}

}
