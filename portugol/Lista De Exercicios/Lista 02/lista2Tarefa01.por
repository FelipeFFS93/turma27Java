/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu 
trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do
estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa 
que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso.
Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

programa
{
	
	funcao inicio()
	{
		real tomateK, excesso, multa

		escreva("Quantos quilos de tomates tem ai? ")
		leia(tomateK)	
		limpa()
		 
		se(tomateK > 50){
			excesso = tomateK-50
			multa = (tomateK-50) * 4
			escreva("Você trouxe:" + tomateK + "kg e tem: " + excesso + "kg em execesso e o valor da sua multa será: R$ " + multa)
			}senao{
				excesso = 0
				multa = 0
				escreva("Você trouxe:" + tomateK + "kg e tem: " + excesso + "kg em execesso e o valor da sua multa será: R$ " + multa)
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */