programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro celsius
		inteiro fahrenheit
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(fahrenheit)
		celsius = ((fahrenheit - 32) * 5/9)
		
		escreva(nome + ", A temperatura em Celsius é : " + celsius + "ºC")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */