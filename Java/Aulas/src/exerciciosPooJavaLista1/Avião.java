/*
 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
  em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es
   deste objeto no console.
 */

package exerciciosPooJavaLista1;

import java.util.Scanner;

public class Avi�o {
	
	public String modelo;
	public int qAcentos;
	public String companhia;
	public int qGasolina;
	public Boolean ligado;
	
	public void ligar() {
		ligado = true;
			System.out.println("Ligando o avi�o.....");
	}
	
	public void desligar() {
		ligado = true;
			System.out.println("Desligando o avi�o......");
	}
	
	public void abastecer() {
		if(qGasolina < 500) {
			System.out.println("Taxiar avi�o para abastecer!");
		}
		else {
			System.out.println("Avi�o abastecido!");
		}
	}
	
	public void verificarAviao () {
		System.out.printf("Avi�o de modelo: %s \nQuantidade de acentos: %d \nCompania aeria: %s",modelo,qAcentos,companhia);
	}
}
