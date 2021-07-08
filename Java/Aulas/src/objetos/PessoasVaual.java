package objetos;

public class PessoasVaual {

	public String primeiroNome;
	public String ultimoNome;
	public String nomeDoMeio;
	
	public PessoasVaual(String primeiro,String meio, String ultimo){
		
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomeDoMeio = meio;
		
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + nomeDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
	
}
