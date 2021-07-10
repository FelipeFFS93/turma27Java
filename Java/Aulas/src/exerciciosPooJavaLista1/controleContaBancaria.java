package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.ContaBancaria;

public class controleContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cli1 = new ContaBancaria();
		
		cli1.cod = 5010;
		cli1.nome = "Felipe";
		cli1.saldo = 0.00;
		
		cli1.verificaUsuario();
		System.out.println();
		cli1.credito(1500);
		System.out.println();
		cli1.debito(2000);
		System.out.println();
		cli1.credito(700);
		System.out.println();
		cli1.verificaUsuario();
		System.out.println();
		cli1.debito(2000);
		System.out.println();
		cli1.verificaUsuario();
	}

}
