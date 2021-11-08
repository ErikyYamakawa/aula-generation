programa
{
	
	funcao inicio()
	{
		real numero1,numero2,resultado 
		inteiro op

		escreva("\nEntre com o primeiro numero :")
		leia(numero1) 
		escreva("\nEntre com o segundo numero :")
		leia(numero2)

		escreva("\n\t\tMenu de opções ")
		escreva("\n1 soma ")
		escreva("\n2 Diferença ")
		escreva("\n3 multiplicação" )
		escreva("\n4 divisão ")
		escreva("\nEscolha a sua opÇÃO ")
		leia(op)

		escolha(op)
		{
			caso 1:
			resultado = numero1+ numero2
			escreva("\nSoma: ",resultado)
			pare

			caso 2:
			resultado = numero1 - numero2
			escreva("\nsubtração ",resultado)
			pare

			caso 3: 
			resultado = numero1 * numero2
			escreva("\nMultiplicação ",resultado)
			pare

			caso 4: 
			se (numero2 == 0)
			{
			escreva("|n Nao é possivel dividir um numero por ZERO")
			}
			
			senao
			{
			resultado = numero1 / numero2
			escreva("\ndivisão ",resultado)
			}
			pare

			caso contrario :
			escreva("\nOpção invalida!!")
			
			
			
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */