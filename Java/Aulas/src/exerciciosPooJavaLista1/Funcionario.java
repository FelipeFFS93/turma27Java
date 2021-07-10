package exerciciosPooJavaLista1;

public class Funcionario {
	
	public int codigo;
	public String nome;
	public String turno;
	public double salario;
	public String setor;
	public String funcao;
	public boolean situacao;
	
	public void trocarTurno() {
		if(turno == "Manha") {
			System.out.println("Escolha turno para mudar, Tarde ou Noite");
		}
		else if(turno == "Tarde") {
			System.out.println("Escolha turno para mudar, Manha ou Noite");
		}
		else {
			System.out.println("Escolha turno para mudar, Manha ou Tarde");
		}
	}
	
	public void ligarFuncionario() {
		situacao = true;
		System.out.println("Funcionario readmitido");
	}
	
	public void desligarFuncionario() {
		situacao = false;
		System.out.println("Funcionario desligado");
	}
	
	
	public void receber(int diaAtual) {
		if(diaAtual == 5) {
			System.out.println("Dia de receber salario");
		}
		else {
			System.out.println("Ainda não é o dia de receber o salario!");
		}
	}
		
	public void verificarFuncionario() {
		System.out.printf("Codigo de funcionario: %d \nNome: %s \nSetor: %s \t Turno: %s \t Função: %s \nSalario: R$%.2f",codigo,nome,setor,turno,funcao,salario);
	}

}
