package introducao;

import java.util.Scanner;

public class scaner {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		String nome;
		double salario;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite o seu ano de nascimento");
		anoNascimento = leia.nextInt();
		
		System.out.println("Digite o seu salario: ");
		salario = leia.nextDouble();
		
		System.out.printf("Oi %s, sua idade é %d anos e seu salario é de R$: %.2f",nome,(2021-anoNascimento),salario);
	}

}
