/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares 
 * que são  múltiplos de três e que se encontram no conjunto dos números 
 * de 1 até 500.
*/

programa
{
	
	funcao inicio()
	{

		inteiro numeros = 0, somaNumeros = 0
		
		para(numeros = 0; numeros <= 500; numeros++){
			se(numeros % 2 == 1 e numeros % 3 == 0){
				somaNumeros += numeros
				
			escreva("A soma dos numeros impares e multiplos de 3 entre 1 e 500 são: ",somaNumeros)
			escreva("\n")
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */