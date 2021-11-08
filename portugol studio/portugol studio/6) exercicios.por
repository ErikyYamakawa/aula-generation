programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real y1,y2,x1,x2,D

		escreva("\nentre com o valor de x1 :")
		leia(x1)
		escreva("\nentre com o valor de x2 :")
		leia(x2)
		escreva("\nentre com o valor de y1 :")
		leia(y1)
		escreva("\nentre com o valor de y2 :")
		leia(y2)

		D= mat.raiz(mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2.0),2.0)
		escreva("\no valor da distancia entre dois pontos foi de : ",mat.arredondar(D,2))

		


		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */