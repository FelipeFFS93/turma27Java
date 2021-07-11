package exerciciosPooJavaLista2;

public class AnimalSuperC {

	private String nome;
	private int idade;
	
	//Construtor
	public AnimalSuperC(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	//Geters and setter - encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodos
	
	public void emitirSom() {
		System.out.println("O cachorro faz AuAu!\nO cavalo Relincha!!\nE a preguiça Dorme e Ronca!");
	}
	
	
		
}
