/*
 * Uma empresa desenvolveu uma pesquisa para saber as características 
 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das
 *  pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
 *   e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
 *    se a pessoa era agressiva). Pede-se para elaborar um sistema que 
 *    permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 */

package exerciciosJavaLista3;

import java.util.Scanner;

public class lista2Tarefa04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade = 0;
		char sexo;
		char opcao;
		int pessoasCalmas = 0, mulheresNervosas = 0, pessoasCalmasMenos18Anos = 0;
		int homensAgressivos = 0, outrosCalmos = 0, pessoasNervosasMais40Anos = 0;
		char op='S';
		final int limite = 150;
		int contador=1;
		String nome;
		
		while(op == 'S' && contador <= limite) {
			System.out.println("Participante "+contador);		
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			System.out.println("Digite ");
			System.out.println("1- Feminino \n2- Masculino \n3- Outros");
			sexo = read.next().charAt(0);
			System.out.println("Selecione ");
			System.out.println("1 - Pessoa calma \n2 - Pessoa nervosa \n3 - Pessoa agressiva");
			opcao = read.next().charAt(0);
			
			if (opcao == 1) {
				pessoasCalmas++;
			}
			if(sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if(sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			if(idade < 18 && opcao == '1') {
				pessoasCalmasMenos18Anos++;
			}
			if(idade > 40 && opcao == '2') {
				pessoasNervosasMais40Anos++;
			}
			
			System.out.println("Continua S/N: ");
			op = read.next().toUpperCase().charAt(0);
			contador++;
		}
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervosas: "+mulheresNervosas);
		System.out.println("Homens agressivos: "+homensAgressivos);
		System.out.println("Outros calmos: "+outrosCalmos);
		System.out.println("Menor de 18 e calmos : "+pessoasCalmasMenos18Anos);
		System.out.println("Menor de 18 e calmos : "+pessoasNervosasMais40Anos);
	}

}
