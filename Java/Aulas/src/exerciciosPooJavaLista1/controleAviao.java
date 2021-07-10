package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.Avião;

public class controleAviao {

	public static void main(String[] args) {
		
		Avião av01 = new Avião();

		av01.modelo = "BiMotor";
		av01.qAcentos = 4;
		av01.companhia = "Jaquelaines";
		av01.qGasolina = 490;
		
		av01.verificarAviao();
		System.out.println();
		System.out.println();
		av01.abastecer();
		System.out.println();
		av01.ligar();
	
		
		
		
		
	}

}
