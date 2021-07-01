package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa06 {

	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);	
	
	double d, x1, x2, y1, y2;
	
	System.out.println("Digite o valor de X1: ");
	x1 = read.nextDouble();
	System.out.println("Digite o valor de X2: ");
	x2 = read.nextDouble();
	System.out.println("Digite o valor de Y1: ");
	y1 = read.nextDouble();
	System.out.println("Digite o valor de Y2: ");
	y2 = read.nextDouble();
	
	d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	
	
	System.out.printf("A distancia de D é igual a: %.2f",d);
	}

}
