package entidades;

public class Conta {

	//ATRIBUTOS
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	
	//CONSTRUTOR
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

	//ENCAPSULAMENTO - GETTER AND SETTERS
	public int getNumero() {
		return numero;
	}


	/*public void setNumero(int numero) {
		this.numero = numero;
	}*/


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public double getSaldo() {
		return saldo;
	}


	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	//METODO
	
	public void credito(double valorCredito) {
		this.saldo = this.saldo + valorCredito;
	}
	
	public void debito(double valorDebito) {
		if(valorDebito <=0) {
			System.out.println("Digite um valor positivo");
		}
		else if (valorDebito > saldo) {
			System.out.println("Sem limite para saque");
		}else {
			this.saldo = this.saldo - valorDebito;
		}
		
	}
	
	 
	
}
