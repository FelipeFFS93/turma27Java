package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa07 {

	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);	
	
	double a, b, c, d, E, f, x, y;
	
	System.out.println("Digite A: ");
	a = read.nextDouble();
	System.out.println("Digite B: ");
	b = read.nextDouble();
	System.out.println("Digite C: ");
	c = read.nextDouble();
	System.out.println("Digite D: ");
	d = read.nextDouble();
	System.out.println("Digite E: ");
	E = read.nextDouble();
	System.out.println("Digite F: ");
	f = read.nextDouble();
	
	x =  ((c*E) - (b*f)) / ((a*E) - (b*d));
	y =  ((a*f) - (c*d)) / ((a*E) - (b*d));
	
	System.out.printf("O valor de X é igual = %f e o valor de Y é = %f",x,y);
	
	
	}

}
