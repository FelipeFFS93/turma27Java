/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, rN1, rN2, rN3, rN4

		escreva("Digite um primeiro numero ")
		leia(n1)
		escreva("Digite um segundo numero ")
		leia(n2)
		escreva("Digite um terceiro numero ")
		leia(n3)
		escreva("Digite um quarto numero ")
		leia(n4)
		limpa()

		rN1 = Mat.potencia(n1,2)
		rN2 = Mat.potencia(n2,2)
		rN3 = Mat.potencia(n3,2)
		rN4 = Mat.potencia(n4,2)

		se(rN3 >= 1000){
			escreva("O valor de ", n3 , " ao quadrado é igual a : " , rN3)
			}senao{
				escreva(
				"\n O valor de ", n1, " ao quadrado é igual a : ", rN1, 
				"\n O valor de ", n2, " ao quadrado é igual a : ", rN2,
				"\n O valor de ", n3, " ao quadrado é igual a : ", rN3,
				"\n O valor de ", n4, " ao quadrado é igual a : ", rN4)
				}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 996; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */