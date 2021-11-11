package exercicios;

import java.util.Arrays;

public class ArrayVetor {
	public static void main (String Args []) {
		
		String[] nomes = new String[] {"João","Gustavo ","Maria","Ana","Augusto"};
		
		
		
		System.out.println(" Nomes nao ordenados : ");
		for(String nome:nomes)
		{
			System.out.println(nome);	
		}
		
		System.out.println();
		
		Arrays.sort(nomes);
		System.out.println("Nomes ordenados :");
		for(String nome : nomes)
		{
			System.out.println(nome);
		}
		System.out.println();
		
		int[] numeros = new int[] {20,2,8,19,100,5,1,6,13};
		
		System.out.println("numeros nao ordenados");
		
		for(int numero:numeros)
		{
			System.out.println(numero);
		
		}
		
		System.out.println();
		Arrays.sort(numeros);
		System.out.println("numeros ordenados");
		
		for(int numero :numeros) {
			System.out.println(numero);
		}
		System.out.println();
		
		
	}

}
