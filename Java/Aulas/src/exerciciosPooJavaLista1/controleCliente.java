/*
  1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto
   no console.
 */

package exerciciosPooJavaLista1;

public class controleCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		
		cliente1.cadastrar();
		cliente1.verificarCliente();
		System.out.println();
		cliente1.ligar();
	}

}
