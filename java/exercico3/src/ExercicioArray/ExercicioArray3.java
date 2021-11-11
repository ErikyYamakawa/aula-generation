package exercicios;

import java.util.Scanner;

public class ExercicioArray3 {
	public static void main(String Args[]) {
		
	
	int [][] numeros = new int[3][3];
	int linha,coluna,contNum=0;
	Scanner leia = new Scanner(System.in);
	
	for(linha=0;linha<3;linha++)
	{
		for(coluna=0;coluna<3;coluna++)
		{
			System.out.println("Entre com um valor");
			numeros[linha][coluna] = leia.nextInt();
			if (numeros[linha][coluna] >10) {
				contNum++;
			}
	
		}
		
			
	
	
	
	
	
		
	
	
}
	System.out.println("A quantidade de numero na Matriz e igual a : " + contNum);
	}
}

