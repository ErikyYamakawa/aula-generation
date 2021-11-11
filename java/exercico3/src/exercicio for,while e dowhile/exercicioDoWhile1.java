package exercicios;
import java.util.Scanner;

public class exercicioDoWhile1 {
	public static void main (String Args[]) {
		Scanner leia = new Scanner (System.in);
	
		System.out.println( "entre com um numero inteiro :");
		int	numero = leia.nextInt();
		int somaTotal = 0;
		
		do 
		{
			{
				somaTotal += numero;
				
			}
			System.out.println( "entre com um numero inteiro :");
			numero = leia.nextInt();
			
		}
		while(numero!=0);
		
		System.out.println("a Soma total dos numeros e de : " + somaTotal);
		
		}
			
		
		
		
		
		

}