/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
indicando se este número é par ou ímpar, e se é positivo ou negativo.*/


programa
{
	
	funcao inicio()
	{
		inteiro n1

		escreva("Digite um numero qualquer \n")
		leia(n1)
		limpa()

		se(n1 < 0){
			escreva("O numero é negativo!\n")
			}
		senao{
		se(n1 > 0){
			escreva("O numero é positivo!\n")
				}
		senao{
				escreva("O numero é igual a 0\n")
			}
		}
		
		se(n1 == 0){
			escreva("O numero é igual a 0\n")
			}
		senao se(n1 % 2 == 0){
			escreva("Seu numero é par!!\n")
			}senao{
				escreva("Seu numero é impar\n")
			}
					
					
				
				
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */