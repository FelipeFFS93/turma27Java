/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes
 * , coletando dados sobre o salário e número de filhos. A prefeitura deseja 
 * saber:   
a) média do salário da população; feito
b) média do número de filhos; feito
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/

programa
{
	
	funcao inicio()
	{
		inteiro habitantes = 3
		inteiro filhos = 0, filhosTotal = 0, mediaFilhos = 0
		real salario = 0.00 , mediaSalario = 0.00, salarioTotal = 0.00
		real maiorSalario = 0.00 , salario100 = 0.00 , percentualPessoas
		real contadorHabitantes
		
		para(habitantes = 1;habitantes <= 3; habitantes++){
			escreva("Quantos filhos você tem? ")
			leia(filhos)
			escreva("Qual é o seu salário? ")
			leia(salario)
			limpa()

			salarioTotal += salario
			mediaSalario = salarioTotal / habitantes
			filhosTotal += filhos
			mediaFilhos = filhosTotal / habitantes

			se(salario > maiorSalario){
				maiorSalario = salario
				}

			se(salario <= 100.00){
				salario100 = salario100 + 1
				}
			}
			contadorHabitantes = habitantes - 1
			percentualPessoas = (salario100 * 100) / contadorHabitantes 

			escreva("A média de filhos para : ", contadorHabitantes, " habitantes é igual a: " , mediaFilhos)
			escreva("\n")
			escreva("A média de salario para : ", contadorHabitantes, " habitantes é igual a: " , mediaSalario)
			escreva("\n")
			escreva("O maior salario entre : ", contadorHabitantes, " habitantes é igual a ", maiorSalario)
			escreva("\n")
			escreva("O percentual de habitantes que ganham até R$ 100,00 é de: " ,percentualPessoas)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */