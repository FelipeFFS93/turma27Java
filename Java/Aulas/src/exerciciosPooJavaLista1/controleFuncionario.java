package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.Funcionario;

public class controleFuncionario {

	public static void main(String[] args) {
		
		Funcionario Jaquepatomba = new Funcionario();
		
		Jaquepatomba.codigo = 103010;
		Jaquepatomba.nome = "Jaqueline";
		Jaquepatomba.turno = "Manha";
		Jaquepatomba.setor = "T.i";
		Jaquepatomba.funcao = "Dev";
		Jaquepatomba.situacao = true;
		Jaquepatomba.salario = 10000.00;
		
		Jaquepatomba.verificarFuncionario();
		System.out.println("\n");
		Jaquepatomba.receber(5);
		System.out.println("\n");
		Jaquepatomba.desligarFuncionario();
		System.out.println("\n");
		Jaquepatomba.ligarFuncionario();
	}

}
