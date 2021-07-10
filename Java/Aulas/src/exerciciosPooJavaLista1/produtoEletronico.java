package exerciciosPooJavaLista1;

public class produtoEletronico {

	public String tipo;
	public String marca;
	public String cor;
	public int woltagem;
	public boolean bateriaInterna;
	public int porcentagemBateria;
	public boolean estado;
	
	
	public void ligar() {
		estado = true;
		System.out.println("Ligando aparelho.....");
	}
	
	public void desligar() {
		estado = false;
		System.out.println("Desligando aparelho.....");
	}
	
	public void ligar(boolean bateria) {
		if(estado == false && bateria == false) {
			estado = true;
			System.out.println("Colocar aparelho da tomada!");
			System.out.println("Ligando aparelho.....");
		}
	}
	
	public void desligar(boolean bateria) {
		if(estado == true && bateria == false) {
			estado = false;
			System.out.println("Tirar aparelho da tomada!");
			System.out.println("Desligando aparelho.....");
		}
	}
	
	public void verifarBateria() {
		if(bateriaInterna == true) {
			if(porcentagemBateria <= 50) {
				System.out.printf("Aparelho com %d% de bateria. Carregar aparelho....",porcentagemBateria);
			}
			else {
				System.out.printf("Aparelho com %d% de bateria.",porcentagemBateria);
			}
		}
	}
	
	public void verificarWoltagem() {
		if(woltagem == 220) {
			System.out.println("Conectar aparelho apenas na tomada do banheiro!");
		}
		else {
			System.out.println("Conectar aparelho em qualquer tomada, MENOS na do banheiro");
		}
	}
	
	public void verificarAparelho() {
		System.out.printf("Aparelho tipo: %s\nMarca: %s \nCor: %s",tipo,marca,cor);
	}
	
}
