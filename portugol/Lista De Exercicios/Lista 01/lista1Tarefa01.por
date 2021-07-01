//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
//expressa apenas em dias. 

programa
{
	
	funcao inicio()
	{
		inteiro dia, mes, ano, anoR, diaR, mesR, resultado
		
		
		escreva("Qual o seu dia de nascimento? ")
		leia(dia)
		escreva("Qual o seu mês de nascimento? ")
		leia(mes)
		escreva("Qual o seu ano de nascimento? ")
		leia(ano)

		anoR = (2021 - ano)
		diaR = (1 - dia)
		mesR = (7 - mes)
		
		resultado = ((anoR * 365) + mesR * 30) + diaR

		escreva("Você já viveu" + resultado + " dias")

	//	escreva("Qual o seu dia de nascimento?")
	//	leia(dia)
	//	escreva("Qual o seu mês de nascimento?")
	//	leia(mes)
	//	escreva("Quantos anos você tem?")
	//	leia(ano)
	//	r = ((ano * 365) + mes * 30) + dia
	//	escreva("Você já viveu: " + r + " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */