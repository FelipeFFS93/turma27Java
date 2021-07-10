package exerciciosPooJavaLista1;

public class Paciente {

	public int cod;
	public String nome;
	public boolean estado;
	public int telefoneFamilia;
	public String endereco;
	
	
	public void darAlta () {
		if(estado == true) {
			System.out.println("Paciente está bem, pode retornar para casa");
		}
	}
	
	public void morrer(boolean estado) {
		if(estado == false) {
			System.out.printf("Ligar para %d , paciente faleceu",telefoneFamilia);
		}
	}
	
	
	public void verificarPaciente() {
		System.out.printf("Codigo: %d \nNome: %s \nTelefone da Familia: %d \nEndereço: %s",cod,nome,telefoneFamilia,endereco);
	}
}
