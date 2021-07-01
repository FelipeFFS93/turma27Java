package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Digite um valor inteiro: ");
		a = read.nextDouble();
		System.out.println("Digite um segundo valor inteiro: ");
		b = read.nextDouble();
		System.out.println("Digite um terceiro valor inteiro: ");
		c = read.nextDouble();

		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		
		d = (r + s) / 2;
		
		System.out.printf("O resultado da expressão é: %.2f", d);
		
	}

}
