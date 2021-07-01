package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int segundos, segundosR, horas, minutos;
		
		System.out.println("Digite qual o tempo do seu evento em seguntos ");
		segundos = read.nextInt();
		
		horas = (segundos/3600);
		minutos = (segundos % 3600) / 60;
		segundosR = (segundos % 3600) % 60;	
		
		System.out.printf("Seu evento terá %d hora(s), %d minuto(s) e %d segundo(s)",horas,minutos,segundosR);
		
	}

}
