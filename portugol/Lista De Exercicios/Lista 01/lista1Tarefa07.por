// 7. Um sistema de equações lineares do tipo: 
// , pode ser resolvido segundo mostrado abaixo : 
 

programa
{
	
	funcao inicio()
	{
		real a, b, c, d, E, f, x, y

		escreva("Escreva a: " )
		leia(a)
		escreva("Escreva b: " )
		leia(b)
		escreva("Escreva c: " )
		leia(c)
		escreva("Escreva d: " )
		leia(d)
		escreva("Escreva e: " )
		leia(E)
		escreva("Escreva f: " )
		leia(f)

		x =  ((c*E) - (b*f)) / ((a*E) - (b*d))
		y = 	((a*f) - (c*d)) / ((a*E) - (b*d))

		escreva("O valor de X é igual = ", x , " e o valor de Y é = ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */