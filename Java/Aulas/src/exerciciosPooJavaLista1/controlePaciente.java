package exerciciosPooJavaLista1;

import exerciciosPooJavaLista1.Paciente;

public class controlePaciente {

	public static void main(String[] args) {
		
		Paciente pc1 = new Paciente();
		
		pc1.cod = 1358;
		pc1.nome = "Barbara";
		pc1.estado = true;
		pc1.telefoneFamilia = 970330774;
		pc1.endereco = "Rua Alibaba";
		
		
		pc1.verificarPaciente();
		System.out.println();;
		pc1.morrer(false);
		System.out.println();
	}

}
