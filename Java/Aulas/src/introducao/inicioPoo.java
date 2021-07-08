
/*
 NOME
SEXO: M/F/O
ANO NASCIMENTO
OI SR/A/E [NOME], SUA IDADE É XX ANOS!

 */

package introducao;

import java.util.Scanner;

public class inicioPoo {

	public static void main(String[] args) {
		
		String nome="", gen="";
		int ano=0, idade=0, maiorIdade =0,menorIdade=0;

		Scanner read = new Scanner(System.in);
		
		
		for(int x = 0; x <3;x++) {
			
		System.out.println("Qual o seu nome? ");
		nome = read.next();
		System.out.println("Como você se identifica?");
		gen = read.next();
		System.out.println("Qual seu ano de nascimento?");
		ano = read.nextInt();
		
		idade = 2021 - ano;
		
		menorIdade = idade;
		
		if((2021-ano) > maiorIdade) {
			maiorIdade = idade;
		}
		if((2021-ano) < menorIdade) {
			menorIdade = idade;
		   }
		
	}
		
		
	
			
		System.out.println("Bom dia Sr.[a]");
		System.out.println("A maior idade entre vocês é de: " + maiorIdade);
		System.out.println("A menor idade entre vocês é de: " + menorIdade);
		
	}

}
