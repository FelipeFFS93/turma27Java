package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa05 {

	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	
	double n1, n2, n3, mediaAritimetica;
	
	System.out.println("Digite a primeira nota: ");
	n1 = read.nextDouble();
	System.out.println("Digite a segunda nota: ");
	n2 = read.nextDouble();
	System.out.println("Digite a terceira nota: ");
	n3 = read.nextDouble();
	
	mediaAritimetica = ((n1*2) + (n2*3) + (n3*5)) / 10;
	
	System.out.printf("A média aritimética do aluno é: %.1f",mediaAritimetica);
	
	}

}
