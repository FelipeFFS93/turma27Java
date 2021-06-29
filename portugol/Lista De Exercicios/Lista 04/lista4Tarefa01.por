/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
 * de uma atividade e o escreva em seguida. Encontre após a maior pontuação 
 * e a apresente. 
*/
programa
{
	
	funcao inicio()
	{
		inteiro numero[5], maiorNumero = 0

		
		
		para (inteiro i = 0; i < 5; i++){
			escreva("Digite um numero: ")
			leia(numero[i])
			limpa()

			se(numero[i] > maiorNumero){
				maiorNumero = numero[i]
				}
	
			
		}

		para (inteiro i = 0; i < 5; i++){
			escreva("Numeros digitados: = ",numero[i])
			escreva("\n")
			}

		escreva("\n")	
		escreva("A maior pontuação foi: ",maiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */