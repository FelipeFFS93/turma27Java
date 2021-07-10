package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.produtoEletronico;

public class controleProdutoEletronico {

	public static void main(String[] args) {
		
		produtoEletronico prod1 = new produtoEletronico();

		prod1.tipo = "Batedeira";
		prod1.marca = "Britania";
		prod1.cor = "Preto";
		prod1.woltagem = 110;
		prod1.bateriaInterna = false;
		
		
		prod1.verificarAparelho();
		System.out.println();
		prod1.verificarWoltagem();
		System.out.println();
		prod1.ligar(false);
		System.out.println("Batendo bolo.......");
		System.out.println("20 minutos depois....");
		prod1.desligar(false);
	}

}
