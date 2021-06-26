programa
{
	
	funcao inicio()
	{

		inteiro idade
		inteiro contador = 1
		
		escreva("Digite a sua idade: ")
		leia(idade)
		
		enquanto(idade < 18){
			escreva("Você não tem permissão para acessar \n")

			escreva("Difite a sua idade: ")
			leia(idade)
			contador++

			se(contador >= 3){
				escreva("Você já tentou 3x \n")
				pare
				}
		}
		
		se(contador == 1){
			escreva("Parabéns, agora você tem acesso")
		}senao{
			escreva("Acesso bloqueado \n")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */