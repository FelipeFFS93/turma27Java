programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real a, b, c, r, s, d

		escreva("Digite um valor inteiro: ")
		leia(a)
		escreva("Digite um segundo valor inteiro: ")
		leia(b)
		escreva("Digite um terceiro valor inteiro: ")
		leia(c)


		r = Mat.potencia ((a+b),2)
		s = Mat.potencia ((b+c),2)


		// r = (a+b) * (a+b)
		// s = (b+c) * (a+b)

		d = (r + s) / 2

		escreva("Resultado da expressão é: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */