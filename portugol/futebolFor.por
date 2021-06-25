// Desafio: Paulistinha do ED
//PAULISTINHA DO ED
//4 VARIAVEIS NOME DE UM TIME DE SÃO PAULO TIME1 = "CORINTHIANS" TIME2="PALMEIRAS" TIME3 = "SAO PAULO"
//TIME4="SANTOS" (CADEIA)
//PONTOS1, PONTOS2, PONTOS3, PONTOS4 (INTEIRO)
// USUARIO SÓ PODE RESPONDER G PARA GANHOU | P PARA PERDER | E PARA EMPATE ( CARACTER)
// SERÃO

programa
{
	
	funcao inicio()
	{
		cadeia corinthians, palmeiras, saoPaulo, santos
		inteiro rodada = 0 
		inteiro pontosFinalC = 0, pontosFinalP = 0 
		inteiro pontosFinalSp = 0, pontosFinalS = 0

		escreva("Grupo 05\n")
		
		para(rodada = 1 ; rodada <= 4 ; rodada ++){
			escreva("\nRodada ", rodada)
			escreva("\nQual o resultado do jogo do Corinthias? ")
			leia(corinthians)
			limpa()
			
			se(corinthians == "G" ou corinthians == "g"){
					pontosFinalC	+= 3
				}senao se(corinthians == "E" ou corinthians == "e"){
						pontosFinalC	+= 1
						}

			escreva("\nRodada ", rodada)
			escreva("\nQual o resultado do jogo do Palmeiras? ")
			leia(palmeiras)
			limpa()
			
			se(palmeiras == "G" ou palmeiras == "g"){
					pontosFinalP	+= 3
				}senao se(palmeiras == "E" ou palmeiras == "e"){
						pontosFinalP	+= 1
						}						

			escreva("\nRodada ", rodada)
			escreva("\nQual o resultado do jogo do São Paulo? ")
			leia(saoPaulo)
			limpa()
			
			se(saoPaulo == "G" ou saoPaulo == "g"){
					pontosFinalSp	+= 3
				}senao se(saoPaulo == "E" ou saoPaulo == "e"){
						pontosFinalSp	+= 1
						}

			escreva("\nRodada ", rodada)
			escreva("\nQual o resultado do jogo do Santos? ")
			leia(santos)
			limpa()
			
			se(santos == "G" ou santos == "g"){
					pontosFinalS	+= 3
				}senao se(santos == "E" ou santos == "e"){
						pontosFinalS	+= 1
						}

			
			}

			
		escreva("Grupo 05\n")				
		escreva("Os pontos finais do Corinthians após ",rodada - 1," rodadas é de: ",pontosFinalC)
		escreva("\n")	
		escreva("Os pontos finais do Palmeiras após ",rodada - 1," rodadas é de: ",pontosFinalP)
		escreva("\n")	
		escreva("Os pontos finais do São Paulo após ",rodada - 1," rodadas é de: ",pontosFinalSp)
		escreva("\n")	
		escreva("Os pontos finais do Santos após ",rodada - 1," rodadas é de: ",pontosFinalS)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1736; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */