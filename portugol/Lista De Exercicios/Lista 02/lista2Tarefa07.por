/*
7) Receber valores de base e altura de um triângulo e verificar 
se são valores válidos (positivos maiores que zero). Em caso afirmativo, 
calcular a área do triângulo.
*/

programa
{
	
	funcao inicio()
	{
		real base, altura, triangulo

		escreva("Digite o valor de base ")
		leia(base)
		escreva("Digite o valor de altura ")
		leia(altura)
		limpa()

		se(base > 0 e altura > 0 e altura > base){
			triangulo = (base * altura) /2
			escreva("O valor do triangulo é: " , triangulo)
			}
		senao {
			escreva("Os valores não são validos")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */