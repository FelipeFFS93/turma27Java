/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um 
programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
determine e imprima a média aritmética dos lançamentos, contabilize e 
apresente também quantas foram as ocorrências da maior pontuação.
*/
programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro dado[10], media = 0, soma = 0, maiorNumero =0, contador = 0
		para(inteiro i = 0; i < 10; i++){
			/*escreva("Digite um numero de 1 a 6: ")
			leia(dado[i])
			limpa()*/

			dado[i] = Util.sorteia(1,6)
			
			}

		para(inteiro i = 0; i < 10; i++){
			escreva(dado[i])
			escreva("\n")

			soma += dado[i]
			
			se(dado[i] > maiorNumero){
				maiorNumero = dado[i]
				}
			

			}

			para(inteiro i = 0; i < 10; i++){
				se(dado[i] == maiorNumero){
				contador = contador+1}
		
			}

			media = soma / 10
			escreva("\n")
			escreva("A média é de: ",media)
			escreva("\n")
			escreva("O maior numero foi: ", maiorNumero)
			escreva("\n")
			escreva("O maior numero repetiu: ", contador, "x")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */