programa
{
	
	funcao inicio()
	{
		cadeia aluno[4] /*= {"Felipe","Lucas","Pietro","Enzo"}*/
		inteiro notas[4] /*= {8,7,9,10}*/
		inteiro somaNota = 0
		real media = 0.0

		 para(inteiro i = 0; i <= 3; i++){
		 	escreva("Qual o nome do aluno? ")
		 	leia(aluno[i])
		 	escreva("\n")
		 	escreva("Qual a nota do aluno? ")
		 	leia(notas[i])
		 	escreva("\n")
		 	limpa()
		 	somaNota += notas[i]
		 	
		 	}

		para(inteiro i = 0; i <= 3; i++){
			escreva("Oi aluno: ", aluno[i], " \nSua nota foi: ", notas[i])
			 escreva("\n")
			 escreva("\n")
			}
			
			media = (somaNota / 4)
		 	escreva("A soma das notas dos alunos é : ", somaNota, "\nA media entre esses alunos é : ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */