package introducao;

import java.util.Scanner;

public class positivoOuNegativo {

	public static void main(String[] args) {
			
		Scanner read = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero qualquer: ");
		numero = read.nextInt();
		
		if(numero < 0) {
			System.out.println("O numero não é valido, digite um valor maior ou igual a 0");
		}
		else if(numero == 0) {
			System.out.printf("O numero %d é neutro!",numero);			
		}
		else if(numero % 2 == 0){
			System.out.printf("O numero %d é par!",numero);
		}else {
			System.out.printf("O numero %d é impar!",numero);			
		}

	}

}
