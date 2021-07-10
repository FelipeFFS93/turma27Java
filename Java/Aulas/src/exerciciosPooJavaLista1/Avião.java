/*
 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações
   deste objeto no console.
 */

package exerciciosPooJavaLista1;

import java.util.Scanner;

public class Avião {
	
	public String modelo;
	public int qAcentos;
	public String companhia;
	public int qGasolina;
	public Boolean ligado;
	
	public void ligar() {
		ligado = true;
			System.out.println("Ligando o avião.....");
	}
	
	public void desligar() {
		ligado = true;
			System.out.println("Desligando o avião......");
	}
	
	public void abastecer() {
		if(qGasolina < 500) {
			System.out.println("Taxiar avião para abastecer!");
		}
		else {
			System.out.println("Avião abastecido!");
		}
	}
	
	public void verificarAviao () {
		System.out.printf("Avião de modelo: %s \nQuantidade de acentos: %d \nCompania aeria: %s",modelo,qAcentos,companhia);
	}
}
