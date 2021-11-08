programa
{
	
	funcao inicio()
	{
		inteiro dia,mes,ano,diasTotal
//escrever dias: do dia que voce nasceu para o dia de hoje. mes que estamos atualmente. e ano sua idade.
		escreva("\nescreva sua idade (somente em dias) ")
		leia(dia)
		escreva("\nescreva sua idade (somente em Mes) ")
		leia(mes)
		escreva("\nescreva sua idade (somente em ano) ")
		leia(ano)

		diasTotal=(dia+(ano*365)+(mes*30))

		escreva("\nminha idade em dia e ",diasTotal)
	}}
		
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