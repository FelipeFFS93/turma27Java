package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.Patinete;

public class controlePatinete {

	public static void main(String[] args) {
	
		Patinete pat1 = new Patinete();
		
		pat1.marca = "Xiaomi";
		pat1.modelo = "X-10";
		pat1.cor = "Prata";
		pat1.eletrico = true;
		pat1.publico = "Adulto";
		pat1.bateria = 40;
		pat1.estado = false;
		
		pat1.verificarPatinete();
		System.out.println();
		pat1.verificarBateria();
		System.out.println();
		pat1.ligar();
		System.out.println("Viajando...");
		pat1.desligar();
	}

}
