package exerciciosJavaLista1;

import java.util.Scanner;

public class lista1Tarefa02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		int anos, meses, r, dias, diasR;
		
		System.out.println("Quantos dias voc� j� viveu" );
		dias = read.nextInt();
		
		anos = (dias/365) ;
		meses = (dias % 365) / 30;
		diasR = (dias % 365) % 30;
		
		System.out.printf("Voc� j� viveu %d anos, %d meses e %d dias!",anos,meses,diasR);
	}

}
