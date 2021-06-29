programa
{
	
	funcao inicio()
	{
		cadeia carreta[] = {"Homem Aranha","Pantera Negra","Mulher Maravilha", "Dollynho", "Monica"}
		inteiro numPersonagem

		para(inteiro x=0; x < 5; x++){
			escreva(x," - ",carreta[x],"\n")
			
			
			}
		escreva("\n")
		escreva("Selecione um personagem de 0 a 4: ")
		leia(numPersonagem)
		escreva("\n")
		
		
		escreva(carreta[numPersonagem])
		escreva("\n")
		escreva("\n")
		para(inteiro x=4; x >= 0; x--){
			escreva(x," - ",carreta[x],"\n")
			
			
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */