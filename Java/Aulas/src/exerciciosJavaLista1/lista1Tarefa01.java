package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int dia, mes, ano, anoR, mesR, diaR, resultado;
				
		
		System.out.println("Digite seu dia de nascimento: ");
		dia = read.nextInt();
		System.out.println("Digite seu mes de nascimento: ");
		mes = read.nextInt();		
		System.out.println("Digite seu ano de nascimento: ");
		ano = read.nextInt();
		
		anoR = (2021 - ano);
		diaR = (1 - dia);
		mesR = (7 - mes);
		
		resultado = ((anoR * 365) + mesR * 30) + diaR;
		
		System.out.printf("Você já viveu %d dias de vida",resultado);
		
		
	}

}
