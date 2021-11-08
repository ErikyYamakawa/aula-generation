programa
{
	
	funcao inicio()
	{
		inteiro hora,minutos,segundos,totaldesegundos

		escreva("\n total de segundos de duração ")
		leia(totaldesegundos)

		hora =(totaldesegundos / 60)/60
		minutos =((totaldesegundos / 60)/60 % 60)
		segundos =(((totaldesegundos / 60)%60)%60)

		escreva("\no total de horas utilizados foi de :",hora,"horas",minutos, "minutos" ,segundos,"segundos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */