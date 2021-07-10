package exerciciosPooJavaLista1;

public class ContaBancaria {
	
	public int cod;
	public String nome;
	public double saldo;
	
	public void credito(double valorCredito) {
		saldo = saldo + valorCredito;
	}
	
	public void debito(double valorDebito) {
		if(valorDebito <= 0) {
			System.out.println("Digite um valor positivo!!");
		}
		else if(valorDebito > saldo) {
			System.out.println("Saldo indisponivel para saque!");
		}
		else {
			saldo = saldo - valorDebito;
		}
	}
	
	public void verificaUsuario() {
		System.out.printf("Codigo: %d \nNome: %s \nSaldo: %.2f",cod,nome,saldo);
	}

}
