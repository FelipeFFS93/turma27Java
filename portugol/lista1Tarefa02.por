//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e
//mostre-a expressa em anos, meses e dias. 

programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, r, dias, diasR
		
		escreva("Quantos dias você já viveu")
		leia(dias)

		anos = (dias/365) 
		meses = (dias % 365) / 30
		diasR = (dias % 365) % 30
		
		escreva("Você já viveu " + anos + " anos e, " + meses + " mes(es), e " + diasR + " dias de vida")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 73; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */