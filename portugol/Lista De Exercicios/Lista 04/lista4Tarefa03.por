/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma
posição das matrizes N1 e N2;

b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de 
mesma posição das matrizes N1 e N2.

*/

programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matrizN1[4][6]
		inteiro matrizN2[4][6]
		inteiro matrizM1[4][6]
		inteiro matrizM2[4][6]

		inteiro linha = 0
		inteiro coluna = 0

		//inteiro diagonal = 0

		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				/*escreva("Digite o valor de ",linha," - ",coluna, " N1: ")
				leia(matrizN1[linha][coluna])
				escreva("Digite o valor de ",linha," - ",coluna, " N2: ")
				leia(matrizN2[linha][coluna])
				matrizM1[linha][coluna] = matrizN1 [linha][coluna] + matrizN2[linha][coluna]
				matrizM2[linha][coluna] = matrizN1 [linha][coluna] - matrizN2[linha][coluna]
				*/

				matrizN1[linha][coluna] = Util.sorteia(3,4)
				matrizN2[linha][coluna] = Util.sorteia(0,2)
				matrizM1[linha][coluna] = matrizN1 [linha][coluna] + matrizN2[linha][coluna]
				matrizM2[linha][coluna] = matrizN1 [linha][coluna] - matrizN2[linha][coluna]
			}
		}

		
		escreva("Matriz N1\n")
		escreva("\n")
		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva(matrizN1[linha][coluna], " ")
				/*se(linha == coluna){
					diagonal += matrizN1[linha][coluna]
					}*/
				}
				escreva("\n")
			}
				/*escreva("Somatoria da diagonal principal é: ", diagonal)
				escreva("\n")*/
			
		escreva("\n")
		escreva("Matriz N2\n")
		escreva("\n")
		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva(matrizN2[linha][coluna], " ")
				}
				escreva("\n")
			}

		escreva("\n")
		escreva("Matriz M1\n")
		escreva("\n")
		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva(matrizM1[linha][coluna], " ")
				}
				escreva("\n")
			}

		escreva("\n")
		escreva("Matriz M2\n")
		escreva("\n")
		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva(matrizM2[linha][coluna], " ")
				}
				escreva("\n")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizN1, 17, 10, 8}-{matrizN2, 18, 10, 8}-{matrizM1, 19, 10, 8}-{matrizM2, 20, 10, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */