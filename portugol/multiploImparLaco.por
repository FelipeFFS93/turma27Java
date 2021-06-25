programa
{
	
	funcao inicio()
	{
	  inteiro numero = 0
	  inteiro totalImparMultiplo3 = 0
	  real contador3Impar = 0.00
	  real media3Impar = 0.00
	  inteiro maiorNumero = 0

	  faca {
	  	escreva("Digite o numero : ")
	  	leia(numero)

	  	se(numero % 2 == 1 e numero % 3 == 0){
			totalImparMultiplo3 += numero
	  		contador3Impar++
	  		se (numero > maiorNumero){
	  			maiorNumero = numero
	  			}
	  		}
	  	
	  	
	  	}enquanto(numero !=0)

	  		media3Impar = totalImparMultiplo3 / contador3Impar
	  		escreva("Media dos numeros impares e multiplos de 3 é: ", media3Impar,"\n")
	  		escreva("O maior numero digitado foi: ", maiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */