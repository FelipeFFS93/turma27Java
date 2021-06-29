/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da 
primeira diagonal, ou seja, diagonal principal.
*/


programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz1[3][3]

		inteiro linha = 0
		inteiro coluna = 0
		inteiro soma = 0
		inteiro somaDiagonal= 0

		

		para(linha = 0; linha < 3; linha++){
			para(coluna = 0; coluna < 3; coluna++){
				matriz1[linha][coluna] = Util.sorteia(1,9)
				escreva(matriz1[linha][coluna], " ")
				

				soma += matriz1[linha][coluna]

				se(linha == coluna){
				somaDiagonal += matriz1[linha][coluna]

				}
				
			}
			escreva("\n")
			
				
			
	
			
		}
		escreva("\n")
		escreva("A soma da Matriz é: ", soma)
		escreva("\n")
		escreva("\nA soma da diagonal é: ",somaDiagonal)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */