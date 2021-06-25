programa
{
	
	funcao inicio()
	{
		cadeia nome

		escreva("Digite o seu nome ")
		leia(nome)
		linha(50)
		pula()
		escreva("Olá ",nome ,"\n")
		linha(50)

		
	}

	funcao linha (inteiro tamanho){
		
		
		para (inteiro y = 1; y <= tamanho; y++){
			escreva("-")
			}
		}

	funcao pula (){
		escreva("\n")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */