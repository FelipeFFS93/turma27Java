// 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa
//    em segundos e mostre-o expresso em horas, minutos e segundos.

programa
{
	
	funcao inicio()
	{
		inteiro segundos, segundosR, horas, minutos 
		
		escreva("Quantos segundos você quer transformar? ")
		leia(segundos)

		horas = (segundos/3600) 
		minutos = (segundos % 3600) / 60
		segundosR = (segundos % 3600) % 60
		
		escreva("Seu evento tem  " + horas + " horas e, " + minutos + " minutos, e " + segundosR + " segundos de duração")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */