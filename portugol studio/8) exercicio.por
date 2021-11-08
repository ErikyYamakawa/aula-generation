programa
{
	
	funcao inicio()
	{
		real custofabrica,custoconsumidor,distribuidor,impostos
		
		escreva("\n entre com o valor de custo de fabrica : ")
		leia(custofabrica) 
		
		distribuidor = (custofabrica *1.28)-custofabrica
		impostos = (custofabrica * 1.45)-custofabrica
		custoconsumidor = custofabrica + distribuidor + impostos

		escreva("\n o valor do carro para o consumidor e igual a : ",custoconsumidor, " reais")
		
		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */