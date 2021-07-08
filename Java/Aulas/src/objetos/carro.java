package objetos;

public class carro {

	public int numChassi;
	public int numMotor;
	public int aroRodas;
	public int qPortas;
	public boolean ligado;
	public int velocidade;
	
	public void ligarCarro(){
		ligado=true;
		System.out.println("Carro ligando....");
	}
	
	public void desligarCarro(){
		if(velocidade==0) {
			ligado=false;
			System.out.println("Carro desligando....");
		}
		else {
			System.out.println("Desacelerar o carro primeiro!");
		}
	}
	
	public void acelerar() {
		velocidade++;
	}
	
	public void desacelerar() {
		velocidade++;
	}
}
