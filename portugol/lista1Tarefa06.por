//6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
//P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 

programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real d, x1, x2, y1, y2

		escreva("Digite o valor de X1 : ")
		leia(x1)
		escreva("Digite o valor de X2 : ")
		leia(x2)
		escreva("Digite o valor de Y1 : ")
		leia(y1)
		escreva("Digite o valor de Y2 : ")
		leia(y2)

		d = Mat.raiz ((Mat.potencia((x2-x1),2)) + (Mat.potencia((y2-y1),2)),2)

		escreva("A distancia D é igual a " + Mat.arredondar(d, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 98; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */