package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.Avi�o;

public class controleAviao {

	public static void main(String[] args) {
		
		Avi�o av01 = new Avi�o();

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
