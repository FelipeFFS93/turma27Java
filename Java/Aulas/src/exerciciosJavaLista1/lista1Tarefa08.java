package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa08 {

	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	
	double carroC, imposto, distribuidorP, carroF;
	
	System.out.println("Qual o valor do custo do carro? ");
	carroC = read.nextDouble();
	System.out.println("Qual a % do Distribuidor? ");
	distribuidorP = read.nextDouble();
	System.out.println("Qual a % dos impostos? ");
	imposto = read.nextDouble();
	
	carroF = (carroC * (distribuidorP / 100)) + (carroC * (imposto / 100)) + carroC;
	
	System.out.printf("O valor final do carro para consumidor é de R$ %.2f ",carroF);
			
	}

}
