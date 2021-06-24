/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do 
processamento imprimir o salário total e o salário excedente.*/

programa
{
	
	funcao inicio()
	{
		real nHoras, nHorasE, salarioT, salarioE
		cadeia codigo

		escreva("Codigo do funcionario ")
		leia(codigo)
		escreva("Quantidades de horas trabalhadas ")
		leia(nHoras)
		limpa()
		
		se(nHoras > 50){
			nHorasE = nHoras - 50
			salarioT = (nHorasE * 20) + 500
			salarioE = nHorasE * 20

			escreva("Funcionario: " + codigo + "\nTrabalhou: " + nHoras + 
			" hrs \nE fez: " + nHorasE + " horas extras \nO salario total é R$ " +salarioT,
			" \nSendo que o valor de R$ ", salarioE, " é referente a horas extra")
			}senao{
				salarioT = nHoras * 10
				nHorasE = 0
				escreva("Funcionario: " + codigo + "\nSeu salário foi: R$ "
				+ salarioT + "\nQuantidade de horas extra de: " + nHorasE)
				}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */